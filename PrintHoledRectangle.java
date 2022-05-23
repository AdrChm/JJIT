public class PrintHoledRectangle
{
	public static void main(String [] args)
	{
		// Assumed input is positive integers
		int height = Integer.parseInt(args[0]);
		int width = Integer.parseInt(args[1]);
			
		// To be properly displayed rectangle has to be based on odd dimentions
		if(width%2 == 0)
			width++;
		if(height%2 == 0)
			height++;

		// Iterating though rows
		for (int row = 0; row < width; row++)
		{	
			// Iterating though columns
			for (int column = 0; column < height; column++)
			{
				// First and last layer is always build with squares	
				if(row == 0 || row == width - 1)
					System.out.print("[_]");
				// In other cases only first and last column prints square
				else
					if(column == 0 || column == height - 1)
						System.out.print("[_]");
					else	
						System.out.print("   ");
			
			} // for - columns
			System.out.println();

		} // for - rows						
	} // main

} // PrintHoledRectangle class