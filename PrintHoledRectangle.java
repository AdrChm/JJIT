public class PrintHoledRectangle
{
	public static void main(String [] args)
	{
		// Assumed input is positive integers
		int height = Integer.parseInt(args[0]);
		int width = Integer.parseInt(args[1]);
			
		// To be properly displayed rectangle has to have dimentions at leaset equal to 3 
		// and its size should be an odd number
		if(width%2 ==  0)
			width++;
		if(height%2 == 0)
			height++;
		
		if(width < 3)
			width = 3;
		if(height < 3)
			height = 3;	

		// Iterating though rows
		for (int row = 0; row < width; row++)
		{	
			// Iterating though columns
			for (int column = 0; column < height; column++)
			{
				// print squares - logical NAND for middle row and column
				if(!(row == width/2 && column == height/2))
					System.out.print("[_]");

				// center cell has to be empty
				else	
					System.out.print("   ");
			
			} // for - columns
			System.out.println();

		} // for - rows						
	} // main

} // PrintHoledRectangle class