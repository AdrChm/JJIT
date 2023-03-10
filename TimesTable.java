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
				 
		// Coffee 8.5.1 update - string formatting with printf

			System.out.printf("%4d", numberToPoint);		
	
	} // printNumber

} // TimesTable class