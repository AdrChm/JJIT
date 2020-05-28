// Program finds three digit numbers, which sum of the cubes 
// of its digits is equal to this number
public class SumOfCubeDigits
{
	public static void main(String [] args)
	{
		for(int firstValue = 1; firstValue < 10; firstValue++)
			for(int secondValue = 0; secondValue < 10; secondValue++)
				for(int thirdValue = 0; thirdValue < 10; thirdValue++)
				{
					//creation of the number 
					int number = firstValue * 100 + secondValue * 10 + thirdValue;

					// comparing with cubes
					if((Math.pow(firstValue,3) + Math.pow(secondValue,3) + Math.pow(thirdValue,3)) == number)
						System.out.println(number + " = " + firstValue + "^3 + " + secondValue + "^3 + " + thirdValue + "^3");
				} // for

	} // main

} // class SumOfCubeDigits