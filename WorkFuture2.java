// Print two people remaining years of work till retirement at 68.
// Arguments: current year, first birth year, second birth year
public class WorkFuture2
{
	public static void main(String [] args)
	{
		int presentYear = Integer.parseInt(args[0]); 
		int birthYear1 = Integer.parseInt(args[1]);
		int birthYear2 = Integer.parseInt(args[2]);

		// PERSON 1

		// Remaining years between person's age and 68
		int remainingYears = 68 - Math.abs(presentYear - birthYear1);
		if(remainingYears < 0)
			remainingYears = 0;

		// Display first line of the output		
		System.out.println("Person 1 has " + remainingYears + " years left to work");


		// Iteration through remaining years
		while(remainingYears > 0)
		{
			// saving resources by avoidind redundant variables (nextYear)
			// presentYear = 68 + birthYear1 - remainingYears
			System.out.println("In " + (68 + birthYear1 - remainingYears) + " person 1 will have "
                                           + remainingYears + " years left to work");	
			
			remainingYears--;

		} // while
		
		// Display last line of the output
		System.out.println("You will retire in " + (68 + birthYear1 - remainingYears));

		// PERSON 2

		// Remaining years between person's age and 68
		remainingYears = 68 - Math.abs(presentYear - birthYear2);
		if(remainingYears < 0)
			remainingYears = 0;

		// Display first line of the output		
		System.out.println("Person 2 has " + remainingYears + " years left to work");


		// Iteration through remaining years
		while(remainingYears > 0)
		{
			// saving resources by avoidind redundant variables (nextYear)
			// presentYear = 68 + birthYear2 - remainingYears
			System.out.println("In " + (68 + birthYear2 - remainingYears) + " person 2 will have "
                                           + remainingYears + " years left to work");

			remainingYears--;
	
		} // while
		
		// Display last line of the output
		System.out.println("You will retire in " + (68 + birthYear2 - remainingYears));
	} // main

} // class WorkFuture2