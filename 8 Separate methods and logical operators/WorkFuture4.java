// Prints our remaining years of two people till retirement
// Set retirement age is 68
// Arguments order: present year, first person birthyear, second, third, fourth. 
// Program assumes work since birthday 
public class WorkFuture4
{
	// Gets argument and calls printWorkFuture
	public static void main(String [] args)
	{
		// Getting present year
		int presentYear = Integer.parseInt(args[0]);

		// Getting four people birthday years
		int birthday1 = Integer.parseInt(args[1]);
		int birthday2 = Integer.parseInt(args[2]);
		int birthday3 = Integer.parseInt(args[3]);
		int birthday4 = Integer.parseInt(args[4]);

		// Calling printWorkFuture method
		printWorkFuture(presentYear, 1, birthday1);
		printWorkFuture(presentYear, 2, birthday2);
		printWorkFuture(presentYear, 3, birthday3);
		printWorkFuture(presentYear, 4, birthday4);

	} // main

	// Display remeaining work years of a person
	// Assumes work since birthday
	// Arguments: present year, person number, person birth year.
	private static void printWorkFuture(int presentYear,
										 int personNumber, int personBirthday)
	{
		// Current situation
		int currentAge = presentYear - personBirthday;
		int workYearsLeft = 68 - currentAge;	

		if (currentAge < 68)
		{
			System.out.println("Pn " + personNumber + " has " + workYearsLeft + " years left to work");
			
			// Calculating remaining years 
			while (workYearsLeft > 1)
			{
				workYearsLeft--;
				presentYear++;
				System.out.println("In " + presentYear + " Pn 2 will have " + workYearsLeft + " years left to work");				
			}

			// one year refore retirement
			presentYear++;
			System.out.println("Pn " + personNumber + " will retire in " + presentYear);

		} // if
		else
					System.out.println("Pn " + personNumber + " is retired since "
			 					+ (personBirthday + 68));		

	} // printWorkFuture

} // class WorkFuture4
