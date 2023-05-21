import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;

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

            // TreeMap to keep voters.
            // I really don't like the requirements of the solution.
            TreeMap<String, VoterRecord> voters = new TreeMap<>();

            String voterData;
            String timeAndLocation;
            while ((voterData = input.readLine()) != null)
            {
                timeAndLocation = input.readLine();

                if(!voters.containsKey(voterData))
                {
                    voters.put(voterData, new VoterRecord(voterData));
                    voters.get(voterData).addVote(timeAndLocation);
                }
                else
                {
                    voters.get(voterData).addVote(timeAndLocation);
                    output.print(voters.get(voterData));
                } // else
            } // while

            // Duplicates calculation, another downgrade comparing with previous solution,
            // but we do what requirements say to do.
            int duplicatesFound = 0;
            for (String voter: voters.keySet())
                if(voters.get(voter).numberOfVotes() != 1)
                    duplicatesFound += voters.get(voter).numberOfVotes() - 1;

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
