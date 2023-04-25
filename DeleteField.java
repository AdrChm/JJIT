import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

// Program deletes a selected by user field from each input line.
// User enters the number of field to bew deleted as input argument.
// Counting of fields starts from 1, each is separated by a tab.
public class DeleteField
{
    public static void main(String[] args)
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try{
            final int fieldToDelete = Integer.parseInt(args[0]);
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
                    for (int index = 0; index < fieldToDelete -1 ; index++)
                        if(editedLine.toString().equals(""))
                            editedLine.append(fields[index]);
                        else
                            editedLine.append("\t").append(fields[index]);

                    // Add the fields after the one to be deleted.
                    for (int index = fieldToDelete; index < fields.length; index++)
                        if (editedLine.equals(""))
                            editedLine.append(fields[index]);
                        else
                            editedLine.append("\t").append(fields[index]);
                } // else

                System.out.println(editedLine.toString());
            } // while

        } // try
        catch (IOException exception)
        {

        } // catch
        finally
        {
            try
            {
                input.close();
            } // try
            catch (IOException exception)
            {
                System.err.println("Could not close the input" + exception);
            } // catch
        } // finally

    } // main

} // class DeleteField
