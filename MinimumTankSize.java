public class MinimumTankSize
{
	public static void main(String [] args)
	{
		double requiredVolume = Double.parseDouble(args[0]);
		int sideLenght = 1;

		while(sideLenght * sideLenght * sideLenght < requiredVolume)
			sideLenght = sideLenght + 1;
		System.out.println("You need a tank of " + sideLenght
				  + " meters per side to hold the volume "	
				  + requiredVolume + " cubic meters");
	}
}