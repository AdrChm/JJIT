//Finiding GCD of three numbers
public class DivideCake3
{
	public static void main(String [] args)
	{
		// arguments number validation
		if(args.length != 3)
			System.out.println("Incorrect number of arguments!");

		// arguments collection
		int age1 = Integer.parseInt(args[0]);
		int age2 = Integer.parseInt(args[1]);
		int age3 = Integer.parseInt(args[2]);

		// arguments validation
		if (age1 > 0)
		{
			if(age2 > 0)
			{
				if(age3 > 0)
				{
					// calculating first GCD
					int firstGCD = age1;
					int secondGCD = age2;

					while(firstGCD != secondGCD)
						if(firstGCD > secondGCD)
							firstGCD -= secondGCD;
						else
							secondGCD -= firstGCD;

					// calculating second GCD
					secondGCD = age3;

					while(firstGCD != secondGCD)
						if(firstGCD > secondGCD)
							firstGCD -= secondGCD;
						else
							secondGCD -= firstGCD;

					// Displaying 
					System.out.println("The GCD of " + age1 + ", " + age2 + " and "
										+ age3 + " is " + secondGCD);

					// Calculating amount of pieces 
					int firstNumberOfPieces = age1 / secondGCD;
					int secondNumberOfPieces = age2 / secondGCD; 
					int thirdNumberOfPieces = age3 / secondGCD;

					// Display the total number of portions.
					System.out.println("So the cake should be devided into "
						 				+ (firstNumberOfPieces + secondNumberOfPieces + thirdNumberOfPieces));
					
					// Display number of pieces for each person
					System.out.println("The " + age1 + " year old gets " + firstNumberOfPieces 
										+ ",\nthe " + age2 + " year old gets " + secondNumberOfPieces
										+ ",\nthe " + age3 + " year old gets " + thirdNumberOfPieces);

				} // if age3
			} // if age2
		} // if age1
		else
			System.out.println("All argumets must be greater than zero!"); 
	} // main

} // DivideCake3 class