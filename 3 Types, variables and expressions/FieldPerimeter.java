public class FieldPerimeter
{
	public static void main(String[] args)
	{
		int length = Integer.parseInt(args[0]);
		int width = Integer.parseInt(args[1]);
		int fence = 2*length + 2*width;

		System.out.println("To enclose field with dimentions (" + length + ", " 
							+ width + ") is " + fence);
	}
}