// A word form one language, paired with the equivalent one from another.
public class DictionaryEntry extends Pair<String, String>
                             implements Comparable<DictionaryEntry>
{
    // Constructor is given the words.
    public DictionaryEntry(String sourceLanguageWord, String targetLanguageWord)
    {
        super(sourceLanguageWord,targetLanguageWord);
    } // DictionaryEntry

    // Return negative if this first word is less that other's first word,
    // zero if they are the same, or positive if this one is greater.
    @Override
    public int compareTo(DictionaryEntry other)
    {
        return getFirst().compareTo(other.getFirst());
    } // compareTo

    // Returns true if and only if this and other have the same first word.
    // Unless other is not a DictionaryEntry,
    // in which case delegate to superclass.
    @Override
    public boolean equals(Object other)
    {
        if (other instanceof DictionaryEntry)
            return compareTo((DictionaryEntry) other) == 0;
        else
            return super.equals(other);
    } // equals

} // class DictionaryEntry
