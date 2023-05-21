import java.util.Collection;
import java.util.TreeMap;

// A map from word to WordWithFrequency.
public class WordFrequencyMap
{
    // The map uses a TreeMap, so that we can obtain the values in natural
    // ordering of the keys. I.e., in order by word.
    private final TreeMap<String, WordWithFrequency>
        wordMappedToWoWithFrequency = new TreeMap<String, WordWithFrequency>();

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

    // Show the words and frequencies in word order.
    @Override
    public String toString()
    {
        // Obtain the WordWithFrequency values in word iterable order.
        Collection<WordWithFrequency> wordWithFrequencyValues
                = wordMappedToWoWithFrequency.values();

        String result = "";
        for (WordWithFrequency wordWithFrequency: wordWithFrequencyValues)
            result += String.format("%s%n", wordWithFrequency);

        return result;
    } // toString

} // class WordFrequencyMap