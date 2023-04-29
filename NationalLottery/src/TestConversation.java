// Create conversation of persons and make them speak.
public class TestConversation
{
    public static void main(String[] args)
    {
        // A conversation of AudienceMembers.
        Conversation<AudienceMember> audienceChat = new Conversation<AudienceMember>();

        audienceChat.addPerson(new AudienceMember("AM 1"));
        audienceChat.addPerson(new AudienceMember("AM 2"));
        audienceChat.addPerson(new AudienceMember("AM 3"));
        System.out.printf("%s%n%n", audienceChat);
        for (int count = 1; count <= audienceChat.getSize() ; count++)
        {
            audienceChat.speak();
            System.out.printf("%s%n%n", audienceChat);
        } // for

        // A conversation of any kind of person.
        Conversation<Person> anyChat = new Conversation<Person>();
        anyChat.addPerson(new TVHost("TVH 1"));
        anyChat.addPerson(new AudienceMember("AM 4"));
        System.out.printf("%s%n%n", anyChat);
        for (int count = 1; count <= anyChat.getSize() ; count++)
        {
            anyChat.speak();
            System.out.printf("%s%n%n", anyChat);
        } // for

    } // main

} // class TestConversation