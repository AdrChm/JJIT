public class YearsBeforeRetirement
{
	public static void main(String [] args)
	{
		int myAgeNow;
		int retirementAge;
		int yearsBeforeRetirement;

		myAgeNow = 29;
		retirementAge = 68;
		yearsBeforeRetirement = retirementAge - myAgeNow;

		System.out.println("My age now is " + myAgeNow);
		System.out.println("I will retire at the age of " + retirementAge );
		System.out.println("Years left working is " + yearsBeforeRetirement);
	}
}