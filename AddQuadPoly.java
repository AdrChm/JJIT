// This program adds quadratic polynomials making one as the result.
public class AddQuadPoly
{

	public static void main(String [] args)
	{

		// Result QuadPoly
		QuadPoly resultQuadPoly = new QuadPoly();

		// QuadPoly to add subsequent quadratic polygonials. 
		QuadPoly quadPolyBoTeAdded;

		// Cover cases for 0, 1, 2 and 3 arguments.
		// This has to separated from the loop due to required String outup
		QuadPoly firstQuadPoly; 
		if (args.length <= 3)
		{
			if(args.length == 3)
				firstQuadPoly = new QuadPoly(Double.parseDouble(args[0]), 
						     	     Double.parseDouble(args[1]),
						    	     Double.parseDouble(args[2]));

			// Creates first QuadPoly 
			else if (args.length == 2)
				firstQuadPoly = new QuadPoly(Double.parseDouble(args[0]), 
								 Double.parseDouble(args[1]));
			// 
			else if (args.length == 1)
				firstQuadPoly = new QuadPoly(Double.parseDouble(args[0]));
	
			// args.length == 0
			else 
				firstQuadPoly = new QuadPoly();

			// Creates second QuadPoly
			quadPolyBoTeAdded = new QuadPoly();

			// There is no need to create third QuadPoly as first is the answer.
			System.out.println("Polynomial:\t" + firstQuadPoly
				   		  + "\nadded to:\t" + quadPolyBoTeAdded
 				   		  + "\nresults in:\t" + firstQuadPoly);

		} // if 
		// 3+ arguments
		else 
		{
			// Creates first polyQuad.
			firstQuadPoly = new QuadPoly(Double.parseDouble(args[0]), 
						     Double.parseDouble(args[1]),
						     Double.parseDouble(args[2]));
			System.out.println("Polynomial:\t" + firstQuadPoly);
			
			// Updates result polyQuad.
			resultQuadPoly = firstQuadPoly;

			// Arguments iterated though the loop.
			int argumentsUsedSoFar = 3;
		
			// Loop includes elements consecutive arguments.	
			// Each time requiring three new elements.
			while(argumentsUsedSoFar < args.length) 
			{
				// there are 3 elements 
				if((args.length - argumentsUsedSoFar) >= 3)
					quadPolyBoTeAdded = new QuadPoly(Double.parseDouble(args[argumentsUsedSoFar]), 
									 Double.parseDouble(args[argumentsUsedSoFar + 1]),
									 Double.parseDouble(args[argumentsUsedSoFar + 2]));

				else if ((args.length - argumentsUsedSoFar) == 2) 
					quadPolyBoTeAdded = new QuadPoly(Double.parseDouble(args[argumentsUsedSoFar]), 
									 Double.parseDouble(args[argumentsUsedSoFar + 1]));
				// args.length - argumentsUsedSoFar) %3 == 1
				else 	
					quadPolyBoTeAdded = new QuadPoly(Double.parseDouble(args[argumentsUsedSoFar]));

				// update
				argumentsUsedSoFar += 3;
				
				// Add output row
				System.out.println("added to:\t" + quadPolyBoTeAdded);	
				
				// Update result QuadPoly
				resultQuadPoly = resultQuadPoly.addQuadPoly(quadPolyBoTeAdded);

			}// while

			// Display the result.
			System.out.println("results in:\t" + resultQuadPoly);

		} // else

	} // main

} // AddQuadPoly