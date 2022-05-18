public class PassFailDistinction
{
	public static void main(String [] args)
	{
		int studentMark = Integer.parseInt(args[0]);
		
		if(studentMark >= 50)
			System.out.println("Pass"); 
		else
			System.out.println("Fail");
		if(studentMark >= 70)
			System.out.println("Distinction");
	}
}