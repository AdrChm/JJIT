public class RoundPennies
{
	public static void main(String[] args)
	{
		int pennies = Integer.parseInt(args[0]);
		int result = pennies + 50;

		System.out.println("You have: " + result/100 + " pounds");
	}
}