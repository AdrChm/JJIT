public class MinimumBitWidth
{
	public static void main(String [] args)
	{
		//fix 1

		int numberOfValues = Integer.parseInt(args[0]);
		double numberOfValues2 = Double.parseDouble(args[0]);
		int noOfBits = 0;

		int speedUpVariable = 1;

		while(speedUpVariable < numberOfValues2/2)
		//while(speedUpVariable < numberOfValues)
		{
			//speedUpVariable = speedUpVariable * 2;
			speedUpVariable *=2;
			//noOfBits = noOfBits + 1;
			noOfBits++;

		}
		//noOfBits = noOfBits + 1;
		noOfBits++;

		System.out.println("You need " + noOfBits + " bits to represent "
							+ numberOfValues + " values");

		// fix 2

		int numberOfValues3 = Integer.parseInt(args[0]);
		int noOfBits2 = 0;
		long speedUpVariable2 = 1;

		while(speedUpVariable2 < numberOfValues3)
		//while(speedUpVariable < numberOfValues)
		{
			//speedUpVariable2 = speedUpVariable2 * 2;
			speedUpVariable2 *= 2;
			//noOfBits2 = noOfBits2 + 1;
			noOfBits2++;

		}


		System.out.println("You need " + noOfBits2 + " bits to represent "
							+ numberOfValues3 + " values");
	}
}