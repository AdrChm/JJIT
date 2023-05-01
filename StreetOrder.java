import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Program to sort elements to be delivered at some street.
// Two arguments are required: input file, output file.
// Input file is delivery recipient with his address street number.
// Recipient and address are assumed to be separated by tab.
// The output file contains the same elements, but in sorted order.
// Program assumes the number of address is less than 10.
// Also address number must start from 1 and have each subsequent number.
public class StreetOrder
{

    public static void main(String[] args)
    {
        BufferedReader input = null;
        PrintWriter output = null;

        try
        {
            if(args.length != 2)
                throw new IllegalArgumentException("There must be two arguments: source file and target file");

            input = new BufferedReader(new FileReader(args[0]));
            output = new PrintWriter(new FileWriter(args[1]));

            // Populating the list.
            String inputLine;
            ArrayList<DeliveryHouseDetails> lines = new ArrayList<DeliveryHouseDetails>();
            int nextHouseNumber = 1;
            while ((inputLine = input.readLine()) != null)
            {
                lines.add(new DeliveryHouseDetails(nextHouseNumber, inputLine));
                System.out.println(inputLine);
                nextHouseNumber++;
            } // while

            // Natural ordering assumed - by the number
            lines.sort(null);

            for (int index = 0; index < lines.size(); index++)
            {
                output.println(lines.get(index).getDeliveryDetails());
            } // for

        } // try
        catch (IOException exception)
        {
            System.err.println(exception);
        } // catch
        finally
        {
            try
            {
                if(input != null)
                    input.close();

                if(output == null || output.checkError())
                    throw new IOException("Something wrong with the output stream");
                output.close();
            } //try
            catch (IOException exception)
            {
                System.err.println("Something wrong with the input file");
            } // catch
        } // finally

    } // main

} // class StreetOrder