public class FarenheitToCelsius
{
	public static void main(String [] args)
	{
		double farenheitValue = Double.parseDouble(args[0]);
		double celsiusValue = (farenheitValue - 32) * 5 / 9;
		System.out.println("Farenheit:\t " + farenheitValue + "\nCelsius:\t " 
				  + celsiusValue);	
	}
}