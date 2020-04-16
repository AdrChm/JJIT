public class AgeNextYear
{
	public static void main(String[] args)
	{
		int myAgeNow;
		int myAgeNextYear;

		myAgeNow = Integer.parseInt(args[0]);
		myAgeNextYear = myAgeNow + 1;
		System.out.println("My age now is " + myAgeNow);
		System.out.println("My age next year will be: " + myAgeNextYear);
	}	
}