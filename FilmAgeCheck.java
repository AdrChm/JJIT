// Program to check the ages of a queue of film goers.
// First argument is the minimum age required.
// Remaining arguments is the ages of people in the queue.
public class FilmAgeCheck
{
	public static void main(String [] args)
	{
		// The minimum age required to watch a movie
		int minimumAge = Integer.parseInt(args[0]);
		
		// The number of underage people found so far, initially 0.
		int underAgeCountSoFar = 0;
		
		// We loop through the queue, checking each age.
		for(int queuePosition = 1; queuePosition < args.length; queuePosition++)
		{
			int ageOfPersonAtQueuePosition = Integer.parseInt(args[queuePosition]);
			if (ageOfPersonAtQueuePosition < minimumAge)
			{
				System.out.println("The person at position " + queuePosition 
						  + " is only " + ageOfPersonAtQueuePosition
						  + ", which is less than " + minimumAge);
				underAgeCountSoFar++; 
			} // if	
		} // for

		// Now report how many underage were found.
		if (underAgeCountSoFar  == 1)
			System.out.println("There is 1 under age");
		else
			System.out.println("There are " + underAgeCountSoFar + " under age");	

	} // main

} // FilmAgeCheck class