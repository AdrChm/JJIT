public class LargestSquare2
{
	public static void main(String [] args)
	{
		int input = Integer.parseInt(args[0]);
		int largestSquare = 0;

		while(Math.pow(largestSquare,2) < input)
			//largestSquare = largestSquare + 1;
			largestSquare++;
		
		//balancing increased value after last iteration
		largestSquare--;
		System.out.println("Largest square in " + input + " is " + largestSquare);
	}
}