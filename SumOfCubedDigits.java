// Program finds numbers which sum of Cubes digit is equal to that number
public class SumOfCubedDigits
{
	public static void main(String [] args)
	{
		for (int digit1 = 1; digit1 <= 9; digit1++)
			for (int digit2 = 0; digit2 <= 9; digit2++)
				for (int digit3 = 0; digit3 <= 9; digit3++)	
				{
					if(Math.pow(digit1,3) + Math.pow(digit2,3) + Math.pow(digit3,3)
					  == Integer.parseInt("" + digit1 + digit2 + digit3))
						System.out.println(digit1 + "^3 + " + digit2 + "^3 + " + digit3
								  + "^3 = " + digit1 + digit2 + digit3);
				} // for	
	} // main
} // SumOfCubeDigits class