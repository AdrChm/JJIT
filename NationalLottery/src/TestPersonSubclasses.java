// Create one of each type of person and make them speak.
public class TestPersonSubclasses {
    public static void main(String[] args)
    {

        Person [] persons =
            {
                new AudienceMember("Ivana Di Yowt"),
                new Director("Sir Lance Earl Otto"),
                new Psychic("Miss T. Peg de Gowt"),
                new Punter("Ian Arushfa Rishy Ving"),
                new TVHost("Terry Bill Woah B'Gorne")
            };
        for(Person person : persons)
            testPerson(person);

    } // main

    // Make the given person speak, reporting the before and after toString.
    public static void testPerson(Person person)
    {
        System.out.println("-------------------------------------------------");
        System.out.println(person);
        person.speak();
        System.out.println(person);
    } // testPerson

} // class TestPersonSubclasses
