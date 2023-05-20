// A pairing of a word with its frequency so far.
public class WordWithFrequency implements Comparable<WordWithFrequency>
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

    // Compare this with the given other, returning negative, zero or positive.
    // Order first on descending frequency, then on ascending word.
    @Override
    public int compareTo(WordWithFrequency other)
    {
        if(frequencySoFar != other.frequencySoFar)
            return other.frequencySoFar - frequencySoFar;
        else
            return word.compareTo(other.word);
    } // compareTo

    // Return true if and only if the given object is equivalent to this one.
    @Override
    public boolean equals(Object other)
    {
        if(other instanceof WordWithFrequency)
            return compareTo((WordWithFrequency) other) == 0;
        else
            return super.equals(other);
    } // equals

    // A hash code for this object: equivalent one has the same hash code.
    @Override
    public int hashCode()
    {
        return frequencySoFar * 31 + word.hashCode() * 37;
    } // hashCode

} // class WordWithFrequency