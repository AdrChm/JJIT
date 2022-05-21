public class TimesTable
{
	public static void main(String [] args)
	{
		int multiplier = Integer.parseInt(args[0]);

		System.out.println("--------------------------------");
		System.out.println("| Times table for " +  multiplier);
		System.out.println("--------------------------------");
		for (int thisNumber = 1; thisNumber <= 10; thisNumber = thisNumber + 1)
			System.out.println("| " + thisNumber + " x " + multiplier
					  + " = " + thisNumber * multiplier);
		System.out.println("--------------------------------");
	}
}