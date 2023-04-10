// Create one of each type of person and make them speak.
public class TestPersonSubclasses {
    public static void main(String[] args)
    {

        Person [] persons =
            {
                new AudienceMember("Ivana Di Yowt"),
                new Director("Sir Lance Earl Otto"),
                new Psychic("Miss T. Peg de Gowt"),
                new Punter("Ian Arushfa Rishly Ving"),
                new Teenager("Homer Nalzone"),
                new TVHost("Terry Bill Woah B'Gorne")
            };
        for(Person person : persons)
            testPerson(person);


    } // main

    // Make the given person speak, reporting the before and after toString.
    private static void testPerson(Person person)
    {
        System.out.println("-------------------------------------------------");
        System.out.println(person);
        person.speak();
        System.out.println(person);

        if( person instanceof MoodyPerson)
            testMoodyPerson((MoodyPerson) person);

    } // testPerson

    // Make the given moody person change happiness then speak,
    // reporting the after toString; all twice.
    private static void testMoodyPerson(MoodyPerson moodyPerson)
    {
        for (int count = 1; count <= 2; count++)
        {
            moodyPerson.setHappy(!moodyPerson.isHappy());
            moodyPerson.speak();
            System.out.println(moodyPerson);
        } // for
    } // testMoodyPerson

} // class TestPersonSubclasses
