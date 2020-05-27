// Print out rectangle with a whole in its centre.
// Whole is a single missing object, which prints spaces instead.
// To ensure there is a whole, sides must be odd number, so given
// arguments are changed to odd numbers
public class PrintHoledRectangle
{
	public static void main(String [] args)
	{
		// First argument is width
		int width = Integer.parseInt(args[0]);
		// Second argument
		int heigth = Integer.parseInt(args[1]);

		if(width<2)
			System.out.println("Given width is too small to make proper rectangle!");
		if(heigth<2)
			System.out.println("Given height is too small to make proper rectangle!");
		
		// ensuring odd values
		width = width/2 * 2 + 1;
		heigth = heigth/2 * 2 + 1;

		// printing
		for (int row = 0; row < width; row++)
		{
			for (int column = 0; column < heigth; column++)
			{
				if(row==(width/2))
				{
					if(column==(heigth/2))
						System.out.print("   ");	
					else
						System.out.print("[_]");					
				} // if
				else
					System.out.print("[_]");

			} // for column

			System.out.println();			

		} // for row

	} // main

} // PrintHoledRectangle class