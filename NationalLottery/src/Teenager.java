// Representation of a teenager.
public class Teenager extends MoodyPerson
{
    // The state of the person's happiness.
    public Teenager(String name)
    {
        super(name, false);
    } // Teenager

    @Override
    // Returns the name of the type of Person.
    public String getPersonType()
    {
        return "Teenager";
    } // getPersonType

    @Override
    // Returns the Person's current saying.
    public String getCurrentSaying()
    {
        if(isHappy())
            return "Isn't life wonderful?";
        else
            return "It's not fair!";
    } // getCurrentSaying

} // class Teenager
