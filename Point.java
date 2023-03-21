// Representation of the point.
public class Point
{ 
	// Point coordinates.
	private double x;
	private double y;
	
	// Constructor
	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	} // Point

	public String toString()
	{
		return "(" + x + "," + y + ")";
	} // toString 

    	public double getX() {
       		return x;
    	}

    	public double getY() {
       		return y;
    	}
	
	// Returns distance between two points 
	public double getDistance(Point other)
	{
		return Math.sqrt(Math.pow((x - other.getX()),2) + Math.pow((y - other.getY()),2)); 
	}

	// Calculates agnle of the slope between X axis and line made of two points
	public double calculateLineAngle(Point other)
	{
		// Slope is caluculated by measuring coordinates changes between given points.
		// if vertical - avoids dividing by 0 - pararell lines
		if(this.x - other.getX() == 0)	
			return 0;

		// Slope angle inclanation is expressed by arctan of the slope	
		else
			return Math.atan((this.y - other.getY()) / (this.x - other.getX()));	
		
	} // calculateLineSlope
} // class Point