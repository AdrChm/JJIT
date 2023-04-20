public class Inspector
{
    private final String name;

    public Inspector(String requiredName)
    {
        name = requiredName;
    } // Inspector

    public String getName()
    {
        return name;
    } // getName

    public void interrogate(Inspector suspect)
    {
        System.out.println("I am Inspector " + getName() + ", who are you? " + suspect);
    } // interrogate

    public String toString()
    {
        return "I am Inspector " + getName() + "!";
    } // toString

    public static void makeInspection(Inspector inspectingOfficer, Inspector suspect)
    {
        inspectingOfficer.interrogate(suspect);
    } // makeInspection

} // class Inspector
