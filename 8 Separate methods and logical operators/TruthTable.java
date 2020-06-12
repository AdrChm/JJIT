// Program prints out the truth table 
// for two hardcoded propositional expressions p1 and p2.
// The expression have two boolean variables, a, b and c.
// Each locumn of the table ocuppies 7 characters plus separator.
public class TruthTable
{
	// First propositional expression, p1.
	private static boolean p1(boolean a, boolean b, boolean c)
	{
		return a && (b || c);
	} // p1


	// Second propositional expression, p2.
	private static boolean p2(boolean a, boolean b, boolean c)
	{
		return a || b && a || c;
	} // p2


	// Print a line of underscores as wide as the truth table.
	private static void printStraightLine()
	{
		System.out.println(" --------------------------------------- ");
	} // printStraightLine


	// Print the heading for the truth table.
	private static void printHeadings()
	{
		System.out.println("|   a   |   b   |   c   |  p1   |  p2   |");
	} // printHeadings 


	// Print a line of underscores 
	// with vertical bars for the column separators.
	private static void printColumnsLine()
	{
		System.out.println("|_______|_______|_______|_______|_______|");		
	} // printColumnsLine


	// To print a row, we use formatRowItem to make the 
	// column entires have 7 characters.
	private static void printRow(boolean a, boolean b, boolean c)
	{
		System.out.println("|" + formatRowItem(a) + "|" + formatRowItem(b)
							 + "|" + formatRowItem(c)
							 + "|" + formatRowItem(p1(a, b,c ))
							 + "|" + formatRowItem(p2(a, b,c )) + "|");		
	} // printRow	


	// Take a boolean row item and return a string of 7 characters
	// to represent that item.
	private static String formatRowItem(boolean rowItem)
	{
		return rowItem ? " true  " : " false ";
	} // formatRowItem


	// The main method has nested loops to generate table rows.
	public static void main(String[] args)
	{
		printStraightLine();
		printHeadings();
		printColumnsLine();

		// Start off with all three variables being ture.
		boolean a = true, b = true, c = true;

		// Execute twice for the 'a' variable
		// and ensure 'a' goes from true to false.
		for(int aCount = 1; aCount <= 2; aCount++, a = !a)
			// Do the same for 'b' for each 'a' value.
			for(int bCount = 1; bCount <= 2; bCount++, b = !b)
			// Do the same for 'c' for each 'b' value.
				for(int cCount = 1; cCount <= 2; cCount++, c = !c)
			// Print a row for each a, b and c combination.
				printRow(a, b, c);
			
		printColumnsLine();
	} // main

} // class ThuthTable 