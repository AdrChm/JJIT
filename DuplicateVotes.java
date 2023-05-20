import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

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

            // HashMap to keep voters.
            HashMap<String, String> voters = new HashMap<>();

            // Duplicates found.
            int duplicatesFound = 0;

            String voter;
            String timeAndLocation;
            while ((voter = input.readLine()) != null)
            {
                timeAndLocation = input.readLine();

                if(voters.get(voter) == null)
                    voters.put(voter, timeAndLocation);
                else
                {
                    duplicatesFound++;
                    output.println(voter);
                    output.println("\tDuplicate: " + timeAndLocation);
                    output.println("\tFirst occurrence: " + voters.get(voter));
                } // else

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
