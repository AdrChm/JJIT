public class MeanAverage
{
	public static void main(String [] args)
	{
		int sumSoFar = Integer.parseInt(args[0]);
		
		for(int argIndex = 1; argIndex < args.length; argIndex = argIndex + 1)
			sumSoFar = sumSoFar + Integer.parseInt(args[argIndex]);

		System.out.println("The mean average is " + sumSoFar / (double) args.length);
	}
}