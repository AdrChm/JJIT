import java.io.*;
import java.util.HashSet;

public class DuplicateVotes
{
    public static void main(String[] args)
    {
        BufferedReader input = null;
        PrintWriter output = null;

        try
        {
            input = new BufferedReader(new FileReader(args[0]));
            output = new PrintWriter(new FileWriter(args[1]));

            if(args.length != 2)
                throw new IllegalArgumentException("Program requires tow arguments: Input file, output file");

            // HashSet to keep voters.
            HashSet<String> voters = new HashSet<>();

            // Duplicates found.
            int duplicatesFound = 0;

            String nextLine;
            while ((nextLine = input.readLine()) != null)
            {
                if(!voters.add(nextLine))
                {
                    duplicatesFound++;
                    output.println(nextLine);
                } // else

                // Skipping time stamp line.
                input.readLine();

            } // while
            output.println("There " + (duplicatesFound == 1 ? "was " : "were ") + duplicatesFound + " duplicate votes");
        } // try
        catch (IOException exception)
        {
            System.err.println("Input file exception" + exception);
        } // catch
        finally
        {
            try
            {
                if(input != null)
                    input.close();

                if(output != null && output.checkError())
                    throw new IOException("Error of output file!");
                output.close();

            } // try
            catch (IOException exception)
            {
                System.err.println("Input stream closing error" + exception);
            }   // catch
        }

    } // main

} // class DuplicateVotes
