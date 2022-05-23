// Program to produce birthday greetings appropriate to the age of the user
// which is given as an argument.
public class BirthdayGreeting 
{
	public static void main(String [] args)
	{
		// The user's age.
		int ageToday = Integer.parseInt(args[0]);
		
		// Give a message appropriate to the user's age.
		System.out.print(ageToday + " today! ");
		switch(ageToday)
		{
			case 100:
				System.out.println("Your telegram is in the post!");
				break;
			case 99: case 89: case 79: case 69: case 59: case 49: case 39: case 29:
			case 19: case 9: 	
				System.out.println("One more to a milestone!");
				break;
			case 90: case 80: case 70: case 60: case 50: case 20: case 10:	
				System.out.println("Another milestone!");
				break;
			case 40: 
				System.out.println("Life begins today.");
				System.out.println("(Or so they say.)");
				break;
			case 30: 
				System.out.println("Time to get flirty!");
				System.out.println("(Before its too late!)");
				break;
			case 18: 
				System.out.println("Hooray -- you can vote!");
				System.out.println("(But will you bother?)");
				break;
			case 17: 
				System.out.println("Get cracking on that driving licence!");
				break;
			case 16: case 15: case 14: 
				System.out.println("IT'S STILL NOT FAAAAIIIIR!");
				break;
			case 13: 
				System.out.println("IT'S NOT FAAAAIIIIR!");
				break;
			case 7: 
				System.out.println("From now you must act your age.");
				System.out.println("(Not your shoe size!)");
				break;
			default:
				System.out.println("Happy birthday!");
				break;	
		} // switch		
	
	} // main
} // BirthdayGreeting class 