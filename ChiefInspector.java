public class ChiefInspector extends Inspector
{
    public ChiefInspector(String name)
    {
        super(name);
    } // ChiefInspector

    @Override
    public void interrogate(Inspector suspect)
    {
        System.out.println("I am Chief Inspector " + getName() + ", who are you? " + suspect);
    } // interrogate

    @Override
    public String toString()
    {
        return "I am Chief Inspector " + getName() + "!";
    } // toString

    public static void main(String[] args)
    {
        Inspector clouseau = new Inspector("Clouseau");
        ChiefInspector dreyfus = new ChiefInspector("Dreyfus");

        Inspector.makeInspection(clouseau, dreyfus);
        Inspector.makeInspection(dreyfus, clouseau);
        Inspector.makeInspection(dreyfus, dreyfus);
        System.out.println();
        clouseau.interrogate(dreyfus);
        dreyfus.interrogate(clouseau);
        dreyfus.interrogate(dreyfus);
    } // main

} // class ChiefInspector
