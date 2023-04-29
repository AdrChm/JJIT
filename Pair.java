// Two objects grouped into a pair.
public class Pair <FirstType, SecondType>
{
    // The first object.
    private final FirstType first;

    // The second object.
    private final SecondType second;

    // The constructor is given the two objects.
    public Pair(FirstType requiredFirst, SecondType requiredSecond)
    {
        first = requiredFirst;
        second = requiredSecond;
    } // Pair

    // Returns the first object.
    public FirstType getFirst()
    {
        return first;
    } // getFirst

    // Returns the second object.
    public SecondType getSecond()
    {
        return second;
    } // getSecond

} // class Pair