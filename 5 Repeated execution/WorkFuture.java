// Program made according to instructions on page 84
// There is no word about work starting age
// program assumes work from birth to 68th birthday 
public class WorkFuture
{
	public static void main(String [] args)
	{

		// first argument - current Year
		int presentYear = Integer.parseInt(args[0]);

		// second argument - birth year - must be smaller that or equal to current year
		int birthYear = Integer.parseInt(args[1]);

		// CurrentAge will be compared with 68 in loop
		int currentAge = presentYear - birthYear;

		// Display in formation for entry data
		System.out.println("You have " + (68 - currentAge) + " years left to work");

		// Condition has 67 to avoid displaying 0 years line, which would appear
		// 66 entry will display 67 years as last line in the loop 


		while ( currentAge < 67)
		{

			//currentAge = currentAge + 1;
			currentAge++;
			//presentYear = presentYear + 1;
			presentYear++;

			System.out.println("In " + presentYear + " you will have " + (68 
								- currentAge) + " years left to work"); 


		} // while

		// presentYear is increased to change final year message comparing to previous year
		//presentYear = presentYear + 1;
		presentYear++;

		// Final message (for age of 68)
		System.out.println("You will retire in " + presentYear);

	} // main

} // WorkFuture class