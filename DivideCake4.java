// Program counts amount of cake pieces for 4 people celebrating a bithday
// proportionally to thier age
// 4 arugemnts: age of each person 
// input is assumed to be positive integers.
public class DivideCake4
{
	public static void main(String [] args)
	{

		int age1 = Integer.parseInt(args[0]);
		int age2 = Integer.parseInt(args[1]);
		int age3 = Integer.parseInt(args[2]);
		int age4 = Integer.parseInt(args[3]);

		// amount of cake pieces is the greatest common divisor of given integers.
		int finalGCD = greatestCommonDivisor(greatestCommonDivisor(age1, age2), 
						     greatestCommonDivisor(age3, age4));
		System.out.println("The GCD of " + age1 + ", " + age2 + ", " + age4 + " and " + age4 
				  + " is " + finalGCD);

		int cakePieces1 = age1 / finalGCD; 	
		int cakePieces2 = age2 / finalGCD;
		int cakePieces3 = age3 / finalGCD;
		int cakePieces4 = age4 / finalGCD;

		System.out.println("So the cake should be divided into "
				  + (cakePieces1 + cakePieces2 + cakePieces3 + cakePieces4));
		
		System.out.println(printPortions(age1, cakePieces1));
		System.out.println(printPortions(age2, cakePieces2));
		System.out.println(printPortions(age3, cakePieces3));
		System.out.println(printPortions(age4, cakePieces4));
		
	} // main

	private static int greatestCommonDivisor(int age1, int age2)
	{
		while(age1 != age2)
			if(age1 > age2)
				age1 -= age2;
			else 
				age2 -= age1;
		return age1;

	} // greatestCommonDivisor

	private static String printPortions(int age, int numberOfPortions)
	{
		return "Person " + age + " year old gets " + numberOfPortions + " pieces"; 
				  
	} // printPortions

} // DivideCake4 class