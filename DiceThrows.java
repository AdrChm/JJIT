// Program to output all 216 combinations of three six sided dice.
public class  DiceThrows 
{
	public static void main(String [] args)
	{
		// Nested loop produce all 216 combinations of die1 to die3.
		for (int die1 = 1; die1 <= 6; die1++)
			for (int die2 = 1; die2 <= 6; die2++)
				for (int die3 = 1; die3 <= 6; die3++)
					System.out.println(die1 + die2 + die3 + " from "
							  + die1 + "+" + die2 + "+" + die3);	

	} // main
} // DiceThrows class