// Print out an age history of two people.
// Arguments: present year, first birth year, second birth year.
public class AgeHistory2
{
	public static void main(String [] args)
	{
		// The year of the present day.
		int presentYear = Integer.parseInt(args[0]);

		// The two birth years: which must be less than the present year.	
		int birthYear1 = Integer.parseInt(args[1]);
		int birthYear2 = Integer.parseInt(args[2]);

		// PERSON 1
		// Start by printing the event of birth.	
		System.out.println("Pn 1 was born in " + birthYear1);

		// Now we will go through the years between birth and last year.
		int someYear1 = birthYear1 + 1;
		int ageInSomeYear1 = 1;
		while (someYear1 != presentYear)
		{
			System.out.println("Pn 1 was " + ageInSomeYear1 + " in " + someYear1);
			someYear1++;
			ageInSomeYear1++;
		} // while
		
		// Finally, the age of the person this year.
		System.out.println("Pn 1 is " + ageInSomeYear1 + " this year");

		// PERSON 2
		// Start by printing the event of birth.	
		System.out.println("Pn 2 was born in " + birthYear2);

		// Now we will go through the years between birth and last year.
		int someYear2 = birthYear2 + 1;
		int ageInSomeYear2 = 1;
		while (someYear2 != presentYear)
		{
			System.out.println("Pn 2 was " + ageInSomeYear2 + " in " + someYear2);
			someYear2++;
			ageInSomeYear2++;
		} // while
		
		// Finally, the age of the person this year.
		System.out.println("Pn 2 is " + ageInSomeYear2 + " this year");
	} // main

} // class AgeHistory2