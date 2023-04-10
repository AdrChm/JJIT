// Representation of a person involved in the lottery
// who can change their happiness state.
public abstract class MoodyPerson extends Person
{
    // The state of the Person's happiness.
    private boolean isHappyNow;

    public MoodyPerson(String name, boolean initialHappiness)
    {
        super(name);
        isHappyNow = initialHappiness;
    } // MoodyPerson

    // Alternative constructor is given the person's name
    // and initial happiness is assumed to be true.
    public MoodyPerson(String name)
    {
        this(name, true);
    } // MoodyPerson

    // Returns whether or not the Person is happy.
    public boolean isHappy()
    {
        return isHappyNow;
    } // isHappy

    // Sets the happiness of the person to the given state.

    public void setHappy(boolean happyNow)
    {
        isHappyNow = happyNow;
    } // setHappy

} // class MoodyPerson
