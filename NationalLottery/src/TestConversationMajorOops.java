// Create conversation of persons and make them speak.
public class TestConversationMajorOops
{

    public static void main(String[] args)
    {
        // A conversation of AudienceMembers.
        Conversation moodyChat = new Conversation();

    /* Commented out for project maintainability
        moodyChat.addPerson("TA 1");
     */
        moodyChat.addPerson(new CleverPunter("CP 1"));
        moodyChat.addPerson(new Worker("W 1"));
        moodyChat.addPerson(new TraineeWorker("TW 1", 0.5));
        System.out.printf("%s%n%n", moodyChat);
        for (int count = 1; count <= moodyChat.getSize() ; count++)
        {
            moodyChat.speak();
            System.out.printf("%s%n%n", moodyChat);
        } // for

    } // main

} // class TestConversationMajorOops