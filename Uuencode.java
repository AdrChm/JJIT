import java.io.FileInputStream;
import java.io.IOException;

// Program to encode binary files into ASCII characters.
// Read bytes from input file and prints on standard output.
public class Uuencode
{

    public static void main(String[] args)
    {
        FileInputStream input = null;
        try
        {

            if(args.length != 1)
                throw new IllegalArgumentException("Only input file argument is required!");

            // As there is no clear way to read line of bytes input will be assumed to be characters (-1 .. 255)
            // to extract each line separately
            input = new FileInputStream((args[0]));
            int inputByte;

            // Output line.
            int [] lineBytes = new int[45];
            int lineByteCounter = 0;

            while ((inputByte = input.read()) != -1)
            {
                lineBytes[lineByteCounter] = inputByte;

                // When line capacity is reached.
                if(lineByteCounter == 44)
                {
                    printLine(lineBytes, lineByteCounter);
                    lineByteCounter = -1;
                    System.out.println();
                } // if

                lineByteCounter++;
            } // while


            // Producing last line.
            if(lineByteCounter != 0)
            {
                printLine(lineBytes, lineByteCounter);
                lineByteCounter = 0;
                System.out.print("\n`");
            } // if
            else
            System.out.print("`");

        } // try
        catch (IOException exception)
        {
            System.err.println(exception.getMessage());
        } // catch
        finally
        {
            try{
                input.close();
            } catch (IOException exception) {
                System.err.println("Could not close the input stream " + exception.getMessage());
            } // catch
        } // finally
    } // main

    // Write a single result byte as a printable character.
    // Each byte is 6-bit, i.e. range 0..63.
    // Thus adding 32 makes it printable, except for 0 which would become space
    // and so we add 96 instead -- a left single quote (').
    private static void writeByteAsChar(int thisByte)
    {
        System.out.print((char) (thisByte == 0 ? 96: thisByte + 32));
    } // writeByteAsChar

    // Produce output line of encoded data
    private static void printLine(int [] lineBytes, int lineByteCounter)
    {
        if(lineByteCounter == 44)
            lineByteCounter++;

        // Number of bytes in last group in the line.
        int addition = 0;
        if (lineByteCounter % 3 == 2)
        {
            lineBytes[lineByteCounter] = 0;
            addition++;
        } // if
        else if (lineByteCounter % 3 == 1)
        {
            lineBytes[lineByteCounter] = 0;
            lineBytes[lineByteCounter + 1] = 0;

            addition += 2;

        } // else if

        writeByteAsChar(lineByteCounter);
        // Converting bytes into 6 bit values
        for (int byteGroupIndex = 0; byteGroupIndex < lineByteCounter + addition; byteGroupIndex += 3)
        {
            // Calculate 4 result bytes from the 3 input bytes.
            int byte1 = lineBytes[byteGroupIndex] >> 2;
            int byte2 = (lineBytes[byteGroupIndex] & 0x3) << 4
                    | (lineBytes[byteGroupIndex + 1] >> 4);
            int byte3 = (lineBytes[byteGroupIndex + 1] & 0xf) << 2
                    | (lineBytes[byteGroupIndex + 2] >> 6);
            int byte4 = lineBytes[byteGroupIndex + 2] & 0x3f;

            // Now write those result bytes.
            writeByteAsChar(byte1);
            writeByteAsChar(byte2);
            writeByteAsChar(byte3);
            writeByteAsChar(byte4);

        } // for

    } // printLine

} // class Uuencode
