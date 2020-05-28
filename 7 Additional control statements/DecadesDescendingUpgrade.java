// Program to report the list of decade birthdays that user has had.
// The age of the user is given as the argument.
public class DecadesDescendingUpgrade
{
	public static void main(String [] args)
	{
		// Age is assumed to be a valid non-negative whole number.
		int ageOfuser = Integer.parseInt(args[0]);

		// The number of colected decades.
		int decadesOfUser = ageOfuser/10;

		//System.out.println("You've had the following decade birthdays:");
		//Own message upgrade - to avoid displaying while given argument is out of range
		String message = "You've had the following decade birthdays:\n";
		// A switch without breaks, to exploit fall through.
		switch(decadesOfUser)
		{
			//case 10 : System.out.println("your hundredth, and");
			case 10 : message += "your hundredth, and\n";
			//case 9  : System.out.println("your ninetieth, and");
			case 9: message += "your ninetieth, and\n";
			//case 8  : System.out.println("your eightieth, and");
			case 8: message += "your eightieth, and\n";
			//case 7  : System.out.println("your seventieth, and");
			case 7: message += "your seventieth, and\n";
			//case 6  : System.out.println("your sixtieth, and");
			case 6: message += "your sixtieth, and\n";
			//case 5  : System.out.println("your fiftieth, and");
			case 5: message += "your fiftieth, and\n";
			//case 4  : System.out.println("your fortieth, and");
			case 4: message += "your fortieth, and\n";
			//case 3  : System.out.println("your thirttieth, and");
			case 3: message += "your thirttieth, and\n";
			//case 2  : System.out.println("your twentieth, and");
			case 2: message += "your twentieth, and\n";
			//case 1  : System.out.println("your tenth.");
			case 1: message += "your tenth.";
				System.out.println(message);
				break;
			default : System.out.println("Given age is not in the program range!");
		}	// switch

	} // main

} // class DecadesDescendingUpgrade