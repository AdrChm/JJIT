// Program to print out an isosceles right angled traingle
// The height (which is also the width) is given as an argument.
// We assume the argument represents a positive integer.
public class PrintTriangle
{
	public static void main(String [] args)
	{
		// The height (also the width) of the traingle.
		int height = Integer.parseInt(args[0]);

		// Print out height number of rows.
		for (int row = 1; row <= height; row++)
		{
			// Print out number of cells, on the same line.
			for (int column = 1; column <= row; column++)
				System.out.print("[_]");
			// End the line.
			System.out.println();
			
		} // for
	} // main
} // PrintTriangle class