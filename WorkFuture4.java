// Modification of WorkFuture2 
// Arguments: current year, first birth year, second, third, fourth
public class WorkFuture4 
{
	public static void main(String [] args)
	{
		int presentYear = Integer.parseInt(args[0]);
		int birthYear1 = Integer.parseInt(args[1]);
		int birthYear2 = Integer.parseInt(args[2]);
		int birthYear3 = Integer.parseInt(args[3]);
		int birthYear4 = Integer.parseInt(args[4]);
	
		printWorkFuture(presentYear, 1, birthYear1);
		printWorkFuture(presentYear, 2, birthYear2);
		printWorkFuture(presentYear, 3, birthYear3);
		printWorkFuture(presentYear, 4, birthYear4);
		
	} // main

	// separate method to print future history for one peson
	private static void printWorkFuture(int presentYear, int personNumber, int birthYear)
	{
		// Remaining years between person's age and 68
		// Invalid values check preventing from infinite loop 
		if(presentYear < birthYear)
		{
			System.out.println("Given birthYear is in the future!");
			presentYear = birthYear;
		} // if

		int remainingYears = 68 - presentYear + birthYear;

		// Display first line of the output		
		System.out.println("Person " + personNumber + " has " + remainingYears + " years left to work");
		remainingYears--;
		
		for(; remainingYears > 0; remainingYears--)
		{	
			// even more efficient version of the program
			System.out.println("In " + (68 + birthYear - remainingYears) + " person "
				   	  + personNumber + " will have " + remainingYears + " years left to work");
		} // for

		// Display last line of the output
		System.out.println("Person "+ personNumber + " will retire in " + (68 + birthYear - remainingYears));			
	
	} // printWorkFuture

} // WorkFuture4 class