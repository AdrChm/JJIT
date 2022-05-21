public class DegreeCategory
{
	public static void main(String [] args)
	{
		int points = Integer.parseInt(args[0]);

		if(points >= 70)
			System.out.println("Honours, first class");
		else if(points >= 60)
			System.out.println("Honours, second class, division one");
		else if(points >= 50)
			System.out.println("Honours, second class, division two");
		else if(points >= 40)
			System.out.println("Honours, third class");
		else if(points >= 32)
			System.out.println("Pass / ordinary degree");
		else
			System.out.println("Fail");
		
	}
}