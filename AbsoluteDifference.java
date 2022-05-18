public class AbsoluteDifference
{
	public static void main(String [] args)
	{
		double firstNumber = Double.parseDouble(args[0]);
		double secondNumber = Double.parseDouble(args[1]);
		double absoluteDifference;

		if(firstNumber > secondNumber)
		{
			System.out.println("The first number is larger that the second");
			absoluteDifference = firstNumber - secondNumber;			
		}
		else if	(firstNumber == secondNumber)
		{
			System.out.println("The two numbers are equal");
			absoluteDifference = 0;			
		}
		else
		{
			System.out.println("The second number is larger that the first");
			absoluteDifference = secondNumber - firstNumber;			
		}
			System.out.println("The absolute difference is " + absoluteDifference);	
	}
}