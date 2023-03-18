// Compares two quadratic polynomials.
public class CompareQuadPoly
{
	public static void main(String [] args)
	{

		// First quadPoly.
		QuadPoly firstQuadPoly = new QuadPoly(Double.parseDouble(args[0]), 
					     Double.parseDouble(args[1]),
					     Double.parseDouble(args[2]));

		// Second quadPoly.
		QuadPoly secondQuadPoly = new QuadPoly(Double.parseDouble(args[3]), 
					      Double.parseDouble(args[4]),
					      Double.parseDouble(args[5]));
		// Display first output line.
		System.out.println("The polynomial:\t\t" + firstQuadPoly.toString());

		// firstQuadPoly < secondQuadPoly
		if (firstQuadPoly.isLessThan(secondQuadPoly))
			System.out.println("is smaller than:\t" + secondQuadPoly.toString());	
		
		// firstQuadPoly == secondQuadPoly
		else if (firstQuadPoly.isEqualTo(secondQuadPoly))
			System.out.println("is the same as:\t\t" + secondQuadPoly.toString());

		// firstQuadPoly > secondQuadPoly
		else 
			System.out.println("is greater than:\t" + secondQuadPoly.toString());

	} // main 

} // class CompareQuadPoly