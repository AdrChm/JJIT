import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Program to add a line number to the lines from the standard input
// and show the result on the standard output.
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
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            // Now copy input to output, adding line numbers.
            int noOfLinesReadSoFar = 0;
            String currentLine;
            while((currentLine = input.readLine()) != null)
            {
                noOfLinesReadSoFar++;
                System.out.printf(LINE_FORMAT, noOfLinesReadSoFar, currentLine);
            } // while
        } // try
        catch (IOException exception)
        {
            System.err.println(exception);
        } // catch
        finally
        {
            try{ input.close(); }
            catch (IOException exception)
            { System.err.println("Could not close the input"); }
        } // finally
    } // main

} // class LineNumber
