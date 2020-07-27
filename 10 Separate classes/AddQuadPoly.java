// Finally, first program to be written completely by myself
// This program is about adding two quadratic polynomials 
// and displaying final result
public class AddQuadPoly
{
	private static QuadPoly firstPoly; 
	private static QuadPoly secondPoly;
	private static QuadPoly resultPoly; 

	public static void main (String [] args)
	{
		firstPoly = new QuadPoly(Double.parseDouble(args[0]),
								 Double.parseDouble(args[1]),
								 Double.parseDouble(args[2]));

		secondPoly = new QuadPoly(Double.parseDouble(args[3]),
								  Double.parseDouble(args[4]),
								  Double.parseDouble(args[5]));	

		resultPoly = new QuadPoly(firstPoly.a + secondPoly.a, 
								  firstPoly.b + secondPoly.b, 
								  firstPoly.c + secondPoly.c);


		System.out.print("Polynomial:		");
		firstPoly.printQuadPoly();
		System.out.print("\nadded to: 		");
		secondPoly.printQuadPoly();
		System.out.print("\nresults in:	 	");
		resultPoly.printQuadPoly();
		System.out.println();

	} // main 

} // AddQuadPoly class 