public class MeanAverage
{
	public static void main(String [] args)
	{
		int sumSoFar = Integer.parseInt(args[0]);

		for ( int argsIndex = 1; argsIndex < args.length; argsIndex = argsIndex + 1)
			sumSoFar = sumSoFar + Integer.parseInt(args[argsIndex]);

		System.out.println("The mean average is " + sumSoFar / (double) args.length);
	}
}