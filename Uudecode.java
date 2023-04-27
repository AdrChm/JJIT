import java.io.*;

// Program to file encoded in Base-64 format.
public class Uudecode
{


    public static void main(String[] args)
    {
        try
        {
            if(args.length != 1)
                throw new IllegalArgumentException("Only name of the file is required!");

            BufferedReader input = new BufferedReader(new FileReader(args[0]));
            String nextLine;
            while ((nextLine = input.readLine()) != null)
            {
                char [] bytes = nextLine.toCharArray();
                decodeLine(bytes);
            } // while
        } // try
        catch (IOException exception)
        {
            System.err.println();
        } // catch
        finally
        {

        } // finally

    } // main

    // Reads "short" bytes and changes its value if '`' is found
    private static int readByte(int shortByte)
    {
        // end of file or last element of the file.
        if(shortByte == 96)
            return 0;
        // Return to encoded value
        else
            return shortByte -= 32;
    } // readByte

    // Decode each line.
    private static void decodeLine(char [] bytes)
    {
        // The most common case, with correct amount of elements.
        if(bytes.length > 1)
        {
            // Number of elements unless is last line
            int bytesNumber = bytes[0] - 32;

            for (int index = 1; index < bytes.length; index += 4)
            {
                int byte1 = readByte(bytes[index]) << 2 | readByte(bytes[index + 1]) >> 4;
                int byte2 = (readByte(bytes[index + 1]) & 0xf) << 4 | readByte(bytes[index + 2]) >> 2;
                int byte3 = (readByte(bytes[index + 2]) & 0x3) << 6 | readByte(bytes[index + 3]);
                System.out.print((char) byte1 + "" + (char)byte2 + "" +(char)byte3);
            } // for

        } // if
        // Number of elements is one less and characters number could be extended (by 1 or 2)
        else if(bytes.length < 1)
        {
            // Number of elements unless is last line
            System.out.println("yeah");
        } // else if
        // Only one character - end of file
    } // decodeLine

} // class Uudecode
