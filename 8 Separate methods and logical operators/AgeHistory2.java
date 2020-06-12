// Print out an age of two people
// Arguments: present year, first birth year, second birth year.
// Each date is three numbers: day month year.
public class AgeHistory2
{

	// The present date, stores as three variables.
	private static int presentDay, presentMonth, presentYear;

	// Print the age history of one person, identified as personNumber.
	// The birth date must be less than present date.
	private static void printAgeHistory(
		int personNumber, int birthDay, int birthMonth, int birthYear)
	{
		// Start by printing the event of birth.
		System.out.println("Pn " + personNumber + " was born on " + 
							 birthDay + "/" + birthMonth + "/" + birthYear);

		// Now we will go through the years since bnirtyh but before today.
		int someYear = birthYear + 1;
		int ageInSomeYear = 1;
		while(someYear < presentYear
				|| someYear == presentYear && birthMonth < presentMonth
				|| someYear == presentYear && birthMonth == presentMonth
					&& birthDay < presentDay)
		{			
			System.out.println("Pn " + personNumber + " was " + ageInSomeYear
							 + " on " + birthDay + "/" + birthMonth
							 + "/" + someYear);
			someYear++;
			ageInSomeYear++;
		} // while

	// At this point birthDay/birthMonth/someYear
	// will be the next birthday, aged ageInSomeYear.
	// This will be greater than or equal to the present date.
	// If the person has not yet had their birthday in this year 
	// someYear equals presentYear,
	// otherwise someYear equals presentYear + 1.

	if(birthMonth == presentMonth && birthDay == presentDay)
		// then someYear must be equal to preentYear.
		System.out.println("Pn " + personNumber + " is "
							 + ageInSomeYear + " today!");
	else
		System.out.println("Pn " + personNumber + " is "
							 + ageInSomeYear + " on " + birthDay + "/"
							 + birthMonth + "/" + someYear);
	} // printAgeHistory


	// The main method: gets argument and call printAgeHistory.
	public static void main(String [] args)
	{
		// The year of the present day store in three class variables
		presentDay = Integer.parseInt(args[0]);
		presentMonth = Integer.parseInt(args[1]);
		presentYear = Integer.parseInt(args[2]);

		// The dates of birth: three must ber less than the present date.
		int birthDay1 = Integer.parseInt(args[3]);
		int birthMonth1 = Integer.parseInt(args[4]);		
		int birthYear1 = Integer.parseInt(args[5]);

		int birthDay2 = Integer.parseInt(args[6]);
		int birthMonth2 = Integer.parseInt(args[7]);		
		int birthYear2 = Integer.parseInt(args[8]);

		// Now print the two age histories.
		printAgeHistory(1, birthDay1, birthMonth1, birthYear1);
		printAgeHistory(2, birthDay2, birthMonth2, birthYear2);
	} // main

} // class AgeHistory2 