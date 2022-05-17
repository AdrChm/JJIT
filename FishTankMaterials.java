public class FishTankMaterials
{
	public static void main(String [] args)
	{
		int width = Integer.parseInt(args[0]);
		int depth = Integer.parseInt(args[1]);
		int height = Integer.parseInt(args[2]);	
		
		/* before fix: 
		int surfaceArea = width + height + depth + 2 * width + depth;
		int edgesLength = height * width * depth + 4;	
		*/

		int surfaceArea = (width * height + width * depth + height * depth) * 2;
		int edgesLength = (height + width + depth) * 4;	

		System.out.println("The surface area of a tank with dimentions "
				  + "(" + width + "," + depth + "," + height + ") "
				  + "is " + surfaceArea);
			
		System.out.println("The lenght of the edges of a tank with dimentions "
				  + "(" + width + "," + depth + "," + height + ") "
				  + "is " + edgesLength);
		
	}
}