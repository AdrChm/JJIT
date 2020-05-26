public class SinTable
{
	public static void main(String [] args)
	{
		int startDegree = Integer.parseInt(args[0]);
		int increment = Integer.parseInt(args[1]);
		int endDegree = Integer.parseInt(args[2]);	
		
		System.out.println("--------------------------------");
		System.out.println("Sin table from " + startDegree + " to " + endDegree
							+ " in steps of " + increment);	
		System.out.println("--------------------------------");

		//for ( int degree = startDegree; degree <= endDegree; degree = degree + increment)
		for ( int degree = startDegree; degree <= endDegree; degree += increment)
			System.out.println( "| sin(" + degree + ") = " + Math.sin(Math.toRadians(degree)));

		System.out.println("--------------------------------");				
	}
}