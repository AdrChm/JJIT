// 10.5.4 option extra 
// calculator starts with Poly(0,0,0)
// first argument is operation type (calculation method)
// second part asks for arguments (depending on operation type) 
// to make this concept work it is necessary to asume that each time given 
// polynomials has three coefficients 
// unclear part regarding polynomial comparisons was solved by creating two additional
// operations  
public class QuadPolyCalculator
{

	public static void main(String [] args)
	{
		
		//starting point 
		QuadPoly accumulator = new QuadPoly(0,0,0);
		QuadPoly theSmallestPoly = new QuadPoly(0,0,0);		
		QuadPoly theBiggestPoly = new QuadPoly(0,0,0);
		
		if(args.length > 1)
		{
			int operation = Integer.parseInt(args[0]);
			int argmumentsChecked = 0;

			while(args.length > argmumentsChecked)
			{
				// first not processed argument 
				operation = Integer.parseInt(args[argmumentsChecked]);

				// line separating from entered arguments
				System.out.println();

				// method selection
				switch(operation)
				{
					// add
					case 1: 
						System.out.println(accumulator + " + ");
						QuadPoly toAdd = newPoly(argmumentsChecked, args);
						accumulator = accumulator.addPoly(toAdd);
						argmumentsChecked += 4;
						System.out.println(toAdd + " = \n" + accumulator + "\n");
					break;

					// substract
					case 2:
						System.out.println(accumulator + " - ");
						QuadPoly toSubstract = newPoly(argmumentsChecked, args);
						accumulator = accumulator.substractPoly(toSubstract);
						argmumentsChecked += 4;
						System.out.println(toSubstract + " = \n" + accumulator + "\n");
					break;

					// multiply
					case 3:
						System.out.print(accumulator + " * ");
						accumulator = accumulator.multiplyBy(Double.parseDouble(args[argmumentsChecked+1]));
						System.out.println(args[argmumentsChecked+1] + " = \n" + accumulator + "\n");
						argmumentsChecked += 2;
					break;

					// divide
					case 4: 
						System.out.print(accumulator + " / ");
						accumulator = accumulator.divideBy(Double.parseDouble(args[argmumentsChecked+1]));
						System.out.println(args[argmumentsChecked+1] + " = \n" + accumulator + "\n");
						argmumentsChecked += 2;
					break;

					// less than
					case 5:
						QuadPoly isBigger = newPoly(argmumentsChecked, args);
						// if accumulator lessThan						
						if(accumulator.lessThan(isBigger))
						{ 
							System.out.println(accumulator + " is smaller than " + isBigger + "\n");							
						} 
						// if not
						else 
						{
							System.out.println(accumulator + " is not smaller than " + isBigger + "\n");
						}
						argmumentsChecked += 4;

					// greater than
					case 6:
						QuadPoly isSmaller = newPoly(argmumentsChecked, args);
						// if accumulator is bigger	(not smaller and not equal)				
						if(!accumulator.lessThan(isSmaller) && !accumulator.equals(isSmaller))
						{ 
							System.out.println(accumulator + " is greater than " + isSmaller + "\n");							
						} 
						// if not
						else 
						{
							System.out.println(accumulator + " is not greater than " + isSmaller + "\n");
						}
						argmumentsChecked += 4;

					default:

						System.out.println("Incorrect operation code");
						// dummy way to escape possible recurtion
						argmumentsChecked += 1024;

				} // switch 

			} // while (args.length check)

		}
		else
		{
			System.out.println("Incorrect amount of arguments");
		} // else (args.length < 2)

	} // main

	// method to simplify new polynomials creation
	public static QuadPoly newPoly(int startingArgument, String [] args)
	{
		int x = Integer.parseInt(args[startingArgument+1]);
		int y = Integer.parseInt(args[startingArgument+2]);
		int z = Integer.parseInt(args[startingArgument+3]);

		return new QuadPoly (x, y, z);
	}

} // QuadPolyCalculator