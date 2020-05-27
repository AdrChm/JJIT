public class MaxList
{
	public static void main(String [] args)
	{
		//Entry check, if list has any arguments 
		if(args.length > 0)
		{
			// first argument is automatically first max value 
			double currentMax = Double.parseDouble(args[0]);
			int maxPosition = 0;
		
			//interation starting from second argument
			for(int argumerntPosition = 1; argumerntPosition < args.length; argumerntPosition++)

				// check if next arguments are bigger than current max
				if(Double.parseDouble(args[argumerntPosition]) > currentMax)
				{
					currentMax = Double.parseDouble(args[argumerntPosition]);
					maxPosition = argumerntPosition;
				}

			System.out.println("The biggest number in the list is " + currentMax
								 + " at " + maxPosition + " position.");

		} // if args > 0
		else
			System.out.println("No arguments given!");
	} // main

} // MaxList class 