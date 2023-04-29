// Create moody group of persons and influence their mood.
public class TestMoodyGroup
{
    public static void main(String[] args)
    {
        MoodyGroup<Teenager> teenagers = new MoodyGroup<Teenager>();
        Teenager t1 = new Teenager("T 1");
        Teenager t2 = new Teenager("T 2");
        Teenager t3 = new Teenager("T 3");
        teenagers.addMoodyPerson(t1);
        teenagers.addMoodyPerson(t2);
        teenagers.addMoodyPerson(t3);

        System.out.printf("%s%n%n", teenagers);

        for (int count = 0; count < teenagers.getSize() ; count++)
        {
            teenagers.setHappy(false);
        } // for

        System.out.printf("%s%n%n", teenagers);

        for (int count = 0; count < teenagers.getSize() ; count++)
        {
            teenagers.setHappy(true);
        } // for

        System.out.printf("%s%n%n", teenagers);

        MoodyGroup<MoodyPerson> moodyPeople = new MoodyGroup<MoodyPerson>();
        moodyPeople.addMoodyPerson(t1);
        moodyPeople.addMoodyPerson(t2);
        moodyPeople.addMoodyPerson(new Worker("W 1"));
        moodyPeople.addMoodyPerson(new TraineeWorker("TW 1",0.5));

        System.out.printf("%s%n%n", moodyPeople);

        for (int count = 0; count < moodyPeople.getSize() ; count++)
        {
            moodyPeople.setHappy(true);
        } // for

        System.out.printf("%s%n%n", moodyPeople);

        for (int count = 0; count < moodyPeople.getSize() ; count++)
        {
            moodyPeople.setHappy(false);

        } // for

        System.out.printf("%s%n%n", moodyPeople);
        System.out.printf("%s%n%n", teenagers);

    } // main

} // class TestMoodyGroup
