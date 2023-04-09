// Program to test Data class behaviour
// based on Data class from section 15.8.2.
public class TestRelativeDates
{
    public static void main(String[] args) throws Exception
    {
        // Starting point of the program.
        Date startingDate = new Date("01/01/2020");

        // Let's go through 1000 days here.
        for (int i = 0; i < 1000; i++) {
            startingDate = startingDate.addDay();
            System.out.print(startingDate);
            System.out.print(" -day: " + startingDate.subtractDay());
            System.out.print(" -month: " + startingDate.subtractMonth());
            System.out.print(" +month: " + startingDate.addMonth());
            System.out.print(" -year: " + startingDate.subtractYear());
            System.out.println(" +year: " + startingDate.addYear());
        } // for
    } // main
} // class TestRelativeDates
