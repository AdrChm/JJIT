// Upgraded version of program from 6.6.2, page 103
// Prints matrix of following numbers, indicating its greatest common divisor
// Made from scratch, as I want to make it on my own.
// In a better way, I hope
// New feature: takes argument for displaying values from 2 - n,
// where n is input argument
// New feature 2: print is suitable for up to 4 digit numbers, 
// so it can display much bigger results well
// New feature 3: simple arguments validation (since now on its necessary)
// Note: modulo is still forbidden
public class CommonFactorTable
{
	public static void main(String [] args)
	{
		//arguments validation
		if(args.length==1)
		{
			// Taking 
			int numbers = Integer.parseInt(args[0]);

			// integer check
			if(numbers < 2)
				System.out.println("Given argument must be greater than 1");
			else
			{
				// first line
				drawLine(numbers);

				// second line
				drawNumbers(numbers);		

				// third line
				drawLine(numbers);

				// matrix - row
				for (int row = 2; row <= numbers; row++)
					drawRow(numbers, row);

				//last line
				drawLine(numbers);
			} // else
		} // if -  validation
		else
			System.out.println("To execute the program one argument is needed");

	} // main

	// draws line composed of dashes
	private static void drawLine(int numbers)
	{
				System.out.print("|-----|");
				for (int row = 2; row <= numbers; row++)
					System.out.print("----");
				System.out.println("-|");
	} // drawLine

	// draws row of arguments starting from to n, where n is taken argument
	private static void drawNumbers(int numbers)
	{
		System.out.print("|     |");
		for (int row = 2; row <= numbers; row++)		
			System.out.printf("%4d", row);				
		System.out.println(" |");	
	} // drawNumbers

	// this method draws single row of matrix
	private static void drawRow(int numbers, int row)
	{

			// first column
			System.out.print("|");
			System.out.printf("%4d",row);
			System.out.print(" |");

			// matrix, reminder: no modulo(%) allowed
			for (int column = 2; column <= numbers; column++)
			{
				// GCD
				int firstNumber = row;
				int secondNumber = column;

				while( firstNumber != secondNumber)
					if(firstNumber > secondNumber)
						firstNumber -= secondNumber;
					else 
						secondNumber -= firstNumber;
 
					if(secondNumber!=1)
						System.out.print("---#");
					else
						System.out.print("---|");				

			} // for - column
					System.out.println(" |");

	} // drawRow

} // class CommonFactorTable