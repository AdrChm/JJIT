// Program to print a calendar for a single given month.
// The first argument is the number of the start day, 1 to 7
// (Sunday = 1, Monday = 2, ..., Saturday = 7) 
// The second argument is the last date in the month, e.g. 31.
// The third argument is day to be highlighter (within days of given month)
public class CalendarHighlight
{
	public static void main(String [] args)
	{
		printMonth(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
	} // main
	
	// Print the callendar for the next month.
	private static void printMonth(int monthStartDay, int lastDateInMonth, int dateToHighlight)
	{
		// Keep the track of which day (1-7) is the next to be printed out.
		int nextDayColumnToUse = monthStartDay;
		
		// Keep tract of the next date to be printed out.
		int nextDateToPrint = 1;
		
		// Top of the line of hypens.
		printMonthLineHypens();
		
		// The column headings.
		printDayNames();
		
		// We always print out as many rows as we need,
		// but with a minimum of 6 to encourage consistent format.
		int noOfRowsPrintedSoFar = 0;
		while( nextDateToPrint <= lastDateInMonth || noOfRowsPrintedSoFar < 6)
		{
			// Print one row.
			System.out.print("|");
			for (int dayColumnNo = 1; dayColumnNo <= 7; dayColumnNo++)
			{
				// Print a space separator between day columns.
				if (dayColumnNo > 1)
					System.out.print(" ");

				// We either print spaces or a date.
				if (dayColumnNo != nextDayColumnToUse
				   || nextDateToPrint > lastDateInMonth)
					printDateSpace();
				else
				{
					printDate(nextDateToPrint,dateToHighlight);
					nextDayColumnToUse++;
					nextDateToPrint++;
				} // else 
			} // for
			
			// End row.
			System.out.println("|");
			noOfRowsPrintedSoFar++;
			
			// Get ready for the next row.
			nextDayColumnToUse = 1;
		} // while

		// The bottom line of hypens.
		printMonthLineHypens();
	} // printMonth

	// Print a line of hypens as wide as the table,
	// starting and ending with a space so the corners look right.
	private static void printMonthLineHypens()
	{
		System.out.print(" ");
		for (int dayColumnNo = 1; dayColumnNo <= 7; dayColumnNo++)
		{
			if (dayColumnNo > 1)
				System.out.print("-");
			printDateHypens();
		} // for
		System.out.println(" ");		
	} // printMonthLineHypens

	// Print the name headings.
	private static void printDayNames()
	{
		System.out.print("|");
		for (int dayColumnNo = 1; dayColumnNo <= 7; dayColumnNo++)
		{
			if (dayColumnNo > 1)
				System.out.print(" ");
			printDayName(dayColumnNo);
		} // for
		System.out.println("|");			
	} // printDayNames

	// Print the day name of the given day number, as two characters.
	private static void printDayName(int dayNo)
	{
		// our days are numbered 1 - 7, from Sunday.
		// Increased size
		switch (dayNo)
		{
			case 1: System.out.print(" Su "); break;
			case 2: System.out.print(" Mo "); break;
			case 3: System.out.print(" Tu "); break;
			case 4: System.out.print(" We "); break;
			case 5: System.out.print(" Th "); break;
			case 6: System.out.print(" Fr "); break;
			case 7: System.out.print(" Sa "); break;
		} // switch
	} // printDayName

	// Print spaces as wide as a date i.e. two spaces.
	private static void printDateSpace()
	{	
		// Increased size
		System.out.print("    "); 	
	} // printDateSpace 

	// Print spaces as wide as a date i.e. two spaces.
	private static void printDateHypens()
	{	
		// Increased size
		System.out.print("----"); 	
	} // printDateHypens	

	// Print a date, using two characters, with a leading zero if required.
	// If given date is to be higlithed additional marks are given.
	private static void printDate(int date, int dateToHighlight)
	{
		if(date != dateToHighlight)
			System.out.printf(" %02d ", date);
		else
			System.out.printf(">%02d<", date);			
	} // printDate

} // class CalendarHighlight
