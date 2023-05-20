import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

// A map from word to WordWithFrequency.
public class WordFrequencyMap
{
    // The map uses a HashMap to efficiently store the WordWithFrequency objects.
    private final Map<String, WordWithFrequency>
        wordMappedToWoWithFrequency = new HashMap<String, WordWithFrequency>();

    // Empty constructor, nothing needs doing.
    public WordFrequencyMap()
    {
    } // WordFrequencyMap

    // Count an occurrence of the given word by either incrementing the
    // frequency of an existing WordWithFrequency or creating a new one if
    // this is the first occurrence of the word.
    public void countWord(String word)
    {
        WordWithFrequency wordWithFrequency =
                wordMappedToWoWithFrequency.get(word);
        if(wordWithFrequency != null)
            wordWithFrequency.incrementFrequency();
        else
        {
            wordWithFrequency = new WordWithFrequency(word);
            wordMappedToWoWithFrequency.put(word, wordWithFrequency);
        } // else
    } // countWord

    // Show the words and frequencies in frequency order.
    @Override
    public String toString()
    {
        // Obtain the WordWithFrequency values in an unpredictable order,
        // and put them into a TreeSet so we can extract them in frequency order.
        TreeSet<WordWithFrequency> wordWithFrequencyValues
                = new TreeSet<WordWithFrequency>(wordMappedToWoWithFrequency.values());

        String result = "";
        for (WordWithFrequency wordWithFrequency: wordWithFrequencyValues)
            result += String.format("%s%n", wordWithFrequency);

        return result;
    } // toString

} // class WordFrequencyMap