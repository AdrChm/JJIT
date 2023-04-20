public class PrintOverloadDemo
{
    private static char[] vowels = {'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args)
    {
        System.out.println("Printing vowels as a char[]");
        System.out.println(vowels);
        System.out.println();
        System.out.println("Printing vowels as an Object");
        System.out.println((Object) vowels);
    } // main

} // PrintOverloadDemo