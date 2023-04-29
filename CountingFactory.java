// Create instances of ObjectType and count them.
public class CountingFactory<ObjectType>
{
    // The number of instances made so far.
    private int constructionCountSoFar = 0;

    // Empty constructor, nothing needs doing.
    public CountingFactory()
    {
    } // CountingFactory

    // Return the number of objects that have been made up to now.
    public int getConstructionCountSoFar()
    {
        return constructionCountSoFar;
    } // getConstructionCountSoFar


    /* Commented out for project maintainability
    // Create an ObjectType and count it.
    public ObjectType newObject()
    {
        constructionCountSoFar++;
        return new ObjectType();
    } // newObject
    */
} // class CountingFactory