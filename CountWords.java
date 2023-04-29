import java.io.IOException;
import java.io.InputStreamReader;

// Class to count non-white space sequence of characters.
// Each sequence (even single character) is counted as one word
// Output ot the program is number of words found in given input stream.
public class CountWords
{
    public static void main(String[] args)
    {
        // Number of words found so fart.
        int numberOfWordsSoFar = 0;

        // Value of currently read character
        int nextCharacterValue = 0;

        // Describes if previous character was part of the word.
        boolean isPartOfAWord = false;
        // To read the input as characters.
        InputStreamReader input = new InputStreamReader(System.in);

        try {
            while ((nextCharacterValue = input.read()) != -1)
            {

                // If not a while space, a new word begins or previously started continues
                if (!Character.isWhitespace((char) nextCharacterValue))
                {
                    // No continuation of a word, new one discovered.
                    // Worth noting: word is counted at its beginning.
                    if (!isPartOfAWord) {
                        isPartOfAWord = true;
                        numberOfWordsSoFar++;
                    } // if
                } // if
                else
                {
                    // End of a word or another white space character
                    // Once non-white space character appears new word will be counted.
                    isPartOfAWord = false;
                } // else

            } // while
            System.out.println("Found: " + numberOfWordsSoFar + " words");
        } // try
        catch (IOException exception)
        {
            System.err.println("Error while reading the input" + exception);
        } // catch
        finally
        {
            try
            {
                input.close();
            } // try
            catch (IOException exception)
            {
                System.err.println("Could not close the input stream!");
            } // catch
        } // finally
    } // main

} // class CountWords
