public class OldestSpouse
{
	public static void main (String [] args)
	{
		int husbandsAge = Integer.parseInt(args[0]);
		int wifesAge = Integer.parseInt(args[1]);

		if(husbandsAge > wifesAge)
			System.out.println("The husband is older than the wife");
		else if (husbandsAge == wifesAge)
			System.out.println("The husband is the same age as the wife");
		else
			System.out.println("The husband is younger than the wife");
	}
}