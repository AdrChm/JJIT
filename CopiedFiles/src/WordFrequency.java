import java.io.FileReader;
import java.io.IOException;

// Read a text document from the file named by the first argument,
// and report frequency count of each word on standard output.
public class WordFrequency
{
    public static void main(String[] args)
    {
        // We see the data as a character stream.
        FileReader input = null;
        try
        {
            if(args.length != 1)
                throw new IllegalArgumentException
                        ("There must be exactly one argument: input-file");

            input = new FileReader(args[0]);

            // A store of all the words found so far.
            WordFrequencyMap wordFrequencyMap = new WordFrequencyMap();

            // Remember whether we are reading a word of characters between words.
            boolean currentGroupIsAWord = false;

            // The group of characters we are currently reading.
            String currentGroup = "";

            int currentCharAsInt;
            while ((currentCharAsInt = input.read()) != -1)
            {
                char currentChar = (char) currentCharAsInt;

                // We change group if the kind of the current character
                // is not the same as the kind of the current group.
                if((Character.isLetter(currentChar) || currentChar == '\'')
                        != currentGroupIsAWord)
                {
                    // We are starting a new group.
                    if(currentGroupIsAWord)
                        wordFrequencyMap.countWord(currentGroup.toLowerCase());
                    currentGroup = "";
                    currentGroupIsAWord = !currentGroupIsAWord;
                } // if
                // Whether new or old group, add the current character to it.
                currentGroup += currentChar;
            } // while

            // We have a trailing word if the last character was a letter or '.
            if(currentGroupIsAWord && ! currentGroup.equals(""))
                wordFrequencyMap.countWord(currentGroup.toLowerCase());

            // The toString of wordFrequencyMap already has a nwe line at the end.
            System.out.println(wordFrequencyMap);
        } // try
        catch (Exception exception)
        {
            System.err.println(exception);
        } // catch
        finally
        {
            try { if(input != null) input.close(); }
            catch (IOException exception)
                { System.err.println("Could not close input " + exception); }
        } // finally
    } // main

} // class WordFrequency
