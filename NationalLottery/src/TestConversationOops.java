// Create conversation of persons and make them speak.
public class TestConversationOops {

    public static void main(String[] args)
    {
        // A conversation of AudienceMembers.
        Conversation<AudienceMember> audienceChat = new Conversation<AudienceMember>();

        audienceChat.addPerson(new AudienceMember("AM 1"));
        audienceChat.addPerson(new TVHost("TVH 1"));
        System.out.printf("%s%n%n", audienceChat);
        for (int count = 1; count <= audienceChat.getSize() ; count++)
        {
            audienceChat.speak();
            System.out.printf("%s%n%n", audienceChat);
        } // for

    } // main

} // class TestConversationOops