import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

// Reads a translation dictionary from a given BufferedReader,
// and provides a translateWord method.
public class Dictionary
{
    // We store the DictionaryEntries in a partially filled array,
    // and use array extension as required.
    // The initial size and resize factor of that array.
    private static final int INITIAL_ARRAY_SIZE = 50, ARRAY_RESIZE_FACTOR = 2;

    // The array for storing the entries, and a count of the number of them.
    private final DictionaryEntry[] dictionaryEntries;
    private final int noOfDictionaryEntries;

    // Read lines from given BufferedReader, split each into tab separated
    // pairs, create a DictionaryEntry for it and add to dictionaryEntries.
    public Dictionary(BufferedReader input) throws IOException, RuntimeException
    {
        DictionaryEntry[] dictionaryEntriesSoFar = new DictionaryEntry[INITIAL_ARRAY_SIZE];
        int noOfDictionaryEntriesSoFar = 0;
        String currentLine;
        while((currentLine = input.readLine()) != null)
        {
            String[] lineInParts = currentLine.split("\t");
            DictionaryEntry dictionaryEntry = new DictionaryEntry(lineInParts[0], lineInParts[1]);
            if (noOfDictionaryEntriesSoFar == dictionaryEntriesSoFar.length)
                dictionaryEntriesSoFar = Arrays.copyOf(dictionaryEntriesSoFar,
                        dictionaryEntriesSoFar.length * ARRAY_RESIZE_FACTOR);
            dictionaryEntriesSoFar[noOfDictionaryEntriesSoFar] = dictionaryEntry;
            noOfDictionaryEntriesSoFar++;
        } // while

        // Sort the array to allow for efficient searching of it.
        Arrays.sort(dictionaryEntriesSoFar, 0, noOfDictionaryEntriesSoFar);
        noOfDictionaryEntries = noOfDictionaryEntriesSoFar;
        dictionaryEntries = dictionaryEntriesSoFar;

    } // Dictionary

    // Translate one word.
    public String translateWord(String word)
    {
        int dictionaryEntryIndex = SearchArray.search(dictionaryEntries, noOfDictionaryEntries,
                                                new DictionaryEntry(word, null));
        if (dictionaryEntryIndex < 0)
            return  "[" + word + "]";
        else
            return dictionaryEntries[dictionaryEntryIndex].getSecond();
    } // translateWord

} // class Dictionary
