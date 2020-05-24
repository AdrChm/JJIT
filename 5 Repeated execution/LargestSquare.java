public class LargestSquare
{
	public static void main(String [] args)
	{
		int input = Integer.parseInt(args[0]);
		int largestSquare = input;

		while(Math.pow(largestSquare,2) > input)
			largestSquare = largestSquare - 1;

		System.out.println("Largest square in " + input + " is " + largestSquare);

	}
}