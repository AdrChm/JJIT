// Program to decide how to divide a cake in proportions to the age of two
// persons, using the minimum number of equal sized portions.
// The two argumentss are the ttwo positive integer ages.
public class DivideCake
{
	public static void main(String [] args)	
	{
		
		// Both ages must be positive
		// First person's age 
		int age1 = Integer.parseInt(args[0]);
		// Second person's age
		int age2 = Integer.parseInt(args[1]);
		
		// This is a multiple of the GCD, initially age1
		int multipleOfGCD = age1;
		// This is a multiple of the GCD, initially age2
		int multiple2OfGCD = age2;

		// Compute the GCD of multipleOfGCD and multiple2OfGCD
		// While the two multiplies are not the same, the difference
		// between them must also be a multiple of the GCD.

		// E.g. X = x + d, Y = y* d; (X - Y) = (x - y) * d

		// So we will keep substracting the smallest from the largest
		// until they are equal
		while (multipleOfGCD != multiple2OfGCD)
			if(multipleOfGCD > multiple2OfGCD)
				multipleOfGCD -= multiple2OfGCD;
			else 
				multiple2OfGCD -= multipleOfGCD;

		// Now multipleOfGCD ==	multiple2OfGCD
		// Which is also the GCD of age1 and age2.
		System.out.println("The GCD of " + age1 + " and " + age2
				  + " is " + multipleOfGCD);

		// Calculate the number of portions for each person.
		int noOfPortions1 = age1 / multipleOfGCD; 
		int noOfPortions2 = age2 / multipleOfGCD;

		// Report the total number of portions.
		System.out.println("So the cake should be devided into " + (noOfPortions1 + noOfPortions2));

		// Report the number of portions for each person.
		System.out.println("Person " + age1 + " years old gets " + noOfPortions1
				  + " and the " + age2 + " years old gets " + noOfPortions2);
			
	} // main 

} // DivideCake class
