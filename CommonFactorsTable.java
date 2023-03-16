// This programs prints table, which displays if crossing values 
// has GCD greater than 1 (by displaying # in respective cross section)
public class CommonFactorsTable
{
	private static int size = 20;
	
	public static void main(String [] args)
	{

		// Printing heading opening line 
		printLine(size);
		
		// Priting heading 
		printHeading(size);
		
		// Printing heading closing line 
		printLine(size);
		
		// Printing table rows 
		printTableRow(size);	

		// Printing table closing line 
		printLine(size);
			
	} // main
 
	// Printing line across the table 
	private static void printLine(int size)
	{
		System.out.print("|-----|");

		for(int column = 2; column <= size; column++)
			System.out.print("---");

		// Right side of the line
		System.out.println("-|");
		
	} // printLine

	// Printing column heading
	private static void printHeading(int size)
	{
		System.out.print("|     |");

		for(int column = 2; column <= size; column++)
			System.out.printf("%3d", column);	

		// Right side of the line
		System.out.println(" |");
		
	} // printHeading
	
	// verifies if GCD of given numbers is greater than 1
	private static boolean isGCDBiggerThanOne(int a, int b)
	{
		// Euclidean algorithm
		while(a != b)
			if(a > b)
				a -= b;
			else
				b -= a;
				
		return a == 1? false : true;
	} // isGCDBiggerThanOne

	// prints row with GCD calculation result
	private static void printTableRow(int size)
	{
		for(int row = 2; row <= size; row++)
		{
			// Row left side.
			System.out.printf("| %3d |", row);

			// Printing column of the row
			for(int column = 2; column <= size; column++)
			{	
				// Calculating the GCD
				System.out.print(isGCDBiggerThanOne(column, row)? "--#" : "--|");
	
			} // for - column

			// Row right side.	
			System.out.println(" |");

		} // for - row

	} // printTableRow

} // CommonFactorTable class
