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
Math.tan() 
	private double height()
	{


		// Calculating slope of the first line
		double slopeAB = pointA.calculateLineSlope(pointB);

		// Calculating slope of the second line
		double slopeAC = pointA.calculateLineSlope(pointC);

		Point middlePoint = new Point((pointA.getX() + pointB.getX()) / 2, (pointA.getY() + pointB.getY()) / 2);
			
		return middlePoint.getDistance(pointC);

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