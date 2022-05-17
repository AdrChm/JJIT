public class CelsiusToFarenheit
{
	public static void main(String [] args)
	{
		double celsiusValue = Double.parseDouble(args[0]);
		double farenheitValue = celsiusValue * 9 / 5 + 32;
		System.out.println("Temperature " + celsiusValue + " Celsius"
				   + " in Farenheit is " + farenheitValue + ".");
	}
}