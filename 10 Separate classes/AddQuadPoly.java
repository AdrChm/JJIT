// Finally, first program to be written completely by myself
// This program is about adding two quadratic polynomials 
// and displaying final result
public class AddQuadPoly
{
	private static QuadPoly firstPoly; 
	private static QuadPoly secondPoly;
	private static QuadPoly resultPoly; 

	// extension method made for adding uknown amount of quadratic polynomials
	// it also handles cases of lacking values by giving them 0 
	// method parameter is args length
	public static void main (String [] args)
	{

		// first Poly
		switch(args.length)
		{
			// wiem, że brzydko, ale to dla Mario pytanie
			case 0:
				firstPoly = new QuadPoly(0,0,0);
			break;

			case 1:
				firstPoly = new QuadPoly(Double.parseDouble(args[0]),0,0);
			break;

			case 2: 
				firstPoly = new QuadPoly(Double.parseDouble(args[0]),
									 	Double.parseDouble(args[1]),0);
			break;
			default:
				firstPoly = new QuadPoly(Double.parseDouble(args[0]),
									 	Double.parseDouble(args[1]),
									 	Double.parseDouble(args[2]));
		}

		System.out.print("Polynomial:		");
		firstPoly.printQuadPoly();

		// second and other polies
		int checkedArguments = 3;  

		int secondPolyAX2 = 0;
		int secondPolyBX = 0;
		int secondPolyC = 0;

		while(args.length >= checkedArguments)
		{

			// second value
			switch(args.length-checkedArguments)		
			{
				// zbędny, ale dla pewności zostawię
				case 0:
					secondPoly = new QuadPoly(0,0,0);
				break;

				case 1:
					secondPoly = new QuadPoly(Double.parseDouble(args[checkedArguments]),0,0);
					secondPolyAX2 += Double.parseDouble(args[checkedArguments]);
				break;

				case 2: 
					secondPoly = new QuadPoly(Double.parseDouble(args[checkedArguments]),
										  	Double.parseDouble(args[checkedArguments+1]),0);
					secondPolyAX2 += Double.parseDouble(args[checkedArguments]);
					secondPolyBX += Double.parseDouble(args[checkedArguments+1]);
				break;

				default:
					secondPoly = new QuadPoly(Double.parseDouble(args[checkedArguments]),
											  Double.parseDouble(args[checkedArguments+1]),
											  Double.parseDouble(args[checkedArguments+2]));
					secondPolyAX2 += Double.parseDouble(args[checkedArguments]);
					secondPolyBX += Double.parseDouble(args[checkedArguments+1]);
					secondPolyC += Double.parseDouble(args[checkedArguments+2]); 

			} // switch case 

			System.out.print("\nadded to: 		");
			secondPoly.printQuadPoly();

			checkedArguments += 3;

		} // while

		resultPoly = new QuadPoly(secondPolyAX2, secondPolyBX, secondPolyC);

		System.out.print("\nresults in:	 	");
		resultPoly.printQuadPoly();
		System.out.println();		


		/* This piece of code is an old version of the program
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

		*/

	} // main 

} // AddQuadPoly class 