// By user input, gets dimensions of fish tank and produces
// volume of such fish tank.
// Gives an error message if arguments are not a valid natural numbers.
public class FishTankVolume
{
	public static void main(String [] args)
	{
		try
		{
			// Arguments number exception.
			if(args.length != 3)
				throw new ArrayIndexOutOfBoundsException(
						"Program will work properly only when three arguments are provide.");

			int width = Integer.parseInt(args[0]);
			int depth = Integer.parseInt(args[1]);
			int height = Integer.parseInt(args[2]);

			// Negative numbers exception.
			if(width < 0 || depth < 0 || height < 0)
				throw new NumberFormatException(
						"Program will work properly only when all arguments are non-negative numbers.");

			int volume = width * depth * height;

			System.out.println("The volume of a tank with dimensions "
					+ "(" + width + "," + depth + "," + height + ") "
					+ "is " + volume);
		} // try
		catch (ArrayIndexOutOfBoundsException exception)
		{
			System.err.println("the problem: " + exception.getCause());
			System.err.println(exception);
		} // catch
		catch (NumberFormatException exception)
		{
			System.out.println("Given input is not a list of proper integers.");
			System.err.println("the problem: " + exception.getCause());
			System.err.println(exception);
		} // catch
		catch (Exception exception)
		{
			System.out.println("Unexpected error occurred.");
			System.err.println("the problem: " + exception.getCause());
			System.err.println(exception);
		} // catch
	} // main
} // class FishTankVolume