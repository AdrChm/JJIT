// program compares two quadratic polynomials 
// 

public class CompareQuadPoly
{
	public static void main(String [] args)
	{

		QuadPoly firstPoly = new QuadPoly(Integer.parseInt(args[0]),
										  Integer.parseInt(args[1]),
										  Integer.parseInt(args[2]));

		QuadPoly paramPoly = new QuadPoly(Integer.parseInt(args[3]),
										  Integer.parseInt(args[4]),
										  Integer.parseInt(args[5]));

		System.out.print("The polynomial: 	");
		firstPoly.printQuadPoly();

		if(firstPoly.equals(paramPoly))		
			System.out.print("\nis the same as:		");
		else if(firstPoly.lessThan(paramPoly))
			System.out.print("\nis smaller than: 	");
		else
			System.out.print("\nis greater than: 	");

		paramPoly.printQuadPoly();
		System.out.println();		
	}
}