// Program to print out an isosceles right angled triangle.
// The height (which is also width) is given as an artument.
// We assume the argument represents a positive integer.
public class PrintTriangle
{
	public static void main(String [] args)
	{
		//The height (also the width) of the traingle.
		int height = Integer.parseInt(args[0]);

		// Print out height number of rows.
		for (int row = 1; row <= height; row++)
		{
			// Print out row number of cells, on the same line.
			//for (int column = 1; column <= row; column++)

			// coffee 6.5.2
			for (int column = 1; column <= height - row + 1; column++)
			System.out.print("[_]");
			// End of line.
			System.out.println();
		} // for
	} // main

} // class PrintTriangle