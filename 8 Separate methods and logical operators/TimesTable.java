// Program to printout a neat multiplication table.
public class TimesTable
{
	// The size of the table -- the number of rows and columns/
	private static int tableSize = 12;

	// The main menthod implements the top level structure of the table.
	public static void main(String [] args)
	{
		// Top line.
		printLine();

		// Column headings.
		printColumnHeadings();

		// Underline headings.
		printLine();

		// Now the rows.
		for(int row = 1; row <= tableSize; row++)
			printRow(row);

		// Bottom line.
		printLine();

	} // main

	private static void printLine()
	{
		// Left side, 5 characters for row labels, separator.
		System.out.print("|-----|");
		// Across each column.
		for (int column = 1; column <= tableSize; column++)
			System.out.print("----");
		// The right side. 
		System.out.println("-|");		
	} // printLine

	//Print the line containing the column headings.
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

		// Now the columns on this row.
		for(int column = 1; column <= tableSize; column++)
			printNumber(row * column);

		// The right side.
		System.out.println(" |");	
	} // printRow

	private static void printNumber(int numberToPrint)
	{
		if(numberToPrint < 10)
			System.out.print("   " + numberToPrint);
		else if(numberToPrint < 100)
			System.out.print("  " + numberToPrint);	
		else
			System.out.print(" " + numberToPrint);			
	} // printNumber
}