public class LargestSquare3
{
	public static void main(String [] args)
	{
		int input = Integer.parseInt(args[0]);
		double largestSquare = Math.sqrt(input);
		double largestSquare2 = Math.sqrt(input);

		// 1
		largestSquare = Math.floor(Math.sqrt(input));

		// 2
		//String covertion = largestSquare2+"";
		//int value = Integer.parseInt(covertion);
		int value = (int) largestSquare2;

		while(Math.pow(value,2) > input)
			//value = value - 1;
			value--;
		System.out.println("(method1)Largest square in " + input + " is " + largestSquare);
		System.out.println("(method2)Largest square in " + input + " is " + value);

	}
}