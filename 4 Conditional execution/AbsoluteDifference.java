public class AbsoluteDifference
{
	public static void main(String [] args)
	{
		double firstNumber = Double.parseDouble(args[0]);
		double secondNumber = Double.parseDouble(args[1]);
		double absoluteDifference; 
		if(firstNumber > secondNumber)
		{
			absoluteDifference = firstNumber - secondNumber;
			System.out.println("The first number is larger than the second");
		}
		else if(firstNumber < secondNumber)
		{
			absoluteDifference = secondNumber - firstNumber;
			System.out.println("The second number is larger than the first");
		}
		else
		{
			absoluteDifference = 0;
			System.out.println("Two numbers are equal");

		}
		System.out.println("Ther absolute difference is " + absoluteDifference);
	}
}