// Representation of the rectangle.
public class Rectangle
{ 
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;

	// Constructor for given diagonal
	public Rectangle(Point diag1End1, Point diag1End2)
	{
		pointA = diag1End1;
		pointC = diag1End2;
		pointB = new Point(pointA.getY(), pointC.getX());
		pointD = new Point(pointA.getX(), pointC.getY());

	} // Rectangle
	
	// Creates new rectangle with shifted points.
	public Rectangle shift(double xShift, double yShift)
	{ 
		return new Rectangle(new Point(pointA.getX() + xShift, pointA.getY() + yShift),
				     new Point(pointC.getX() + xShift, pointC.getY() + yShift));
	} // shift

	public String toString()
	{
		return "Rectangle(" + pointA + "," + pointB + "," + pointC + "," + pointD + ")";
	} // toString

	// Returns X axis (length) of the rectagle based on absolute value of substranction 
	// of its diagonal points.
	private double length()
	{
		return Math.abs(pointA.getX() - pointC.getX());
	} // lenght

	// Returns Y axis (height) of the rectagle based on absolute value of substranction 
	// of its diagonal points.
	private double height()
	{
		return Math.abs(pointA.getY() - pointC.getY());
	} // height

	// Returns area of the rectangle.
	public double area()
	{
		// Return area based on absolute value of diagonal points of the rectangle.
		return length() * height();	
	} // area;

	// Returns perimeter of the rectangle.
	public double perimeter()
	{
		return 2 * length() + 2 * height();	
	} // perimeter;

} // class Rectangle