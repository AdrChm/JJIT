// Obtain two dates in day/month/year format from first and second arguments.
// Report how many days there are from first to second,
// which is negative if first date is the earliest one.
public class DateDifference
{
    public static void main(String[] args)
    {
        try
        {
            // the two dates from args 0 and 1.
            Date date1 = new Date(args[0]);
            Date date2 = new Date(args[1]);
            if(args.length > 2)
                throw new ArrayIndexOutOfBoundsException(args.length + " is > 2");
            System.out.println("From " + date1 + " to " + date2 + " is "
                                + date1.daysFrom(date2) + " days");
        } // try
        catch (ArrayIndexOutOfBoundsException exception)
        {
            System.out.println("Please supply exactly two dates");
            System.err.println(exception);
            if(exception.getCause() != null)
                System.err.println("Caused by: " + exception.getCause());
        } // catch
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
            System.err.println(exception);
            if(exception.getCause() != null)
                System.err.println("Caused by: " + exception.getCause());
        } // catch
    } // main

} //  class DateDifference
