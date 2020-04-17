public class SumFirstN
{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		int sumOfFirstN = (1 + n) * n / 2 ;
		System.out.println("The sum of first " + n + " number is " + sumOfFirstN);

		//coffee 3.6.2
		//int sumOfFirstN2 = (1 + n) / 2 * n + n/2; 
		//System.out.println("The sum of first " + n + " number is " + sumOfFirstN2);		
	}
}