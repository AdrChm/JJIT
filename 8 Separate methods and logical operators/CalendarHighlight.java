// Program to print a callendar for a single given month.
// It is improved version of Callendar class
// The first argument is the number of the start day, 1 to 7
// (Sunday = 1, Moday = 2, ..., Saturday = 7).
// The second argument is the last date in the month, e.g. 31.
// Third argument is day, which will be highlighted
public class CalendarHighlight
{
	public static void main(String [] args)
	{
		printMonth(Integer.parseInt(args[0]), 
			Integer.parseInt(args[1]), 
			Integer.parseInt(args[2]));
	} // main

	// Print the callendar for the month.
	public static void printMonth(int monthStartDay, int lastDateInMonth, int highlightedDay)
	{
		// Keep track of which day (1-7) is the next to be printed out.
		int nextDayColumnToUse = monthStartDay;

		// Keep track of the next date to printed out.
		int nextDateToPrint = 1;

		// The topline of hypens.
		printMonthLineOfHypens();
		// The columns headings.
		printDayNames();

		// We always print out as many row as we need,
		// but with a nimimum of 6 to encourage consistent format.
		int noOfRowsPrintedSoFar = 0;
		while (nextDateToPrint <= lastDateInMonth || noOfRowsPrintedSoFar < 6)
		{
			// Print one row.
			System.out.print("|");
			for (int dayColumnNo = 1; dayColumnNo <= 7; dayColumnNo++)
			{

				// Print a space separator between day columns.
				if (dayColumnNo > 1)
					System.out.print(" ");

				// We either print spaces or a date.
				if(dayColumnNo != nextDayColumnToUse 
					|| nextDateToPrint > lastDateInMonth)
					printDateSpace();
				else
				{
					// Print a marking brackets or spaces 
					printMark(nextDateToPrint, highlightedDay);
					nextDayColumnToUse++;
					nextDateToPrint++;
				} // else
			} // for

			// End the row.
			System.out.println("|");
			noOfRowsPrintedSoFar++;

			// get ready for the next row.
			nextDayColumnToUse = 1;			
		} // while

		// The bottom line of hypens.
		printMonthLineOfHypens();

	} // printMonth 


	// Print a line of hypens as wide as the table,
	// starting and ending with a space so the corners look right.
	private static void printMonthLineOfHypens()
	{
		System.out.print(" ");
		for (int dayColumnNo = 1; dayColumnNo <= 7; dayColumnNo++)
		{
			if ( dayColumnNo > 1) 
				System.out.print("-");
			printDateHypens();
		} // for 
		System.out.println(" ");
	} // printMonthLineOfHypens


	// Print the name headings.
	private static void printDayNames()
	{
		System.out.print("|");
		for (int dayColumnNo = 1; dayColumnNo <= 7; dayColumnNo++)
		{
			if(dayColumnNo > 1)
				System.out.print(" ");
			printDayName(dayColumnNo);
		} // for
		System.out.println("|");
	} // printDayNames


	// Print the day name of given day number, as two characters.
	private static void printDayName(int dayNo)
	{
		// Our days are numbered 1 - 7, from Sunday.
		switch (dayNo)
		{
			case 1: System.out.print(" Su ");
			break;
			case 2: System.out.print(" Mo ");
			break;
			case 3: System.out.print(" Tu ");
			break;
			case 4: System.out.print(" We ");
			break;
			case 5: System.out.print(" Th ");
			break;
			case 6: System.out.print(" Fr ");
			break;
			case 7: System.out.print(" Sa ");
		} // switch
	} // printDayName


	// Print spaces as wide as a date, i.e. two spaces.
	private static void printDateSpace()
	{
		System.out.print("    ");
	} // printDateSpace


	// Print hypens as wide as date, i.e. two hypens.
	private static void printDateHypens()	
	{
		System.out.print("----");		
	} // printDateHypens


	// Print a date, using two characters, with a leading zero if required.
	private static void printDate(int date)
	{
		System.out.printf("%02d",date);
	} // printDate 

	// Additional method for 8.8.2
	// Prints additional spaces or brackets for a day
	private static void printMark(int dayNo, int dayToHighlight)
	{
		if(dayNo!=dayToHighlight)
		{
			System.out.print(" ");
			printDate(dayNo);
			System.out.print(" ");
		}
		else
		{
			System.out.print(">");
			printDate(dayNo);
			System.out.print("<");			
		} 
	}


} // CalendarHighlight class 