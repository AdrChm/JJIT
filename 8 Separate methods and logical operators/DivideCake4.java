// Program to decide how to divide cake in proportion to age of four
// persons, using the minimum number of equal sized portions.
// The four arguments are positive integer ages.
public class DivideCake4
{

	// Arguments: takes four ages.
	public static void main(String [] args)
	{

	// Gettings persons age
	int age1 = Integer.parseInt(args[0]);
	int age2 = Integer.parseInt(args[1]);
	int age3 = Integer.parseInt(args[2]);
	int age4 = Integer.parseInt(args[3]);

	// Calculating common GCD

	// Calculation of CGD of age1 and age2
	int gCD = greatestCommonDivisor(age1, age2);

	// Calculation of CGD of GCD(age1 and age2) and age3
	gCD = greatestCommonDivisor(gCD, age3);

	// // Calculation of CGD of GCD(age1 and age2 and 3) and age4
	gCD = greatestCommonDivisor(gCD, age4);

	// Calculating total pieces 
	System.out.println("The cake should be divided into "
						 + (age1 + age2 + age3 + age4)/gCD);
	System.out.println(age1 + " year old gets " + age1/gCD + " pieces,\n" 
						+ age2 + " year old gets " + age2/gCD + " pieces,\n"
						+ age3 + " year old gets " + age3/gCD + " pieces,\n"
						+ age4 + " year old gets " + age4/gCD + " pieces");
	} // main

	// calculates the greatest common divisor of two given positive integers
	public static int greatestCommonDivisor(int age1, int age2)
	{
			//calculate GCD
			while (age1 != age2)
				if(age1 > age2)
					age1 -= age2;
				else
					age2 -= age1;
			return age1;

	} // greatestCommonDivisor
}