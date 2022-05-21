public class MinimumBitWidth
{
	public static void main(String [] args)
	{
		int numberOfValues = Integer.parseInt(args[0]);
		int noOfBits = 0;
		int doubledValue = 1;

		while (doubledValue < numberOfValues)
		{
			noOfBits = noOfBits + 1;
			doubledValue = doubledValue * 2;
		System.out.println(noOfBits + "," + doubledValue);
		}
		System.out.println("You need " + noOfBits + " bits to represent "
				  + numberOfValues + " values");
	}
}