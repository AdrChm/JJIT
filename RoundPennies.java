public class RoundPennies
{
	public static void main(String [] args)
	{
		int pennies = Integer.parseInt(args[0]);
		int rawPounds = (pennies)/100;
		int theRest = pennies - rawPounds*100;

		/* chapter review (before)
		int theRestRound = theRest*2/100;
		*/
		int theRestRound = theRest/50;
		System.out.println("You have "+ (rawPounds + theRestRound) + " pounds");
		 
		

	}
}
