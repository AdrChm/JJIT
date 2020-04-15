public class YearsBeforeRetirement
{
	public static void main(String[] args)
	{
		int myAgeNow;
		int retirementAge;
		int yearsLeft;

		myAgeNow = 27;
		retirementAge = 68;
		yearsLeft = retirementAge - myAgeNow;

		System.out.println("My age now is " + myAgeNow);
		System.out.println("I will retire at age of " + retirementAge);
		System.out.println("Years left working is " + yearsLeft);
	}
}