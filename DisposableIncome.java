public class DisposableIncome
{
	public static void main(String [] args)
	{
		int salary = Integer.parseInt(args[0]);
		int martgage = Integer.parseInt(args[1]);
		int bills = Integer.parseInt(args[2]);
		int disposableIncome = salary - (martgage + bills);

		System.out.println("Your salary:\t" + salary
				  +"\nYour martgage:\t" + martgage 
				  +"\nYour bills:\t" + bills
				  +"\nDisposable:\t" + disposableIncome);
	}
}
