// Program to print out the truth table.
// two hardcoded propositional expressions p1 and p2.
// The expression have three boolean varaibles, a, b and c.
// Each column of table ocupies 7 characters plus separator.
public class TruthTable
{
	// The first propositional expression, p1.
	private static boolean p1(boolean a, boolean b, boolean c)
	{
		return a && (b || c);
	} // p1

	// The second propositional expression, p2.
	private static boolean p2(boolean a, boolean b, boolean c)
	{
		return a && b || a && c;
	} // p2

	// Print a line of underscores as wide as the truth table.
	private static void printStraightLine()
	{
		System.out.println(" _______________________________________ ");
	} // printStraightLine

	// Print the headings of the truth table.
	private static void printHeadings()
	{
		System.out.println("|   a   |   b   |   c   |  p1   |  p2   |");
	} // printHeadings

	// Print a line of underscores
	// with vertical bartds for the column separators.
	private static void printColumnsLine()
	{
		System.out.println("|_______|_______|_______|_______|_______|");
	} // printlnColumnsLine
	
	// To print a row, we use formatRowItem to make the
	// column entries have 7 characters.
	private static void printRow(boolean a, boolean b, boolean c)
	{
		System.out.println("|" + formatRowItem(a) +  "|" + formatRowItem(b)
				   + "|" + formatRowItem(c)
				   + "|" + formatRowItem(p1(a,b,c))
				   + "|" + formatRowItem(p2(a,b,c)) + "|");
	} // printRow

	// Take a boolean row item and return 7 characters	
	// to represent that item.
	private static String formatRowItem(boolean rowItem)
	{
		return rowItem ? " true  " : " false ";
	} // formatRowItem
	
	// The main method has nested loops to generate table rows.
	public static void main(String [] args)
	{
		printStraightLine();
		printHeadings();
		printColumnsLine();

		// Stat of with all three variables being true.
		boolean a = true, b = true, c = true;
		
		// Exectute twice for 'a' variable,
		// and resure 'a' goes from true to false.
		for (int aCount = 1; aCount <= 2; aCount++, a = !a)
			// Do the same for 'b' for each 'a' value.
			for (int bCount = 1; bCount <= 2; bCount++, b = !b)
				// Do the same for 'c' for each 'b' value.
				for (int cCount = 1; cCount <= 2; cCount++, c = !c)
					// Print a row for each a,b and c combination.
					printRow(a, b, c);		
		
		printColumnsLine();	
	} // main

} // TruthTable
