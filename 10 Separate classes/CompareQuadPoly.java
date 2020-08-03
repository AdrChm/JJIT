// extended version of program based on tast 10.3.5
// compares any amount of quadratic polynomials 
// comparing each time different pair - each iteration
// compares n QuadPoly with n+1 QuadPoly
// at the end it also displays the biggest and the smallest polynomial 


public class CompareQuadPoly
{
	public static void main(String [] args)
	{

		QuadPoly firstPoly;
		QuadPoly paramPoly  = new QuadPoly(0,0,0);

		// first polynomial
		switch(args.length)
		{
			case 0:
				firstPoly = new QuadPoly(0,0,0);
			break;

			case 1: 
				firstPoly = new QuadPoly(Integer.parseInt(args[0]),0,0);
			break;

			case 2:
				firstPoly = new QuadPoly(Integer.parseInt(args[0]),
										 Integer.parseInt(args[1]),0);
			break;

			default:
				firstPoly = new QuadPoly(Integer.parseInt(args[0]),
										 Integer.parseInt(args[1]),
										 Integer.parseInt(args[2]));
		} // switch first polynomial

		QuadPoly maxPoly = firstPoly;
		QuadPoly minPoly = firstPoly;

		int checkedArguments = 3;

		
		do // while
		{
			// first step - create second polynomial
			// first polynomial

			if(args.length>3)
				switch(args.length - checkedArguments)
				{

					case 1: 
						paramPoly = new QuadPoly(Integer.parseInt(args[checkedArguments]),0,0);
					break;

					case 2:
						paramPoly = new QuadPoly(Integer.parseInt(args[checkedArguments]),
												 Integer.parseInt(args[checkedArguments+1]),0);
					break;

					default:
						paramPoly = new QuadPoly(Integer.parseInt(args[checkedArguments]),
												 Integer.parseInt(args[checkedArguments+1]),
												 Integer.parseInt(args[checkedArguments+2]));

				} // switch first polynomial	

			// second step - compare

			System.out.print("The polynomial: 		");
			firstPoly.printQuadPoly();

			if(firstPoly.equals(paramPoly))		
				System.out.print("\nis the same as:			");
			else if(firstPoly.lessThan(paramPoly))
			{
				System.out.print("\nis smaller than: 		");
				// the biggest
				maxPoly = paramPoly;
			}
			else
			{
				System.out.print("\nis greater than: 		");
				// the smallest
				minPoly = paramPoly;
			}
			paramPoly.printQuadPoly();
			System.out.println();

			//third step change polynomial assignment
			firstPoly = paramPoly;
			checkedArguments += 3;

		} 
		while(args.length > checkedArguments); // do

		System.out.print("The biggest polynomial is:	");
		maxPoly.printQuadPoly();
		System.out.print("\nThe smallest polynomial is:  	");
		minPoly.printQuadPoly();
		System.out.println();

	} // main 

} // CompareQuadPoly