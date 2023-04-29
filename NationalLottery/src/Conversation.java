// Representation of a group of lottery people talking in turn.
public class Conversation<PersonType extends Person>
{
    // Initial size and resize factor.
    private static final int INITIAL_ARRAY_SIZE = 2, ARRAY_RESIZE_FACTOR = 2;

    // The array, together with the number of Person objects in it.
    private Person[] persons = new Person[INITIAL_ARRAY_SIZE];
    private int noOfPersons = 0;

    // Empty constructor, nothing needs doing.
    public Conversation()
    {
        super();
    } // Conversation

    // Adds given Person to the Conversation (extend array as required).
    public void addPerson(PersonType newPerson)
    {
        if (noOfPersons == persons.length)
        {
            Person [] biggerArray = new Person[persons.length * ARRAY_RESIZE_FACTOR];
            for (int index = 0; index < persons.length; index++)
                biggerArray[index] = persons[index];
            persons = biggerArray;
        } // if
        persons[noOfPersons] = newPerson;
        noOfPersons++;
    } // addPerson

    // Return the number of people in the conversation.
    public int getSize()
    {
        return noOfPersons;
    } // getSize

    // Used to keep track of whose turn it is to speak.
    private int nextToSpeak = 0;

    // Make the next person speak and update who is next after that.
    public void speak()
    {
        if (noOfPersons > 0)
        {
            persons[nextToSpeak].speak();
            nextToSpeak = (nextToSpeak + 1) % noOfPersons;
        } // if
    } // speak

    // Mainly for testing.
    @Override
    public String toString()
    {
        String result = noOfPersons == 0 ? "" : "" + persons[0];
        for (int index = 1; index < noOfPersons; index++)
            result += String.format("%n%s", persons[index]);
        return result;
    } // toString

} // class Conversation
