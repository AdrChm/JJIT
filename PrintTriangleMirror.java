// Prints triangle upside down for given height.
// Assumes input as positive integer.  
public class PrintTriangleMirror
{
	public static void main(String [] args)
	{
		int size = Integer.parseInt(args[0]);

		// Iterating thorugh rows
		for(int row = size; row > 0; row--)
		{
			// Iterating thorugh columns, each row prints less elements
			for(int column = size; column > 0; column--)
				if(column > row)
					System.out.print("   ");
				else
					System.out.print("[_]");
		
		System.out.println();
		} // for - row
		
	} // main
} // PrintTriangleMirror class