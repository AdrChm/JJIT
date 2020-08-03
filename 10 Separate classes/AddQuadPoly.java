// Finally, first program to be written completely by myself
// This program is about adding two quadratic polynomials 
// and displaying final result
public class AddQuadPoly
{


	// extension method made for adding uknown amount of quadratic polynomials
	// it also handles cases of lacking values by giving them 0 
	// method parameter is args length
	public static void main (String [] args)
	{

		// 1 class variables should not be created unless it is necessary
		QuadPoly firstPoly; 
		QuadPoly secondPoly;
		QuadPoly resultPoly; 

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
		} // switch 

		System.out.println("Polynomial:		" + firstPoly.toString());

		if(args.length == 3)
		{
			secondPoly = new QuadPoly(0,0,0);
			System.out.println("added to: 		" + secondPoly.toString());
		}
		// second and other polynomials 

		double secondPolyAX2 = 0;
		double secondPolyBX = 0;
		double secondPolyC = 0;

		for(int checkedArguments = 3; args.length > checkedArguments; checkedArguments+=3)
		{

			if(args.length-checkedArguments == 1)
			{
				secondPoly = new QuadPoly(Double.parseDouble(args[checkedArguments]),0,0);
				secondPolyAX2 += Double.parseDouble(args[checkedArguments]);			
			} 
			else if (args.length-checkedArguments == 2)
			{
				secondPoly = new QuadPoly(Double.parseDouble(args[checkedArguments]),
									  	Double.parseDouble(args[checkedArguments+1]),0);
				secondPolyAX2 += Double.parseDouble(args[checkedArguments]);
				secondPolyBX += Double.parseDouble(args[checkedArguments+1]);
			}
			// args.length - checkedArguments > 3 
			else
			{
				secondPoly = new QuadPoly(Double.parseDouble(args[checkedArguments]),
										  Double.parseDouble(args[checkedArguments+1]),
										  Double.parseDouble(args[checkedArguments+2]));
				secondPolyAX2 += Double.parseDouble(args[checkedArguments]);
				secondPolyBX += Double.parseDouble(args[checkedArguments+1]);
				secondPolyC += Double.parseDouble(args[checkedArguments+2]); 
			} 

			System.out.println("added to: 		" + secondPoly.toString());

		} // for loop


		/*
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
		*/

		resultPoly = new QuadPoly(secondPolyAX2 + firstPoly.a,
								  secondPolyBX + firstPoly.b,
								  secondPolyC + firstPoly.c);

		System.out.println("results in:	 	" + resultPoly.toString());	


	} // main 

} // AddQuadPoly class 