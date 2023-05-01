import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

// Program to read lines of a file, line by line, and write them in reverse
// order to another. Input file is the first argument, output is the second.
public class Reverse
{
    public static void main(String[] args)
    {
        BufferedReader input = null;
        PrintWriter output = null;
        try
        {
            if(args.length != 2)
                throw new IllegalArgumentException("There must be exactly two arguments: infile outfile");

            input = new BufferedReader(new FileReader(args[0]));
            output = new PrintWriter(new FileWriter(args[1]));

            // The list for storing the lines.
            List<String> lineList = new ArrayList<String>();

            // Read the lines into lineList.
            String currentLine;
            while ((currentLine = input.readLine()) != null)
                lineList.add(currentLine);

            // Now output them in reverse.
            for (int index = lineList.size() - 1; index >= 0; index--)
                output.println(lineList.get(index));

        } // try
        catch (IOException exception)
        {
            System.err.println();
        } // catch
        finally
        {
            try { if(input != null) input.close(); }
            catch (IOException exception)
            { System.err.println("Could not close the input " + exception); }
            if(output != null)
            {
                output.close();
                if(output.checkError())
                    System.err.println("Something went wrong with the output");
            } // if
        } // finally
    } // main

} // class Reverse