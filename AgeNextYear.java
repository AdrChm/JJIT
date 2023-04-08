// Gets current age from first argument, and reports age next year.
// Gives an error message if age is not a valid number.
public class AgeNextYear
{

	// Check argument and compute result of report error.
	public static void main(String [] args)
	{
		try{
			int myAgeNow = Integer.parseInt(args[0]);
			int myAgeNextYear = myAgeNow + 1;

			System.out.println("My age now is " + myAgeNow);
			System.out.println("My age next year will be " + myAgeNextYear);
		} // try
		catch(Exception exception)
		{
			System.out.println("Please supply your age, as a whole number.");
			System.out.println("Exception message was: '" + exception.getMessage() + "'");
			System.err.println(exception);
		} // catch
	} // main

} // class AgeNextYear