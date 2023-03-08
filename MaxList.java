// This program outputs the biggest value from given numbers
public class MaxList
{
	public static void main(String [] args)
	{

		if(args.length != 0)
		{	
			// To save one iteration, first number is declared the biggest			
			double biggerNumberSoFar = Double.parseDouble(args[0]);
			int biggerNumberSoFarIndex = 0;

			for(int index = 1; index < args.length; index++ )
			{
				// Second element necessary to compare 
				double nextListValue = Double.parseDouble(args[index]);

				// Comparison of the biggest number and next list value
				if(biggerNumberSoFar < nextListValue)
				{
					biggerNumberSoFarIndex = index;
					biggerNumberSoFar = nextListValue; 
				} // if
	
			} // for
		
			System.out.println("Max value of the list is " + biggerNumberSoFar 
					  + " at " + biggerNumberSoFarIndex + " position");
		} // if	

		// No arguments case
		else
			System.out.println("No number was given!");
			
			
	} // main

} // MaxList class