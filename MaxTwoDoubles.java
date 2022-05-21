public class MaxTwoDoubles
{
	public static void main(String [] args)
	{
		double firstValue = Double.parseDouble(args[0]);
		double secondValue = Double.parseDouble(args[1]);
		
		if(firstValue > secondValue)
			System.out.println(firstValue + " is bigger than " + secondValue);
		else
			System.out.println(firstValue + " is not bigger than " + secondValue);
	}
}