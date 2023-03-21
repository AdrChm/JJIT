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

	// Calculates slope of line bewteen this and the other points
	public double calculateLineSlope(Point other)
	{
		// Slope is caluculated by measuring coordinates changes between given points.
		// if vertical - avoids dividing by 0 - to be updated
		if(this.x - other.getX() == 0)	
			return 0;	
		else
			return (this.y - other.getY())/ (this.x - other.getX());
		
	} // calculateLineSlope
} // class Point