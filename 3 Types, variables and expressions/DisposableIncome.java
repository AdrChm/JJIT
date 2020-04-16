public class DisposableIncome
{
	public static void main(String[] args)
	{
		int salary = Integer.parseInt(args[0]);
		int mortgage = Integer.parseInt(args[1]);
		int bills = Integer.parseInt(args[2]);
		int disposableIncome = salary - (mortgage + bills);
		System.out.println("Your salary:\t" + salary
							+ "\nYour mortgage:\t" + mortgage
							+ "\nYour bills:\t" + bills
							+ "\nDisposable:\t" + disposableIncome);
	}
}