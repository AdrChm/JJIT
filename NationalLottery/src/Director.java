// Representation of a director of the lottery company.
public class Director extends Person
{
    // Constructor is given the person's name.
    public Director(String name)
    {
        super(name);
    } // Director

    // Returns the name of the type of Person.
    public String getPersonType()
    {
        return "Director";
    } // getPersonType

    // Returns the Person's current saying.
    public String getCurrentSaying()
    {
        return "Tis business is MY pleasure";
    } // getCurrentSaying
} // class Director
