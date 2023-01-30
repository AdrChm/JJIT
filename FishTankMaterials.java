public class FishTankMaterials
{
	public static void main(String [] args)
	{
		int width = Integer.parseInt(args[0]);
		int lenght = Integer.parseInt(args[1]);
		int height = Integer.parseInt(args[2]);	
		
		/* before fix: 
		int surfaceArea = width + height + lenght + 2 * width + lenght; 
		int edgesLength = height * width * lenght + 4;	
		*/
		
		/* another fix - changed as top is not required 
		I would also renamed "depth" into "lenght", as it's more clear.
		Class requires further fixing, but at this point more shouldn't be done 
		int surfaceArea = (width * height + width * lenght + height * lenght) * 2;
		*/

		int surfaceArea = width * height * 2 + height * lenght * 2 + width * lenght;
		int edgesLength = (height + width + lenght) * 4;	

		System.out.println("The surface area of a tank with dimentions "
				  + "(" + width + "," + lenght + "," + height + ") "
				  + "is " + surfaceArea);
			
		System.out.println("The lenght of the edges of a tank with dimentions "
				  + "(" + width + "," + lenght + "," + height + ") "
				  + "is " + edgesLength);
		
	}
}