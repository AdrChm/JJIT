// Program finds GCD of 3 integers.
// This is for dividing a cake between those accordingly to their age.
public class DivideCake3
{
	public static void main(String [] args)
	{
		// Input is non negative interegers
		int age1 = Integer.parseInt(args[0]);
		int age2 = Integer.parseInt(args[1]);
		int age3 = Integer.parseInt(args[2]);		
		
		// Calculating GCD of first two arguments
		int GCDArgument = age1;
		int GCDArgument2 = age2; 
		
		// Euclidean algorithm
		while(GCDArgument != GCDArgument2)
			if(GCDArgument > GCDArgument2)
				GCDArgument -= GCDArgument2;
			else
				GCDArgument2 -= GCDArgument;
		
		
		// now GCDArgument and GCDArgument2 are equal,
		// so one of them is replaced with third argument
		GCDArgument2 = age3;

		// and Euclidean algorithm is run again 
		while(GCDArgument != GCDArgument2)
			if(GCDArgument > GCDArgument2)
				GCDArgument -= GCDArgument2;
			else
				GCDArgument2 -= GCDArgument;

		// Based on GCD the amount of cake pieces for each 
		// person is calculated proportionally to their age
		int cakePieces1 = age1 / GCDArgument;
		int cakePieces2 = age2 / GCDArgument;
		int cakePieces3 = age3 / GCDArgument;

		// Program's output message
		System.out.println("The cake should be divided into " + (cakePieces1 + cakePieces2 + cakePieces3)
				  + "\nThe " + age1 + " years old gets " + cakePieces1 
				  + "\nThe " + age2 + " years old gets " + cakePieces2
				  + "\nThe " + age3 + " years old gets " + cakePieces3);
		
	} // main

} // DivideCake3 class