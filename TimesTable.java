// Program to print out a neat 10 by 10 multiplication table.
public class TimesTable
{
	public static void main(String [] args)
	{
		// Top line.
		// Left side, 5 characters for row labels, separator.
		System.out.print("|-----|");
		// Above the column headings.
		for (int column = 1; column <= 10; column++)
			// 4 character for each column.
			System.out.print("----");
		// The right side.
		System.out.println("-|");

		// Column headings.
		System.out.print("|     |");
		for (int column = 1; column <= 10; column++)
			// Need to make column number always occupy 4 characters.
			if (column < 10)	
				System.out.print("   " + column);					
			else 
				System.out.print("  " + column);
			System.out.println(" |");

		// Now the rows.
		for (int row = 1; row <= 10; row++)	
		{
			// Need to make row nubmer always occupy 7 characters
			// including vertical lines.
			if(row < 10)
				System.out.print("|   " + row + " |");
			else 
				System.out.print("|  " + row + " |");					
			
			// Now the column on this row.
			for (int column = 1; column <= 10; column++)	
			{
				int product = row * column;
				// Need to make product always occupy 4 characters.
				if (product < 10)
					System.out.print("   " + product);
				else if (product < 100)
					System.out.print("  " + product);
				else
					System.out.print(" " + product);		
			} // for
			
			// The right side.
			System.out.println(" |");
		} // for
		
		// Bottom line -- same as Top line.
		System.out.print("|-----|");
		for (int column = 1; column <= 10; column++)
			System.out.print("----");
		System.out.println("-|");	
					
	} // main
} // TimesTable class