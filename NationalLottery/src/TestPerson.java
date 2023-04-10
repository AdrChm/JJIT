// Create a Person and make them speak.
public class TestPerson
{
    public static void main(String[] args)
    {
        // Necessary change to assign AudienceMember as
        // Person class become abstract.
        Person person = new AudienceMember("Ivana Vinnit");
        System.out.println(person);
        person.speak();
        System.out.println(person);
    } // main

} //  class TestPerson
