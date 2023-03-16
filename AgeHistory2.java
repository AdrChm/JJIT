// Print out an age history of two people.
// Arguments: present date, first birth date, second birth date.
// Each date is three numbers: day month year.
public class AgeHistory2
{
	// The present date stored as 3 variables
	private static int presentDay, presentMonth, presentYear;

	// Prints the age history of one person, identified as personNumber.
	// The birth date must be less than present date.	
	private static void printAgeHistory(int personNumber, int birthDay, 
					    int birthMonth, int birthYear)
	{
		// Start by printing the event of birth.	
		System.out.println("Pn " + personNumber + " was born on " 
				  + birthDay + "/" +  birthMonth + "/" + birthYear);

		// Now we will go through the years since birth, but before today.
		int someYear = birthYear + 1;
		int ageInSomeYear = 1;
		while (someYear < presentYear
			|| someYear == presentYear && birthMonth < presentMonth
			|| someYear == presentYear && birthMonth == presentMonth
			&& birthDay < presentDay)
		{
			System.out.println("Pn " + personNumber + " was " + ageInSomeYear  
					  + " on " + birthDay + "/" +  birthMonth + "/" + someYear);
			someYear++; 
			ageInSomeYear++;
		} // while		
				
		// At this point birthDay/birthMonth/someYear
		// will be next birthday, aged in ageInSomeYear
		// This will be greater than or equal to the present date.
		// If the person has not yet had their birthday this year
		// someYear equals a presentYear,
		// otherwise someYear equals presentYear + 1.

		if (birthMonth == presentMonth && birthDay == presentDay) 
		// then the someYear must be equal to presentYear.
			System.out.println("Pn " + personNumber + " is" + ageInSomeYear + " today!");
		else
			System.out.println("Pn " + personNumber + " will be " + ageInSomeYear  
					  + " on " + birthDay + "/" +  birthMonth + "/" + someYear);
			
	} // printAgeHistory
	
	// The main method: get arguments and call printAgeHistory. 
	public static void main(String [] args)
	{
		// The present date, stored in three class variables.
		presentDay = Integer.parseInt(args[0]);
		presentMonth = Integer.parseInt(args[1]);
		presentYear = Integer.parseInt(args[2]);

		// The dates of birth: these must be less than the present date. 	
		int birthDay1 = Integer.parseInt(args[3]);
		int birthMonth1 = Integer.parseInt(args[4]);
		int birthtYear1 = Integer.parseInt(args[5]);

		int birthDay2 = Integer.parseInt(args[6]);
		int birthMonth2 = Integer.parseInt(args[7]);
		int birthtYear2 = Integer.parseInt(args[8]);

		// Now print two age histories.
		printAgeHistory(1, birthDay1, birthMonth1, birthtYear1);
		printAgeHistory(2, birthDay2, birthMonth2, birthtYear2);
	} // main

} // class AgeHistory2