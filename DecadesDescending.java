// Program to report the list of decade birthdays the user has had.
// The age of the user is given as the argument.
public class DecadesDescending
{
	public static void main(String [] args)
	{
		// Age is assumed to be a valid non-negative whole number.
		int ageOfUser = Integer.parseInt(args[0]);
		
		// The number of completed decades.
		int decadesOfUser = ageOfUser / 10;
		
		System.out.println("You've had the following decade birthdays:");
		// A switch without breaks, to exploit fall through.
		switch(decadesOfUser)
		{
			// This piece of code is for fixing question in Coffee 7.3.1		
			// It produces output for age 109+ 
			default: System.out.println("(passed much more than a century, congratulations, but "   
						    + "programm is created just for decades up to age of 109)");

			case 10 : System.out.println("your hundredth, and");
			case 9 : System.out.println("your ninetieth, and");
			case 8 : System.out.println("your eightieth, and");
			case 7 : System.out.println("your seventieth, and");
			case 6 : System.out.println("your sixtieth, and");
			case 5 : System.out.println("your fiftieth, and");
			case 4 : System.out.println("your fortieth, and");
			case 3 : System.out.println("your thirtieth, and");
			case 2 : System.out.println("your twentieth, and");
			case 1 : System.out.println("your tenth.");

			// This piece of code is for fixing question in Coffee 7.3.1		
			break;
			//coverage of age below 10 (exclidung negative values)
			case 0 : System.out.println("well, you haven't yet - lucky you!");
			break;



			
		} // switch
	} // main

} // DecadesDescending class