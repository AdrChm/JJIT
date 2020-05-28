// This program prints mirrored triangle of PrintTriangle class
// Prints isosceles triangle, which height is equal to its basis
// and its taken as only input argument
public class PrintTriangleMirror
{
	public static void main(String [] args)
	{

		// height = basis
		int height = Integer.parseInt(args[0]);

		// column
		for (int column = 0; column < height; column++)
		{
			//row
			for(int row = 1; row <= height; row++)
				// printing
				if(row > column)
					System.out.print("[_]");
				else
					System.out.print("   ");
			System.out.println();

		} // for

	} // main

} // class PrintTriangleMirror