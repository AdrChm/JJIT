// This programs prints table, which displays if crossing values 
// has GCD greater than 1 (by displaying # in respective cross section)
public class CommonFactorsTable
{
	public static void main(String [] args)
	{
		// Printing heading opening line 
		System.out.print("|-----|");
		for(int column = 2; column <= 20; column++)
			System.out.print("---");

		// Right side of the line
		System.out.println("-|");
		
		// Priting heading 
		System.out.print("|     |");
		for(int column = 2; column <= 20; column++)
			if(column < 10)
				System.out.print("  " + column);
			else 
				System.out.print(" " + column);	
		
		System.out.println(" |");
		
		// Printing heading closing line 
		System.out.print("|-----|");
		for(int column = 2; column <= 20; column++)
			System.out.print("---");
		System.out.println("-|");
		
		// Printing table rows 
		for(int row = 2; row <= 20; row++)
		{
				// Row left side.
				if(row < 10)
					System.out.print("|   " + row + " |");
				else
					System.out.print("|  " + row + " |");
			// Printing column of the row
			for(int column = 2; column <= 20; column++)
			{	

					
				// Calculating the GCD
				int GCDvalue = row;
				int GCDvalue2 = column;
				
				while(GCDvalue != GCDvalue2)
					if(GCDvalue > GCDvalue2)
						GCDvalue -= GCDvalue2;
					else
						GCDvalue2 -= GCDvalue;
				
				if(GCDvalue == 1)
					System.out.print("--|");
				else
					System.out.print("--#");
					
				
	
			} // for - column

			// Row right side.	
			System.out.println(" |");

		} // for - row
			
		// Printing table closing line 
		System.out.print("|-----|");
		for(int column = 2; column <= 20; column++)
			System.out.print("---");
		System.out.println("-|");		
				
		
				} // main 
} // CommonFactorTable class
