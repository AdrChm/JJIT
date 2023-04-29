// Representation of a group of moody people participating in national lottery.
public class MoodyGroup<PersonType extends MoodyPerson>
{
    // Initial size of the group.
    private static final int INITIAL_GROUP_SIZE = 2;

    // Array resize factor.
    private static final int GROUP_RESIZE_FACTOR = 2;

    // Array to keep moody people in the group.
    private MoodyPerson [] moodyPeople = new MoodyPerson[INITIAL_GROUP_SIZE];
    private int noOfPeople = 0;

    // Adds given Person to the Conversation (extend array as required).
    public void addMoodyPerson(PersonType person)
    {
        if(noOfPeople == moodyPeople.length)
        {
            MoodyPerson [] extra = new MoodyPerson[moodyPeople.length * GROUP_RESIZE_FACTOR];
            System.arraycopy(moodyPeople,0,extra,0,moodyPeople.length);
            moodyPeople = extra;
        } // if
        moodyPeople[noOfPeople] = person;
        noOfPeople++;
    } // addMoodyPerson

    // Set mood of each person in the group to a given boolean.
    public void setHappy(boolean currentMood)
    {
        for (int index = 0; index < noOfPeople; index++)
            moodyPeople[index].setHappy(currentMood);
    } // setHappy

    // Return amount of people in the group.
    public int getSize()
    {
        return noOfPeople;
    } // getSize

    // Mainly for testing.
    @Override
    public String toString()
    {
        String result = noOfPeople == 0 ? "" : "" + moodyPeople[0];
        for (int index = 1; index < noOfPeople; index++)
            result += String.format("%n%s", moodyPeople[index]);
        return result;
    } // toString

} // class MoodyGroup
