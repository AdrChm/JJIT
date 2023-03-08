// Other version of MinimumBitWidth class
public class MinimumBitWidthByDoubling
{
	public static void main(String [] args)
	{
		int numberOfValues = Integer.parseInt(args[0]);
		int noOfBits = 0;
		double doubledValue = 1;
		
		if(numberOfValues<2)
		doubledValue = 2;

		while (doubledValue < numberOfValues)
		{
			noOfBits = noOfBits + 1;
			doubledValue = Math.pow(2,noOfBits);

			
			/* chapter review - fix and refactor (removed code)			
			// monitoring purposes
			System.out.println(noOfBits + "," + doubledValue);

			//inflinite loop fix
			if(doubledValue < 0)
			{
				doubledValue = numberOfValues;
				System.out.println("Given input exceeded maximum allowed value "
				+ "of 1073741825, so the result displayed below is incorrect");
			}
			*/
		}
		
		System.out.println("You need " + noOfBits + " bits to represent "
				  + numberOfValues + " values");
	}
}