import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Program to translate a document from one language to another.
// Translation dictionary file is first argument.
// Input file is the second argument, output is the third.
public class Translate
{
    // The main method reads lines from the dictionary and stores them,
    // via the Dictionary constructor. Then it reads lines from the input file,
    // translates each word and writes it to the output file.
    public static void main(String[] args)
    {
        BufferedReader input = null;
        PrintWriter output = null;
        try
        {
            if(args.length != 3)
                throw new IllegalArgumentException
                            ("There must be exactly three arguments: dictfile infile outfile");

            // The dictionary.
            Dictionary dictionary = new Dictionary(new BufferedReader(new FileReader(args[0])));

            input = new BufferedReader(new FileReader(args[1]));
            output = new PrintWriter(new FileWriter(args[2]));

            // Read the lines and translate each word.
            String currentLine;
            while ((currentLine = input.readLine()) != null)
            {
                String wordDelimiter = "";
                for (String word : currentLine.split(" "))
                {
                    output.print(wordDelimiter);
                    if (! word.equals(""))
                        output.print(dictionary.translateWord(word));
                    wordDelimiter = " ";
                } // for
                output.println();
            } // while
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
                System.err.println("Could not close input " + exception);
            } // catch
            if (output != null)
            {
                if (output.checkError())
                    System.err.println("Something went wrong with the output");
            } // if
        } // finally
    } // main

} // class Translate
