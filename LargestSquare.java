public class LargestSquare
{
	public static void main(String [] args)
	{
		int givenNumber = Integer.parseInt(args[0]);
		double rootValue = Math.sqrt(givenNumber);
		double floorValue = Math.floor(rootValue);

		System.out.println("The biggest square for " + givenNumber 
				  + " is " + floorValue);
	}
}