public class LargestSquare
{
	public static void main(String [] args)
	{
		int givenNumber = Integer.parseInt(args[0]);
		int squaredNumber = givenNumber;
		double squareValue = Math.pow(squaredNumber,2);
	
		while (givenNumber < squareValue)
		{
			squaredNumber = squaredNumber -1;
			squareValue = Math.pow(squaredNumber,2);
		}
		System.out.println("The biggest square for " + givenNumber 
				  + " is " + squaredNumber);
	}
}