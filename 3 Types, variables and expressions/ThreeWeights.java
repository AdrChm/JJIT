public class ThreeWeights
{
	public static void main(String[] args)
	{
		int firstWeight = Integer.parseInt(args[0]);
		int secondWeight = Integer.parseInt(args[1]);
		int thirdWeight = Integer.parseInt(args[2]);

		System.out.println( - firstWeight - secondWeight - thirdWeight );
		System.out.println( - firstWeight - secondWeight - 0 );
		System.out.println( - firstWeight - secondWeight + thirdWeight );
		System.out.println( - firstWeight - 0 - thirdWeight );
		System.out.println( - firstWeight - 0 - 0 );
		System.out.println( - firstWeight - 0 + thirdWeight );
		System.out.println( - firstWeight + secondWeight - thirdWeight );
		System.out.println( - firstWeight + secondWeight - 0 );
		System.out.println( - firstWeight + secondWeight + thirdWeight );

		System.out.println( 0 - secondWeight - thirdWeight );
		System.out.println( 0 - secondWeight - 0 );
		System.out.println( 0 - secondWeight + thirdWeight );
		System.out.println( 0 - 0 - thirdWeight );
		System.out.println( 0 - 0 - 0 );
		System.out.println( 0 - 0 + thirdWeight );
		System.out.println( 0 + secondWeight - thirdWeight );
		System.out.println( 0 + secondWeight - 0 );
		System.out.println( 0 + secondWeight + thirdWeight );

		System.out.println( firstWeight - secondWeight - thirdWeight );
		System.out.println( firstWeight - secondWeight - 0 );
		System.out.println( firstWeight - secondWeight + thirdWeight );
		System.out.println( firstWeight - 0 - thirdWeight );
		System.out.println( firstWeight - 0 - 0 );
		System.out.println( firstWeight - 0 + thirdWeight );
		System.out.println( firstWeight + secondWeight - thirdWeight );
		System.out.println( firstWeight + secondWeight - 0 );
		System.out.println( firstWeight + secondWeight + thirdWeight );
	}
}