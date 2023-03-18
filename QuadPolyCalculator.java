// This program proviades basic arithmatic operations for quadratic polynomials.
// Addition and substraction, which adds/substracts another quadpoly
// Multiplication/division by constant.
// Between arguments operation sign is necessary, whithout it error will occur
// Starting value of caluculator is 0 0 0 
// Entered polunomials can have less than 3 arguments
// First polynomial sets its value.
// due to console 
public class QuadPolyCalculator
{
	// Verifies if given character is an operator.
	private static boolean isOperator(char element)
	{
		switch(element)
		{	
			case '+': 
			case '-':
			case 'm': 
			case 'd': 
				return true;
			default: return false;
		} // switch

	} // isOperator
	

	public static void main(String [] args)
	{

		// Result QuadPoly
		QuadPoly resultQuadPoly = new QuadPoly();

		// QuadPoly to be processed. 
		QuadPoly processedQuadPoly = new QuadPoly();

		// Keeps index of last operation.
		int elementProcessedSoFar = 0;

		// Type of the operation 
		char operator = '+';

		// Processed arguments counter
		for (int argsIndex = 0; argsIndex < args.length; argsIndex++)
		{			
			// Provides operation based on operator from last iteration
			// Arguments being numbers are omnited.
			if(isOperator(args[argsIndex].charAt(0)) || argsIndex == args.length - 1)
			{	

				// Algoryth shift for last case
				if(argsIndex == args.length - 1)
					argsIndex++;
					
				// Updates result to first polynomial.
				// Then caluclation is new there is no operator given
				switch(argsIndex - elementProcessedSoFar - 1)
				{
					case 3 : 
						processedQuadPoly = new QuadPoly(Double.parseDouble(args[argsIndex-1]), 
							     	     		 Double.parseDouble(args[argsIndex-2]),
						    		     		 Double.parseDouble(args[argsIndex-3]));
					break; 
					case 2 : 
						processedQuadPoly = new QuadPoly(Double.parseDouble(args[argsIndex-1]), 
							     	     		 Double.parseDouble(args[argsIndex-2]));
					break; 
					case 1 : 
						processedQuadPoly = new QuadPoly(Double.parseDouble(args[argsIndex-1]));	
					break; 
				} // switch 

				// When operator was not assigned it means update (+). 
				switch(operator)
				{
					// For this operation only one argument is allowed
					case 'm': 
						resultQuadPoly = resultQuadPoly.multiplyQuadPoly(Double.parseDouble(args[argsIndex-1]));
					break;

					// For this operation only one argument is allowed
					case 'd': 
						resultQuadPoly = resultQuadPoly.divideQuadPoly(Double.parseDouble(args[argsIndex-1]));
					break;

					case '+': 	
						resultQuadPoly = resultQuadPoly.addQuadPoly(processedQuadPoly);
					break;

					case '-':
						resultQuadPoly = resultQuadPoly.substractQuadPoly(processedQuadPoly);
					break;
				} // switch	
				
				// Given loop output
				System.out.println(operator + " " + processedQuadPoly + "\n= " + resultQuadPoly);

				// Updated operator for next operation
				// Avoid assigment at last iteration.
				if(!(argsIndex == args.length))
					operator = args[argsIndex].charAt(0);
					
				// Updates amount of processed elements.
				elementProcessedSoFar = argsIndex;

			} // if
							
		} // for

	} // main

} // class QuadPolyCalculator