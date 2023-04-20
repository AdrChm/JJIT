// Print out an age history of two people.
// Arguments: present date, first birth date, second birth date.
// Each date is three numbers: day month year.
public class AgeHistory2
{
	// The present date.
	private static Date presentDate;

	// Prints the age history of one person, identified as personNumber.
	// The birth date must be less than present date.	
	private static void printAgeHistory(int personNumber, Date birthDate)
	{
		// Start by printing the event of birth.	
		System.out.println("Pn " + personNumber + " was born on " 
				  + birthDate);

		// Now we will go through the years since birth, but before today.
		// We keep track of the birthday we are considering.
		Date someBirthday = birthDate.addYear();
		int ageOnSomeBirthday = 1;
		while (someBirthday.lessThan(presentDate))
		{
			System.out.println("Pn " + personNumber + " was " + ageOnSomeBirthday  
					  + " on " + someBirthday);
			someBirthday = someBirthday.addYear();
			ageOnSomeBirthday++;
		} // while		
				
		// At this point birthDay/birthMonth/someYear
		// will be next birthday, aged in ageInSomeYear
		// This will be greater than or equal to the present date.
		// If the person has not yet had their birthday this year
		// someYear equals a presentYear,
		// otherwise someYear equals presentYear + 1.
		// Now deal with the next birthday
		if (someBirthday.equals(presentDate)) 
		// then the someYear must be equal to presentYear.
			System.out.println("Pn " + personNumber + " is" + ageOnSomeBirthday + " today!");
		else
			System.out.println("Pn " + personNumber + " will be "
					  + ageOnSomeBirthday + " on " + someBirthday);
			
	} // printAgeHistory
	
	// The main method: get arguments and call printAgeHistory. 
	public static void main(String [] args) throws Exception {
		// The present date.
		presentDate = new Date (Integer.parseInt(args[0]),
					     Integer.parseInt(args[1]),
					     Integer.parseInt(args[2]));

		// The dates of birth: these must be less than the present date. 	
		Date birthDate1 = new Date (Integer.parseInt(args[3]),
					    Integer.parseInt(args[4]),
					    Integer.parseInt(args[5]));

		Date birthDate2 = new Date (Integer.parseInt(args[6]),
					    Integer.parseInt(args[7]),
					    Integer.parseInt(args[8]));

		// Now print two age histories.
		printAgeHistory(1, birthDate1);
		printAgeHistory(2, birthDate2);
	} // main

} // class AgeHistory2