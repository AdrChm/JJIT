public class Power
{
	public static void main(String [] args)
	{
		int base = Integer.parseInt(args[0]);
		int power  = Integer.parseInt(args[1]);
		int result = 1;
		//excersise meantioned only non-negative values

		if(base == 0)
			if(power > 0)
				result = 0;


		//for (int i = 1; i <= power; i = i + 1)
		for (int i = 1; i <= power; i++)
			//result = base * result;
			result *= base;
		
		System.out.println(base + " to power " + power + " equars " + result);

	}
}