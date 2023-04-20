public class WhoAmI
{
    public static void identify(int arg)
    {
        System.out.println("I am an int: " + arg);
    } // identify

    public static void identify(double arg)
    {
        System.out.println("I am a double: " + arg);
    } // identify

    public static void identifyToo(double arg)
    {
        System.out.println("I too am a double: " + arg);
    } // identifyToo

    public static void main(String[] args)
    {
        identify(10); // An int argument is surely an int.
        identify(20.0); // An int argument is surely an int.
        identifyToo(30); // An int argument is surely an int.
    }
}
