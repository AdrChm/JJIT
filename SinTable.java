public class SinTable
{
	public static void main(String[] args)
	{
		int startingPoint = Integer.parseInt(args[0]);
		int increment = Integer.parseInt(args[1]);
		int endingPoint = Integer.parseInt(args[2]);
		
		System.out.println("------------------------------------------------");
		System.out.println("| Sin table form " + startingPoint + " to " 
				  + endingPoint + " in steps of " + increment);
		System.out.println("------------------------------------------------");
		
		for(int degrees = startingPoint; degrees <= endingPoint; degrees = degrees + increment)
			System.out.println("| sin(" + degrees + ") = " + Math.sin(Math.toRadians(degrees)));	

		System.out.println("------------------------------------------------");	
	}
}