public class AgeNextYear
{
	public static void main(String [] args)
	{
		int myAgeNow;
		int myAgeNextrYear;

		myAgeNow = Integer.parseInt(args[0]);
		myAgeNextrYear = myAgeNow + 1;

		System.out.println("My age now is " + myAgeNow);
		System.out.println("My age next year will be " + myAgeNextrYear);
	}
}