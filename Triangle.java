// Representation of the triangle.
public class Triangle
{ 
	private Point pointA;
	private Point pointB;
	private Point pointC;

	// Constructor
	public Triangle(Point pointA, Point pointB, Point pointC)
	{
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;

	} // Triangle
	
	// Creates new triangle with shifted points.
	public Triangle shift(double xShift, double yShift)
	{ 
		return new Triangle(new Point(pointA.getX() + xShift, pointA.getY() + yShift),
				     new Point(pointB.getX() + xShift, pointB.getY() + yShift),
				     new Point(pointC.getX() + xShift, pointC.getY() + yShift));
	} // shift

	public String toString()
	{
		return "Triangle(" + pointA + "," + pointB + "," + pointC + ")";
	} // toString

	// Calculates height of the triangle based on tangent between AB and AC lines
	// and based on returned radian value calculates height 
	private double height()
	{
		// Calculating angle of the first line
		double angleXAB = pointA.calculateLineAngle(pointB);

		// Calculating angle of the second line
		double angleXAC = pointA.calculateLineAngle(pointC);
		
		// Calculating CAB angle
		double angleCAB = Math.abs(angleXAB - angleXAC);

		return Math.cos(angleCAB) * pointA.getDistance(pointC);

	} // height

	// Returns area of the triangle.
	public double area()
	{
		// Return area based on basis (between point a and point b) and height
		return pointA.getDistance(pointB) * height()/2;	
	} // area;

	// Returns perimeter of the triangle.
	public double perimeter()
	{
		return pointA.getDistance(pointB) + pointB.getDistance(pointC) + pointC.getDistance(pointA);	
	} // perimeter;

} // class Triangle