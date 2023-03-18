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
		System.out.println("The polynomial:\t\t" + displayQuadPoly(firstQuadPoly));

		// firstQuadPoly < secondQuadPoly
		if (firstQuadPoly.isLessThan(secondQuadPoly))
			System.out.println("is smaller than:\t" + displayQuadPoly(secondQuadPoly));	
		
		// firstQuadPoly == secondQuadPoly
		else if (firstQuadPoly.isEqualTo(secondQuadPoly))
			System.out.println("is the same as:\t\t" + displayQuadPoly(secondQuadPoly));

		// firstQuadPoly > secondQuadPoly
		else 
			System.out.println("is greater than:\t" + displayQuadPoly(secondQuadPoly));

	} // main 

	// Creates quadratic polynomial String to display it in a proper manner.
	private static String displayQuadPoly(QuadPoly q)
	{
		String polyString = q.coefficientOfx2 + "x^2 + "
				    + q.coefficientOfx + "x + " + q.constant;
		return polyString;
	} // displayQuadPoly

} // class CompareQuadPoly