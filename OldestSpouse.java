public class OldestSpouse
{
	public static void main (String [] args)
	{
		int husbandsAge = Integer.parseInt(args[0]);
		int wifesAge = Integer.parseInt(args[1]);

		if(husbandsAge > wifesAge)
			System.out.println("The husband is older than the wife");
		else
			System.out.println("The husband is not older than the wife");
	}
}