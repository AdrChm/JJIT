// representation of an audience member watching the lottery.
public class AudienceMember extends Person
{
    // Constructor is given the person's name.
    public AudienceMember(String name)
    {
        super(name);
    } // AudienceMember

    @Override
    // Returns the name of the type of Person.
    public String getPersonType()
    {
        return "Audience Member";
    } // getPersonType

    @Override
    // Returns the Person's current saying.
    public String getCurrentSaying()
    {
        return "Oooooh!";
    } // getCurrentSaying

} //  class AudienceMember
