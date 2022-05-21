public class BitsRepresentation
{
	public static void main(String [] args)
	{
		int givenNumber = Integer.parseInt(args[0]);
		double loopValue = givenNumber;
		char bitValue;
		int bitCounter = 1;

		while(loopValue > 0)
		{
			if(loopValue%2==0)
			{
				bitValue = '0';
				System.out.print(bitValue);
			} 
			else
			{	
				bitValue = '1';
				System.out.print(bitValue);
			}
			
			givenNumber = givenNumber/2;
			loopValue = givenNumber;
				// System.out.println("loopValue: " + loopValue + ", givenNumber: " + givenNumber);
			bitCounter++;
		}
		bitValue = '0';
		// prints sign value
		System.out.print(bitValue);

		System.out.println("\n" + bitCounter);
		
	}
}