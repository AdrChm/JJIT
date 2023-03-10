// Program to print out a neat x by x multiplication table, where x is the size of the table
// Which is given as input argument
public class TimesTable
{
	// The size of the table -- the number of rows and columns.
	private static int tableSize = 12;
	
	// The main method implements the top structure of the table.
	public static void main(String [] args)
	{
	
		// Top line.
		printLine();
		
		// Column headings.
		printColumnHeadings();

		// UnderlineHeadings
		printLine();

		// Now the rows.
		for(int row =1; row <= tableSize; row++)
			printRow(row);

		// Bottom line.
		printLine();	

	} // main

	// Print line across the table.
	private static void printLine()
	{
		// Left side, 5 characters for row labels, separator.
		System.out.print("|-----|");

		// Across each column.
		for (int column = 1; column <= tableSize; column++)
			// 4 character for each column.
			System.out.print("----");

		// The right side.
		System.out.println("-|");

	} // printLine

	// Print the line containing the column headings.
	private static void printColumnHeadings()
	{
		System.out.print("|     |");
		for (int column = 1; column <= tableSize; column++)
			printNumber(column);
			System.out.println(" |");		
		
	} // printColumnHeadings

	// Print one row of the table.
	private static void printRow(int row)
	{
		// The left side.
			System.out.print("|");	
		printNumber(row);	
		// Separator
		System.out.print(" |");	

		// Now for the columns on this row.
		for (int column = 1; column <= tableSize; column++)
			printNumber(row * column);
		
		// The right side.
		System.out.println(" |");			
	
	} // printRow


	private static void printNumber(int numberToPoint)
	{
		if (numberToPoint < 10)
			System.out.print("   " + numberToPoint);
		else if (numberToPoint < 100)
			System.out.print("  " + numberToPoint);
		else
			System.out.print(" " + numberToPoint);		
	
	} // printNumber





/*		 
		// Coffee 6.6.1 update - provide input for size flexibility
		int size = Integer.parseInt(args[0]);	

			// Need to make column number always occupy 4 characters.
			if (column < 10)	
				System.out.print("   " + column);					
			else 
				System.out.print("  " + column);


		for (int row = 1; row <= size; row++)	
		{
			// Need to make row nubmer always occupy 7 characters
			// including vertical lines.
			if(row < 10)
				System.out.print("|   " + row + " |");
			else 
				System.out.print("|  " + row + " |");					
			
			// Now the column on this row.
			for (int column = 1; column <= size; column++)	
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
		
*/					

} // TimesTable class