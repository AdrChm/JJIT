// Representation of a TV Host fronting the lottery TV programme.
public class TVHost extends Person
{
    // Constructor is given the person's name.
    public TVHost(String name)
    {
        super(name);
    } // TVHost

    @Override
    // Returns the name of the type of Person.
    public String getPersonType()
    {
        return "TV Host";
    } // getPersonType

    @Override
    // Returns the Person's current saying.
    public String getCurrentSaying()
    {
        return "Welcome, suckers!";
    } // getCurrentSaying

} // class TVHost
