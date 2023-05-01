import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

            // The list for storing the lines.
            List<String> lineList = new ArrayList<String>();

            // Read the lines into lineList.
            String currentLine;

            while ((currentLine = input.readLine()) != null)
                lineList.add(currentLine);

            // Sort lineList
            Collections.sort(lineList);

            for (int index = 0; index < lineList.size(); index++)
                output.println(lineList.get(index));

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