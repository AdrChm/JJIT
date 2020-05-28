// Class created based on example from ape 108
// User need to guess a number and insert it as an argument
public class Lottery
{
	public static void main(String [] args)
	{
		int userGuess = Integer.parseInt(args[0]);

		switch(userGuess)
		{
			// no break for 98 means execution of the next option
			case 98: case 100:				
			System.out.println("You are close!");
			break;

			case 99:
			System.out.println("Bingo! You win!");
			System.out.println("You have guessed it correctly");
			break; 

			default:
			System.out.println("You are pathetic!");
			System.out.println("Have another guess.");
			break;

		} // switch

	} // main

} // class Lottery
