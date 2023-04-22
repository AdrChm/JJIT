import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// Program to read all the bytes from the program and output single number
// as it's BSD check sum representation.
public class CheckSum
{
    public static void main(String[] args)
    {
        int checkSum = 0;
        int currentByte;
        try
        {
            while ((currentByte = System.in.read()) != -1)
            {
                checkSum = BSDRotation(checkSum) + currentByte;

                // Preventing exceeding 16 bit values.
                if (checkSum >= 65536)
                    checkSum -= 65536;

            } // while
            System.out.println(checkSum);
            System.out.println();

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

    } // main

    // Private method to rotate first 16 bits of the number to right by 1.
    private static int BSDRotation(int number)
    {
        // Takes 16 least important bits and shifts them.
        if(number % 2 == 1)
            return number / 2 + (int) Math.pow(2,15);
        else
            return number / 2;

    } // BSDRotation

} // class CheckSum
