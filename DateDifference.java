import java.util.Scanner;

// Obtain two dates in day/month/year format from the user.
// Report how many days there are from first to second,
// which is negative if first date is the earliest one.
public class DateDifference
{
    public static void main(String[] args)
    {
            // A scanner for reading from standard input.
            Scanner input = new Scanner(System.in);
            // The two dates obtained from the user.
            Date date1 = inputDate(input, "first");
            Date date2 = inputDate(input, "second");
            System.out.println();
        System.out.println("From " + date1 + " to " + date2 + " is " + date1.daysFrom(date2) + " days");
    } // main

    // Obtain data from the user via the given Scanner.
    // The second argument is part of the prompt.
    // Keep reading until user has entered a valid date.
    private static Date inputDate(Scanner input, String whichDate)
    {
        // Result will eventually refer to a legal date.
        Date result = null;
        System.out.print("Please type the " + whichDate + " date: ");
        // Keep trying until we get a legal date.
        boolean inputValidator = false;
        do {
            try
            {
                result = new Date(input.nextLine());
                // If we get here then date was valid.
                inputValidator = true;
            } //
            catch (Exception exception) {
                System.out.println(exception.getMessage());
                System.out.print("Please re-type the " + whichDate + " date: ");
            } // catch
        }while (!inputValidator);
        // When we get here the result must be a valid date.
        return result;
    } // inputDate

} //  class DateDifference
