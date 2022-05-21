public class MinimumBitWidth
{
	public static void main(String [] args)
	{
		int numberOfValues = Integer.parseInt(args[0]);
		int noOfBits = 0;

		while (Math.pow(2, noOfBits) < numberOfValues)
			noOfBits = noOfBits + 1;
		System.out.println("You need " + noOfBits + " bits to represent "
				  + numberOfValues + " values");
	}
}