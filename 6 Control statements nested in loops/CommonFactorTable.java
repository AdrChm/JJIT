// Prints matrix of following numbers, indicating its greatest common divisor
// Made from scratch, as I want to make it on my own.
// In a better way, I hope
// New feature: takes argument for displaying values from 2 - n,
// where n is input argument
// New feature 2: print is suitable for 4 digit numbers, 
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
			int numbers = Integer.parseInt(args[0]);

			// integer check
			if(numbers < 2)
				System.out.println("Given argument must be greater than 1");
			else
			{
				// first line
				System.out.print("|-----|");
				for (int row = 2; row <= numbers; row++)
					System.out.print("----");
				System.out.println("-|");

				// second line
				System.out.print("|     |");
				for (int row = 2; row <= numbers; row++)
					if(row < 10)
						System.out.print("   "+row);
					else 
						System.out.print("  "+row);					
				System.out.println(" |");			

				// third line
				System.out.print("|-----|");
				for (int row = 2; row <= numbers; row++)
					System.out.print("----");
				System.out.println("-|");

				// matrix - row
				for (int row = 2; row <= numbers; row++)
				{
					// first column
					if(row < 10)
						System.out.print("|   " + row + " |");
					else
						System.out.print("|  " + row + " |");

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
				} // for - row

				//last line
				System.out.print("|-----|");
				for (int row = 2; row <= numbers; row++)
					System.out.print("----");
				System.out.println("-|");
			}
		} // validation
		else
			System.out.println("To execute the program one argument is needed");

	} // main

} // class CommonFactorTable