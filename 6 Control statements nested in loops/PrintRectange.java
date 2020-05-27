// Program to print out a rectange.
// The width and then the height are given as arguments.
// We assume the arguments represent positive integers.
public class PrintRectange
{
	public static void main(String [] args)
	{
		// The width of the rectangle, in cells.
		int width = Integer.parseInt(args[0]);

		// The height of the rectangle, in cells.
		int height = Integer.parseInt(args[1]);

		// Print out height number of rows.
		for (int row = 1; row <= height; row++)
		{
			for (int column = 1; column <= width; column++)
				System.out.print("[_]");
			//End the line
			System.out.println();
		} // for

	} // main

} // PrintRectange class