// A program to estimate Pi using Leibniz's formula.
// Argument is desired tolerance between successive terms.
// Reports the estimate, the number of terms
// and the librart constant for comparison.
public class PiEstimation
{
	public static void main(String [] args)
	{
		// The tolerance is hte minimum difference between successive		
		// terms before we stop estimating 
		double tolerance = Double.parseDouble(args[0]);

		// The value of the latest term.
		double latestTerm;

		// The result form our latest estimate, eventually the final result.
		double latestEstimate = 4;

		// We count the terms, initially 1 for the 4.
		long termCountSoFar = 1;

		// The value of the next term denominator, initially 3.
		long nextDenominator = 3;

		// The sign of the next term, initially -ve.
		int nextNumeratorSign = -1;

		// Keep adding terms until lastest term is within tolerance.
		do
		{
			
			latestTerm = nextNumeratorSign * 4.0 / nextDenominator;
			latestEstimate += latestTerm; 
			termCountSoFar++;		
			nextNumeratorSign *= -1;
			nextDenominator += 2;
		} while (Math.abs(latestTerm) > tolerance);	

		System.out.println("The estimated value of Pi to tolerance " + tolerance
				   + " is " + latestEstimate);		
		System.out.println("The estimate used " + termCountSoFar + " terms");
		System.out.println("The library values of Pi is " + Math.PI);
	} // main

} // PiEstimation class