import java.io.IOException;

// Program to count the number of bytes on the standard input
// and report it in the standard output.
// Each byte that occurs at least once is listed with its own count.
public class ByteCount
{
    public static void main(String[] args)
    {
        // There are only 256 different byte values.
        // Default initial values will be zero, which is what we want.
        int [] byteCountSoFar = new int[256];

        // The total number of bytes found so far.
        int allBytesCountSoFar = 0;
        try
        {
            int currentByte;
            while ((currentByte = System.in.read()) != -1 ) {
                allBytesCountSoFar++;
                byteCountSoFar[currentByte]++;
            } // while
        } // try
        catch (IOException exception)
        {
            System.err.println(exception);
        } // catch
        finally
        {
            try
            {
                System.in.close();
            } // try
            catch (IOException exception)
                {
                    System.err.println("Could not close input " + exception);
                } // catch
        } // finally

        // Report results.
        System.out.println("The number of bytes read was " + allBytesCountSoFar);
        for (int byteValue = 0; byteValue <= 255; byteValue++)
            if(byteCountSoFar[byteValue] != 0)
                System.out.println("Byte value " + byteValue + " occurred "
                                    + byteCountSoFar[byteValue] + " times");
    } // main

} // class ByteCount
