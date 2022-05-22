// Prints triangle upside down for given height.
// Assumes input as positive integer.  
public class PrintTriangleMirror
{
	public static void main(String [] args)
	{
		int size = Integer.parseInt(args[0]);
		
		// Iterating thorugh rows
		for(int row = 0; row < size; row++)
		{
			// Iterating thorugh columns, each row prints less elements
			for(int column = size - row; column > 0; column--)
				System.out.print("[_]");
		
		System.out.println();
		} // for - row

	} // main
} // PrintTriangleMirror class