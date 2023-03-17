// This program adds two quadratic polynomials making third one.
public class AddQuadPoly
{

	public static void main(String [] args)
	{
		// Create first polynomial.
		QuadPoly quadPoly1 = new QuadPoly(Double.parseDouble(args[0]),
						  Double.parseDouble(args[1]),
						  Double.parseDouble(args[2]));

		// Create second polynomial.
		QuadPoly quadPoly2 = new QuadPoly(Double.parseDouble(args[3]),
						  Double.parseDouble(args[4]),
						  Double.parseDouble(args[5]));

		// Adding polynomials. 
		QuadPoly quadPoly3 = addQuadPoly(quadPoly1, quadPoly2);

		// Display the result.
		System.out.println("Polynomial:\t" + displayQuadPoly(quadPoly1)
				   + "\nadded to:\t" + displayQuadPoly(quadPoly2)
 				   + "\nresults in:\t" + displayQuadPoly(quadPoly3));
		
	} // main

	// adds coefficients fo given quadratic polymonials and return result.
	private static QuadPoly addQuadPoly(QuadPoly quadPoly1, QuadPoly quadPoly2)
	{
		QuadPoly quadPoly = new QuadPoly(quadPoly1.coefficientOfx2 + quadPoly2.coefficientOfx2,
					 	  quadPoly1.coefficientOfx + quadPoly2.coefficientOfx,
					  	  quadPoly1.constant + quadPoly2.constant);
	
		return quadPoly;
	} // addQuadPoly
	
	// Creates quadratic polynomial String to display it in a proper manner.
	private static String displayQuadPoly(QuadPoly q)
	{
		String polyString = q.coefficientOfx2 + "x^2 + "
				    + q.coefficientOfx + "x + " + q.constant;
		return polyString;
	} // displayQuadPoly

} // AddQuadPoly