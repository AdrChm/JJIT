public class FieldPerimeter
{
	public static void main(String [] args)
	{
	int length = Integer.parseInt(args[0]);
	int width = Integer.parseInt(args[1]);
	int fieldPerimeter = length*2 +  width*2; 
	
	System.out.println("Field perimeter with length: " + length + " and width: " 
			   + width + " is " + fieldPerimeter );

	}
}