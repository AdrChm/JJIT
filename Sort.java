import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.TreeSet;

// Program to sort lines of a file, line by line, and write to another.
// Input file is the first argument, output is the second.
public class Sort
{
    public static void main(String[] args)
    {
        BufferedReader input = null;
        PrintWriter output = null;
        try
        {
            if(args.length != 2)
                throw new IllegalArgumentException(
                        "There must be exactly two arguments: infile outfile");

            input = new BufferedReader(new FileReader("fileToRead.txt"));
            output = new PrintWriter(new FileWriter("fileToWrite.txt"));

            // The Set for sorting the lines
            TreeSet<String> lineSet = new TreeSet<>();

            // Read the lines into lineList.
            String currentLine;

            while ((currentLine = input.readLine()) != null)
                lineSet.add(currentLine);

            // Now output them in natural order
            Iterator<String> iterator = lineSet.iterator();

            while(iterator.hasNext())
                output.println(iterator.next());

        } // try
        catch (Exception exception)
        {
            System.err.println(exception);
        } // catch
        finally
        {
            try
            {
                if(input != null)
                    input.close();

            } // try
            catch (IOException exception)
            {
                System.err.println("Could not close the input " + exception);
            } // catch
            if(output != null)
            {
                output.close();
                if (output.checkError())
                    System.err.println("Something went wrong with the output");
            } // if
        } // finally
    } // main

} // class Sort