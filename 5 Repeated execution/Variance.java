public class Variance
{
	public static void main(String [] args)
	{
		double meanAverage = Double.parseDouble(args[0]);
		double variance = 0;

		//for ( int argsIndex = 1; argsIndex < args.length; argsIndex = argsIndex + 1)
		for ( int argsIndex = 1; argsIndex < args.length; argsIndex++)
			//meanAverage = meanAverage + Double.parseDouble(args[argsIndex]);
			meanAverage += Double.parseDouble(args[argsIndex]);

		meanAverage = meanAverage / args.length;

		//for ( int argsIndex = 0; argsIndex < args.length; argsIndex = argsIndex + 1)
		for ( int argsIndex = 0; argsIndex < args.length; argsIndex++)
			//variance = variance + Math.pow(meanAverage - Double.parseDouble(args[argsIndex]),2);
			variance += Math.pow(meanAverage - Double.parseDouble(args[argsIndex]),2);

		//variance = variance / args.length;
		variance /= args.length;

		System.out.println("The mean average is " + meanAverage +
							"\nThe variance is " + variance);
	}
}