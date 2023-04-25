import java.io.*;

// Program to add a line number to the lines from an input file
// and produce the result in an output file.
// The two file names are given as command line arguments.
// If a filename is missing, or is "-", then standard input/output is used.
public class LineNumber
{
    // The minimum number of digits in a line number.
    private static final int MINIMUM_LINE_NUMBER_DIGITS = 5;

    // The format to use with printf for the line number and line.
    private static final String LINE_FORMAT
           = "%0" + MINIMUM_LINE_NUMBER_DIGITS + "d %s%n";

    // Read each line from input, and copy to the output with a count.
    public static void main(String[] args)
    {
        BufferedReader input = null;
        PrintWriter output = null;
        try
        {
            // Check for too many arguments before opening files, is case wrong names.
            if(args.length > 2)
                throw new LineNumberException("Too many arguments ");

            if(args.length < 1 || args[0].equals("-"))
                input = new BufferedReader(new InputStreamReader(System.in));
            else
                input = new BufferedReader(new FileReader(args[0]));

            if(args.length < 2 || args[1].equals("-"))
                output = new PrintWriter(System.out, true);
            else
            {
                if(new File(args[1]).exists())
                    throw new LineNumberException("Output file " + args[1] + " already exists");
                output = new PrintWriter(new FileWriter(args[1]));
            } // else

            // Now copy input to output, adding line numbers.
            int noOfLinesReadSoFar = 0;
            String currentLine;
            while((currentLine = input.readLine()) != null)
            {
                noOfLinesReadSoFar++;
                output.printf(LINE_FORMAT, noOfLinesReadSoFar, currentLine);
            } // while
        } // try
        catch (LineNumberException exception)
        {
            // We report LineNumberExceptions to standard output.
            System.out.println(exception.getMessage());
        } // catch
        catch (IOException exception)
        {
            // Other exceptions go to standard error.
            System.out.println(exception);
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

} // class LineNumber
