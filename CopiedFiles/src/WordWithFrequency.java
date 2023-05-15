// A pairing of a word with its frequency so far.
public class WordWithFrequency
{
    // The word, occurrences of which are being conducted.
    private final String word;

    // The frequency count of this word so far.
    private int frequencySoFar;

    // Create a pairing with the given word, and frequency of one.
    public WordWithFrequency(String requiredWord)
    {
        word = requiredWord;
        frequencySoFar = 1;
    } // WordWithFrequency

    // Count another occurrences of this word.
    public void incrementFrequency()
    {
        frequencySoFar++;
    } // incrementFrequency

    // A String showing the word and its frequency.
    @Override
    public String toString()
    {
        return word + " " + frequencySoFar;
    } // toString

} // class WordWithFrequency