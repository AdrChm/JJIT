import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

// Sort lines of text and saves the result into another file.
public class Sort
{
    // Initial size of the array.
    private static final int INITIAL_ARRAY_SIZE = 2;

    // Array resize factor.
    private static final int ARRAY_SIZE_FACTOR = 2;

    // Array of lines from the file.
    private static String [] array = new String[INITIAL_ARRAY_SIZE];
    private static int elementsAdded = 0;

    public static void main(String[] args)
    {
        BufferedReader input = null;
        PrintWriter output = null;
        try {
            input = new BufferedReader(new FileReader("fileToRead.txt"));
            String nextLine;

            while ((nextLine = input.readLine()) != null)
            {
                System.out.println(nextLine);
                addElement(nextLine);
            } // while

            Arrays.sort(array, 0, elementsAdded);
            output = new PrintWriter(new FileWriter("fileToWrite.txt"));

            for (int index = 0; index < elementsAdded; index++)
                output.println(array[index]);

            if(output.checkError())
                throw new IOException("Something wrong with the output file ");
            output.close();

        } // try
        catch (IOException exception)
        {
            System.err.println("Some file problem " + exception.getMessage());
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

    // Helper method to extend array if needed
    private static void addElement(String element)
    {
        // Extending array once it's full
        if(elementsAdded == array.length)
        {
            String [] extendedArray = new String[array.length * ARRAY_SIZE_FACTOR];
            System.arraycopy(array, 0, extendedArray, 0, array.length);
            array = extendedArray;
        } // if

        array[elementsAdded] = element;
        elementsAdded++;

    } // addElement

} // class Sort
