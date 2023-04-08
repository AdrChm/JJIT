// Gets current age from first argument, and reports age next year.
// Gives an error message if age is not a valid number.
public class AgeNextYear
{
	// Return true if and only if given string is all digits and not empty.
	private static boolean isNotEmptyDigits(String shouldBeDigits)
	{
		boolean okaySoFar = shouldBeDigits.length() != 0;
		int index = 0;
		while (okaySoFar && index < shouldBeDigits.length())
		{
			okaySoFar = Character.isDigit(shouldBeDigits.charAt(index));
			index++;
		} // while
		return okaySoFar;
	} // isNotEmptyDigits

	// Check argument and compute result of report error.
	public static void main(String [] args)
	{
		if(args.length > 0 && isNotEmptyDigits(args[0])) {
			int myAgeNow = Integer.parseInt(args[0]);
			int myAgeNextYear = myAgeNow + 1;

			System.out.println("My age now is " + myAgeNow);
			System.out.println("My age next year will be " + myAgeNextYear);
		} // if
		else
			System.out.println("Please supply your age, as a whole number.");
	} // main

} // class AgeNextYear