// Program to print person's remaining years of work till retirement at 68.
// First argument is current year.
// Second argument is person's birth year.
public class WorkFuture
{
	public static void main(String [] args)
	{
		int presentYear = Integer.parseInt(args[0]); 
		int birthYear = Integer.parseInt(args[1]);
		
		// Remaining years between person's age and 68
		int remainingYears = 68 - (presentYear - birthYear);

		// Display first line of the output		
		System.out.println("You have " + remainingYears + " years left to work");
		
		// Iteration through remaining years
		for(; remainingYears > 0; remainingYears = remainingYears - 1)
		{

			// Increass of present years represents current year of each iteration
			presentYear = presentYear + 1;

			System.out.println("In " + presentYear + " you will have " + remainingYears + " years left to work");	
		} // for
		
		// Display last line of the output
		System.out.println("You will retire in " + presentYear);

	} // main

} // class WorkFuture