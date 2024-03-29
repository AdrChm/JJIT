import java.util.Scanner;

/* This program performs simple calculations and manipulations of simple
   shapes expressed in two-dimentional coordinate geometry.

   First it asks the user to choose a shape, from a choice of three.
   Then it prompts for details of the shape. 
   *   A circle is specified by giving the X and then Y coodrinate of its
       centre, followed by its radius.
   *   A triangle is specified by giving the X and Y coodrinates of each of
       its three corners points.      
   *   A rectangle (always axis-aligned) is specified by giving the X and Y 
       coodrinates of two of its diagonally opposite corner points.

   Following this data, the user is prompted to specify an X offset and a Y
   offset.

   The program creates the specified shape, and also a similar one, in which
   each point has been shifted by the X and Y offsets.

       The program then reports the following on the standard output.
   *   The details of the oryginal shape -- giving all the points.
       (one, three or four) and, for a circle, its radius.
   *   The area and  perimeter of the shape.
   *   The details of the shiffted shape.
*/
public class ShapeShift
{
	// A scanner to interact with the user.
	private static Scanner inputScanner = new Scanner(System.in);

	// Helper method to read points from the input.
	private static Point inputPoint(String prompt)
	{
		System.out.print(prompt);
		double x = inputScanner.nextDouble();
		double y = inputScanner.nextDouble();	
		return new Point(x, y);
	} // inputPoint

	// The X and Y amount to shift the first shape to get the second.
	private static double xShift, yShift;

	// Helper method to read X and Y shifts.
	private static void inputXYShifts()
	{
		System.out.print("Enter the offset as X Y: ");
		xShift = inputScanner.nextDouble();
		yShift = inputScanner.nextDouble();
	} // inputXYShifts

	// The main method.
	public static void main(String [] args)
	{
		// Obtain shape choice.
		System.out.print("Choose cicrle (1), triangle (2), rectangle (3), irregular 4 sided polygon (4): ");
		int shapeChoice = inputScanner.nextInt();
	
		// Process the shape based on the choice.
		switch (shapeChoice)
		{
			// Circle.
			case 1:
				Point centre = inputPoint("Enter the centre as X Y : ");
				System.out.print("Enter the radius: ");
				double radius = inputScanner.nextDouble();
				Circle originalCircle = new Circle(centre, radius);
				inputXYShifts();
				Circle shiftedCircle = originalCircle.shift(xShift, yShift);
				System.out.println();
				System.out.println(originalCircle);
				System.out.println("has area " + originalCircle.area()
						   + ", perimeter " + originalCircle.perimeter());
				System.out.println("and when shifted by X offset " + xShift
						   + " and Y offset " + yShift + ", gives");
				System.out.println(shiftedCircle);
				break;

			// Triangle.
			case 2:
				Point pointA = inputPoint("Enter point A as X Y : ");
				Point pointB = inputPoint("Enter point B as X Y : ");
				Point pointC = inputPoint("Enter point C as X Y : ");
				Triangle originalTriangle = new Triangle(pointA, pointB, pointC);
				inputXYShifts();
				Triangle shiftedTriangle = originalTriangle.shift(xShift, yShift);
				System.out.println();
				System.out.println(originalTriangle);				
				System.out.println("has area " + originalTriangle.area()
						   + ", perimeter " + originalTriangle.perimeter());
				System.out.println("and when shifted by X offset " + xShift
						   + " and Y offset " + yShift + ", gives");
				System.out.println(shiftedTriangle);
				break;

			// Rectangle.
			case 3:
				Point diag1End1 = inputPoint("Enter one corner as X Y : ");
				Point diag1End2 = inputPoint("Enter the opposite corner as X Y : ");
				Rectangle originalRectangle = new Rectangle(diag1End1, diag1End2);
				inputXYShifts();
				Rectangle shiftedRectangle = originalRectangle.shift(xShift, yShift);
				System.out.println();
				System.out.println(originalRectangle);				
				System.out.println("has area " + originalRectangle.area()
						   + ", perimeter " + originalRectangle.perimeter());
				System.out.println("and when shifted by X offset " + xShift
						   + " and Y offset " + yShift + ", gives");
				System.out.println(shiftedRectangle);
				break;

			case 4:
				Point a = inputPoint("Enter point A as X Y : ");
				Point b = inputPoint("Enter point B as X Y : ");
				Point c = inputPoint("Enter point C as X Y : ");
				Point d = inputPoint("Enter point D as X Y : ");
				IrregularRectangle originalIrregularRectangle = new IrregularRectangle(a, b, c, d);
				inputXYShifts();
				IrregularRectangle shiftedIrregularRectangle = originalIrregularRectangle.shift(xShift, yShift);
				System.out.println();
				System.out.println(originalIrregularRectangle);				
				System.out.println("has area " + originalIrregularRectangle.area()
						   + ", perimeter " + originalIrregularRectangle.perimeter());
				System.out.println("and when shifted by X offset " + xShift
						   + " and Y offset " + yShift + ", gives");
				System.out.println(shiftedIrregularRectangle);
				break;

			// Bad choise
			default: 
				System.out.println("That wasn't 1, 2 or 3!");
				break;				

		} // switch
	} // main
} // class ShapeShift