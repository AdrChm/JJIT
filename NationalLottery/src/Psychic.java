// Representation of a psychic entertainer for the lottery.
public class Psychic extends Person
{
    // Constructor is given the person's name.
    public Psychic(String name)
    {
        super(name);
    } // Psychic

    @Override
    // Returns the name of the type of Person.
    public String getPersonType()
    {
        return "Psychic";
    } // getPersonType

    @Override
    // Returns the Person's current saying.
    public String getCurrentSaying()
    {
        return "I can see someone very happy!";
    } // getCurrentSaying

} // class Psychic