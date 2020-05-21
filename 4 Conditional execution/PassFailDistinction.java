public class PassFailDistinction
{
	public static void main(String [] args)
	{
		double score = Double.parseDouble(args[0]);

		if(score>=50){
				System.out.println("Pass");
			if(score>=70)
				System.out.println("Distinction");
		}else{
			System.out.println("Fail");
		}
	}
}