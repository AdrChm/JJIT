// Representation of the circle.
public class Circle
{ 
	private Point centre;
	private double radius;

	// Constructor
	public Circle(Point centre, double radius)
	{
		this.centre = centre;
		this.radius = radius;
	} // Circle
	
	// Creates new circle with shifted centre.
	public Circle shift(double xShift, double yShift)
	{ 
		return new Circle(new Point(centre.getX() + xShift, centre.getY() + yShift), radius);

	} // shift

	public String toString()
	{
		return "Circle(" + centre + "," + radius + ")";
	} // toString

	// Returns area of the circle.
	public double area()
	{
		return Math.pow(radius, 2) * Math.PI;	
	} // area;

	// Returns perimeter of the circle.
	public double perimeter()
	{
		return 2 * Math.PI * radius;	
	} // perimeter;

} // class Circle