public class CompoundInterestKnownYears
{
	public static void main(String [] args)
	{
		double initialInvestment = Double.parseDouble(args[0]);
		double interestRate = Double.parseDouble(args[1]); 
		int noOfYearsInvested = Integer.parseInt(args[2]); 
		double currentBalance = initialInvestment;

		for (int year = 1; year <= noOfYearsInvested; year = year + 1)		
			currentBalance = currentBalance + currentBalance * interestRate/100;

		System.out.println(initialInvestment + " invested at interest rate "
							+ interestRate + "%");
		System.out.println("After " + noOfYearsInvested + " years,"
							+ " the balance will be " + currentBalance);
	}
}