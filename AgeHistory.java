import java.util.Scanner;

/* Program to print out the history of any number of named people's ages.
   The age history of a person consists of a statement of thier bnirth on their
   birth date, followed by a statement of their age on each of their birthdays
   which have occured before the present date. Finally it ends with a 
   statement saying what age they will be on their next birthday, including 
   the present date, if their birthday is today. However, if the person has 
   not yet been born, or is born on the present date then their age history 
   consists merely of a statement stating or predicting thier birth.

   It first prompts for the present date, to be entered by user as three
   integers in the order day, month then year. Then it prompts for the number 
   of persons, which is to be entered as a string, and date of birth,
   to be entered as three integers in the order day, month then year. Then it
   produces the age history for that person.  
*/
public class AgeHistory
{
	public static void main(String [] args)
	{
		// For interaction with the user.
		Scanner inputScanner = new Scanner(System.in);
		
		// The date class needs to be told the present date.
		System.out.print("Enter today' date as three numbers, dd mm yyyy: ");
		int day = inputScanner.nextInt();
		int month = inputScanner.nextInt();
		int year = inputScanner.nextInt();
		Date.setPresentDate(new Date(day, month, year));

		// Now find out how many people there are.
		System.out.print("Enter the number of people: ");
		int noOfPeople = inputScanner.nextInt();
		// Skip to the next line of input
		// or else first name will be blank!
		inputScanner.nextLine();

		// For each person...
		for (int personNumber = 1; personNumber <= noOfPeople; personNumber++)
		{
			// Obtain name and birthday.
			System.out.print("Enter the name of person: " + personNumber + ": ");	
			String personName = inputScanner.nextLine();
			System.out.print("Enter his/her birthday (dd mm yyyy): ");
			int birthDay = inputScanner.nextInt();
			int birthMonth = inputScanner.nextInt();
			int birthYear = inputScanner.nextInt();		
			// Skip to the next line, or else next name will be blank!
			inputScanner.nextLine();

			Date birthDate = new Date(birthDay, birthMonth, birthYear);
			Person person = new Person(personName, birthDate);
			System.out.println(person.ageHistory());
		} // for
	} // main

} // class AgeHistory