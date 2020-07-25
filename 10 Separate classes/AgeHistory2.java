// Improved version of AgeHistory2 from chapter 8
// Print out an age of two people
// Arguments: present year, first birth year, second birth year.
// Each date is three numbers: day month year.
public class AgeHistory2
{
	// The present date.
	private static Date presentDate;

	// Print the age history of one person, identified as personNumber.
	// The birth date must be less than present date.
	private static void printAgeHistory(
		int personNumber, Date birthDate)
	{
		// Start by printing the event of birth.
		System.out.println("Pn " + personNumber + " was born on " + 
							 birthDate.day + "/" + birthDate.month + "/" + birthDate.year);

		// Now we will go through the years since bnirtyh but before today.
		int someYear = birthDate.year + 1;
		int ageInSomeYear = 1;
		while(someYear < presentDate.year 
				|| someYear == presentDate.year 
					&& birthDate.month < presentDate.month 
				|| someYear == presentDate.year 
					&& birthDate.month == presentDate.month 
					&& birthDate.day < presentDate.day)
		{			
			System.out.println("Pn " + personNumber + " was " + ageInSomeYear
							 + " on " + birthDate.day + "/" + birthDate.month
							 + "/" + someYear);
			someYear++;
			ageInSomeYear++;
		} // while

	// At this point birthDate.day/birthDate.month/someYear
	// will be the next birthday, aged ageInSomeYear.
	// This will be greater than or equal to the present date.
	// If the person has not yet had their birthday in this year 
	// someYear equals presentDate.year,
	// otherwise someYear equals presentYear + 1.

	if(birthDate.month == presentDate.month 
		&& birthDate.day == presentDate.day)
		// then someYear must be equal to preentYear.
		System.out.println("Pn " + personNumber + " is "
							 + ageInSomeYear + " today!");
	else
		System.out.println("Pn " + personNumber + " is "
							 + ageInSomeYear + " on " + birthDate.day + "/"
							 + birthDate.month + "/" + someYear);
	} // printAgeHistory


	// The main method: gets argument and call printAgeHistory.
	public static void main(String []args)
	{
		// The present date
		presentDate = new Date(Integer.parseInt(args[0]),
						   	   Integer.parseInt(args[1]),
						   	   Integer.parseInt(args[2]));

		// The dates of birth: three must ber less than the present date.
		Date birthDate1 = new Date(Integer.parseInt(args[3]),
						    	   Integer.parseInt(args[4]),
						    	   Integer.parseInt(args[5]));

		Date birthDate2 = new Date(Integer.parseInt(args[6]),
						   		   Integer.parseInt(args[7]),
						   		   Integer.parseInt(args[8]));

		// Now print the two age histories.
		printAgeHistory(1, birthDate1);
		printAgeHistory(2, birthDate2);

	} // main

} // class AgeHistory2 