// Two objects grouped into a pair.
public class Pair
{
    // The two objects.
    private final Object first, second;

    // The constructor is given the two objects.

    public Pair(Object requiredFirst, Object requiredSecond)
    {
        first = requiredFirst;
        second = requiredSecond;
    } // Pair

    // Returns the first object.
    public Object getFirst()
    {
        return first;
    } // getFirst

    // Returns the second object.
    public Object getSecond()
    {
        return second;
    } // getSecond

} // class Pair