public class Power
{
	public static void main(String [] args)
	{
		int base = Integer.parseInt(args[0]);
		int power = Integer.parseInt(args[1]);
		double result  = 1;
		
		if(power != 0)
			for(int counter = 1; counter <= power; counter = counter + 1)
				result = result * base; 

		System.out.println(base + "^" + power + " = " + result);

	}
}