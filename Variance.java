public class Variance
{
	public static void main(String [] args)
	{
		int argsSum = Integer.parseInt(args[0]);
		double argsMeanAverage;
		double deviationSum = 0;
		double variance; 
			
		for(int argsIndex = 1; argsIndex < args.length; argsIndex = argsIndex + 1)
			argsSum = argsSum + Integer.parseInt(args[argsIndex]);

		argsMeanAverage = argsSum/(double) args.length;
		System.out.println("The mean average is " + argsMeanAverage);

		for(int argsIndex = 0; argsIndex < args.length; argsIndex = argsIndex + 1)
			deviationSum = deviationSum + Math.pow(argsMeanAverage - Integer.parseInt(args[argsIndex]),2);	
		
		variance = deviationSum / args.length;
		System.out.println("The variance is " + variance);			
	}
}