public class CompoundInterestKnownTarget
{
	public static void main(String [] args)
	{
		double initialInvestment = Double.parseDouble(args[0]);
		double targetInvest = Double.parseDouble(args[1]);
		double interestRate = Double.parseDouble(args[2]); 
		int noOfYearsInvestedSoFar = 0;
		double currentBalance = initialInvestment;

		while( currentBalance < targetInvest)
		{
			//noOfYearsInvestedSoFar = noOfYearsInvestedSoFar + 1;
			noOfYearsInvestedSoFar++;
			//currentBalance = currentBalance + currentBalance * interestRate/100;
			currentBalance += currentBalance * interestRate/100;
		}
		System.out.println(initialInvestment + " invested at interest rate "
							+ interestRate + "%");
		System.out.println("After " + noOfYearsInvestedSoFar + " years,"
							+ " the balance will be " + currentBalance);
	}
}