public class FishTankVolume
{
	public static void main(String[] args){
		int width = Integer.parseInt(args[0]);
		int depth = Integer.parseInt(args[1]);
		int height = Integer.parseInt(args[2]);	
		int volume = width * depth * height;

		System.out.println(" The volume of a tank with dimentions " 
							+ "(" + width + ", " + depth + ", " + height + ") "
							+ "is " + volume);	
	}
}