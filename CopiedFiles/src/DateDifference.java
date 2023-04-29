import java.util.Scanner;

// Obtain two dates in day/month/year format from the user.
// Report how many days there are from first to second,
// which is negative if first date is the earliest one.
public class DateDifference
{
    public static void main(String[] args)
    {
        try{
            try{
                if (args.length != 2)
                    throw new IllegalArgumentException(args.length + " != 2");
                Date date1 = new Date(args[0]);
                Date date2 = new Date(args[1]);
                System.out.println("From " + date1 + " to " + date2 + " is " + date1.daysFrom(date2) + " days");
            } // try
            catch (IllegalArgumentException exception)
            {
                System.out.println("Please supply exactly two dates!");
                throw  exception;
            } // catch
            catch (DateException exception)
            {
                System.out.println("One of your dates has a problem.");
                System.out.println(exception.getMessage());
                throw  exception;
            } // catch
            catch (Exception exception)
            {
                System.out.println("Something unforeseen has happened!");
                System.out.println(exception.getMessage());
                throw  exception;
            } // catch
        } // try
        catch (Exception exception)
        {
            // All exceptions have been already reported to System.out.
            System.err.println(exception);
            if(exception.getCause() != null)
                System.err.println("Caused by: " + exception.getCause());
        } // catch

    } // main

} //  class DateDifference
