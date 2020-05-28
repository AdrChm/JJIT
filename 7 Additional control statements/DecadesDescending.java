// Program to report the list of decade birthdays that user has had.
// The age of the user is given as the argument.
public class DecadesDescending
{
	public static void main(String [] args)
	{
		// Age is assumed to be a valid non-negative whole number.
		int ageOfuser = Integer.parseInt(args[0]);

		// The number of colected decades.
		int decadesOfUser = ageOfuser/10;

		System.out.println("You've had the following decade birthdays:");
		// A switch without breaks, to exploit fall through.
		switch(decadesOfUser)
		{
			case 10 : System.out.println("your hundredth, and");
			case 9  : System.out.println("your ninetieth, and");
			case 8  : System.out.println("your eightieth, and");
			case 7  : System.out.println("your seventieth, and");
			case 6  : System.out.println("your sixtieth, and");
			case 5  : System.out.println("your fiftieth, and");
			case 4  : System.out.println("your fortieth, and");
			case 3  : System.out.println("your thirttieth, and");
			case 2  : System.out.println("your twentieth, and");
			case 1  : System.out.println("your tenth.");
		}	// switch

	} // main

} // class DecadesDescending