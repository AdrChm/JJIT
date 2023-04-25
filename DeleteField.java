import java.io.*;

// Program deletes a selected by user field from each input line.
// Field to be deleted is given as an input argument.
// Counting of fields starts from 1, each is separated by a tab.
// Class with go through given file and produce output in another.
public class DeleteField
{
    public static void main(String[] args)
    {
        BufferedReader input = null;
        PrintWriter output = null;

        try{
            if(args.length != 3)
                throw new DeleteFieldException("There must be exactly two arguments: infile, outfile, deleted field number");

            input = new BufferedReader(new FileReader(args[0]));
            output = new PrintWriter(new FileWriter(args[1]));
            final int fieldToDelete = Integer.parseInt(args[2]);

            String inputLine;

            while ((inputLine = input.readLine()) != null)
            {
                // Divide the line into fields using tab as delimiter.
                String[] fields = inputLine.split("\t");
                StringBuffer editedLine = new StringBuffer("");

                if(fields.length < fieldToDelete)
                    editedLine = new StringBuffer(inputLine);
                else
                {
                    // We build the new line in parts.
                    // Add the field before the one to be deleted.
                    for (int index = 0; index < fieldToDelete - 1 ; index++)
                        if(editedLine.toString().equals(""))
                            editedLine.append(fields[index]);
                        else
                            editedLine.append("\t").append(fields[index]);

                    // Add the fields after the one to be deleted.
                    for (int index = fieldToDelete; index < fields.length; index++)
                        if (editedLine.toString().equals(""))
                            editedLine.append(fields[index]);
                        else
                            editedLine.append("\t").append(fields[index]);
                } // else

                System.out.println(editedLine.toString());
                output.print(editedLine.toString() + "\n");

            } // while

        } // try
        catch (DeleteFieldException exception)
        {
            // We report DeleteFieldException to standard output.
            System.out.println(exception.getMessage());

        } // catch
        catch (IOException exception)
        {
            // Other exceptions go to standard error.
            System.out.println(exception);

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
                System.err.println("Could not close the input" + exception);
            } // catch

            if(output != null)
            {
                output.close();
                if(output.checkError())
                    System.err.println("Something went wrong with the output");
            } // if

        } // finally

    } // main

} // class DeleteField
