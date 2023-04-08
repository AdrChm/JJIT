// By user input, gets dimensions of fish tank and produces
// volume of such fish tank.
// Gives an error message if arguments are not a valid natural numbers.
public class FishTankVolume
{
	public static void main(String [] args)
	{
		boolean inputValidity = true;

		if(args.length <= 2)
			inputValidity = false;
		else
			for(String argument : args)
				if(!isInteger(argument))
					inputValidity = false;

		if(inputValidity)
		{
			int width = Integer.parseInt(args[0]);
			int depth = Integer.parseInt(args[1]);
			int height = Integer.parseInt(args[2]);
			int volume = width * depth * height;

			System.out.println("The volume of a tank with dimensions "
					+ "(" + width + "," + depth + "," + height + ") "
					+ "is " + volume);
		} // if
		else
			System.out.println("Given input is not a list of proper integers, try again.");

	} // main

	// Helper method to validate user input.
	private static boolean isInteger(String input)
	{
		// If any character is not a digit.
		for (int index = 0; index < input.length(); index++)
			if(!Character.isDigit(input.charAt(index)))
				return false;

		// If entered value exceeds integer capacity.
		if(Long.parseLong(input) > Integer.MAX_VALUE)
			return false;

		return true;
	} // isInteger

} // class FishTankVolume