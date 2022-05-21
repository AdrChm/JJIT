public class MinimumTankSize
{
	public static void main(String [] args)
	{
		double sideLenght = 0;
		double volume = Double.parseDouble(args[0]);
		
		while(sideLenght * sideLenght * sideLenght < volume)
			sideLenght = sideLenght + 0.1;
		
		System.out.println("You need a square of " + sideLenght
				  + " meters per side to hold the volume " 
				  + volume);
	}
}