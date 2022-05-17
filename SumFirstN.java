public class SumFirstN
{
	public static void main(String [] args)
	{
		int n = Integer.parseInt(args[0]);	
		int sumOfFirstN = (n + 1) / 2 * n;
		System.out.println("The sum of first " + n + " numbers is " + sumOfFirstN);
	}
}