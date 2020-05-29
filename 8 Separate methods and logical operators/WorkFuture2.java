// Prints our remaining years of two people till retirement
// Set retirement age is 68
// Arguments order: present year, first person birthyear, second person birthyear 
// Program assumes work since birthday 
public class WorkFuture2 
{
	public static void main(String [] args)
	{

		// current year
		int presentYear = Integer.parseInt(args[0]);

		// people birthday year
		int personBirthday1 = Integer.parseInt(args[1]);
		int personBirthday2 = Integer.parseInt(args[2]);

		// First person

		// Current situation
		int currentAge = presentYear - personBirthday1;
		int workYearsLeft = 68 - currentAge;	

		// Variable created for year in loop message.
		int currentYear = presentYear; 

		if (currentAge < 68)
		{
			System.out.println("Pn 1 has " + workYearsLeft + " years left to work");

			// Calculating remaining years.  
			while (workYearsLeft > 1)
			{
				workYearsLeft--;
				currentYear++;
				System.out.println("In " + currentYear + " Pn 1 will have " + workYearsLeft + " years left to work");				
			}

			// One year before retirement.
			currentYear++;
			System.out.println("Pn 1 will retire in " + currentYear);

		} // if
		else
					System.out.println("Pn 1 is retired since "
			 					+ (personBirthday1 + 68));


		// Second person

		// Current situation
		currentAge = presentYear - personBirthday2;
		workYearsLeft = 68 - currentAge;	

		// Variable created for year in loop message.
		currentYear = presentYear; 

		if (currentAge < 68)
		{
			System.out.println("Pn 2 has " + workYearsLeft + " years left to work");
			
			// Calculating remaining years.
			while (workYearsLeft > 1)
			{
				workYearsLeft--;
				currentYear++;
				System.out.println("In " + currentYear + " Pn 2 will have " + workYearsLeft + " years left to work");				
			}

			// One year before retirement.
			currentYear++;
			System.out.println("Pn 2 will retire in " + currentYear);

		} // if
		else
					System.out.println("Pn 2 is retired since "
			 					+ (personBirthday2 + 68));			

	}
}