public class ThreeWeights
{
	public static void main(String [] args)
	{
		int firstWeight = Integer.parseInt(args[0]);
		int secondWeight = Integer.parseInt(args[1]);
		int thirdWeight = Integer.parseInt(args[2]);

		System.out.println(-firstWeight - secondWeight - thirdWeight);
		System.out.println(-firstWeight - secondWeight);
		System.out.println(-firstWeight - secondWeight + thirdWeight);
		System.out.println(-firstWeight - thirdWeight);
		System.out.println(-firstWeight);
		System.out.println(-firstWeight + thirdWeight);
		System.out.println(-firstWeight + secondWeight - thirdWeight);
		System.out.println(-firstWeight + secondWeight);
		System.out.println(-firstWeight + secondWeight + thirdWeight);
		System.out.println(-secondWeight - thirdWeight);
		System.out.println(-secondWeight);
		System.out.println(-secondWeight + thirdWeight);
		System.out.println(-thirdWeight);
		System.out.println();
		System.out.println(thirdWeight);
		System.out.println(secondWeight - thirdWeight);
		System.out.println(secondWeight);
		System.out.println(secondWeight + thirdWeight);
		System.out.println(firstWeight - secondWeight - thirdWeight);
		System.out.println(firstWeight - secondWeight);
		System.out.println(firstWeight - secondWeight + thirdWeight);
		System.out.println(firstWeight - thirdWeight);
		System.out.println(firstWeight);
		System.out.println(firstWeight + thirdWeight);
		System.out.println(firstWeight + secondWeight - thirdWeight);
		System.out.println(firstWeight + secondWeight);
		System.out.println(firstWeight + secondWeight + thirdWeight);

	}
}