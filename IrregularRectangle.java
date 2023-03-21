// Representation of the irregular rectangle.
public class IrregularRectangle
{ 
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;

	// Constructor for given diagonal
	public IrregularRectangle(Point a, Point b, Point c, Point d)
	{
		pointA = a;
		pointC = b;
		pointB = c;
		pointD = d;

	} // Rectangle
	
	// Creates new rectangle with shifted points.
	public IrregularRectangle shift(double xShift, double yShift)
	{ 
		return new IrregularRectangle(new Point(pointA.getX() + xShift, pointA.getY() + yShift),
					      new Point(pointB.getX() + xShift, pointB.getY() + yShift),
					      new Point(pointC.getX() + xShift, pointC.getY() + yShift),
					      new Point(pointD.getX() + xShift, pointD.getY() + yShift));
	} // shift

	public String toString()
	{
		return "IrregularRectangle(" + pointA + "," + pointB + "," + pointC + "," + pointD + ")";
	} // toString

	// Returns area of the irregular rectangle by diving it into two triangles and adding their areas.
	public double area()
	{
		// To recognize points, their angles must be compared - middle one always represents the opposing point.
		double angleXAB = pointA.calculateLineAngle(pointB);
		double angleXAC = pointA.calculateLineAngle(pointC);
		double angleXAD = pointA.calculateLineAngle(pointD);
		
		Triangle first;
		Triangle second;

		// Creates triangles based on angles comparison.
		// opposite is XAD
		if(angleXAB > angleXAC)
			// opposite is XAC
			if(angleXAC > angleXAD)
			{
				first = new Triangle (pointA, pointB, pointD);
				second = new Triangle (pointB, pointD, pointC);
			} // if
			// opposite is XAB
			else if (angleXAD > angleXAB)
			{
				first = new Triangle (pointA, pointC, pointD);
				second = new Triangle (pointB, pointD, pointC);
			} // else if	
			// opposite is XAD	
			else
			{
				first = new Triangle (pointA, pointB, pointC);
				second = new Triangle (pointD, pointB, pointC);
			} // else

		else	
			// opposite is XAC
			if(angleXAD > angleXAC)			
			{
				first = new Triangle (pointA, pointB, pointD);
				second = new Triangle (pointB, pointD, pointC);
			} // if 
			// opposite is XAD
			else if (angleXAD > angleXAB)
			{
				first = new Triangle (pointA, pointC, pointD);
				second = new Triangle (pointB, pointD, pointC);
			} // else if 
			// opposite is XAB
			else 	
			{
				first = new Triangle (pointA, pointC, pointD);
				second = new Triangle (pointB, pointD, pointC);
			} // else	
					
		return 	first.area() + second.area();
	} // area;

	// Returns perimeter of the rectangle.
	public double perimeter()
	{
		// To recognize points, their angles must be compared - middle one always represents the opposing point.
		double angleXAB = pointA.calculateLineAngle(pointB);
		double angleXAC = pointA.calculateLineAngle(pointC);
		double angleXAD = pointA.calculateLineAngle(pointD);
		
		double side1;
		double side2;
		double side3;
		double side4;

		// Creates sides based on angles comparison.

		// Excluding double 0 cases (vertical and horizontal)
		// opposite is XAB
		if(angleXAC == angleXAD)
		{
			side1 = pointA.getDistance(pointC);
			side2 = pointA.getDistance(pointD);
			side3 = pointB.getDistance(pointC);
			side4 = pointB.getDistance(pointD);
			return 	side1 + side2 + side3 + side4;
		} // if 
		// opposite is XAC
		else if(angleXAB == angleXAD)
		{
			side1 = pointA.getDistance(pointB);
			side2 = pointA.getDistance(pointD);
			side3 = pointC.getDistance(pointB);
			side4 = pointC.getDistance(pointD);
			return 	side1 + side2 + side3 + side4;
		} // else if 
		// opposite is XAD
		else if(angleXAB == angleXAC)
		{
			side1 = pointA.getDistance(pointB);
			side2 = pointA.getDistance(pointC);
			side3 = pointD.getDistance(pointB);
			side4 = pointD.getDistance(pointC);
			return 	side1 + side2 + side3 + side4;
		} // else if 
		if(angleXAB > angleXAC)
		{
			// opposite is XAC
			if(angleXAC > angleXAD)
			{
				side1 = pointA.getDistance(pointB);
				side2 = pointA.getDistance(pointD);
				side3 = pointC.getDistance(pointB);
				side4 = pointC.getDistance(pointD);

			} // if
			// opposite is XAB
			else if (angleXAD > angleXAB)
			{
				side1 = pointA.getDistance(pointC);
				side2 = pointA.getDistance(pointD);
				side3 = pointB.getDistance(pointC);
				side4 = pointB.getDistance(pointD);
			} // else if	
			// opposite is XAD	
			else
			{
				side1 = pointA.getDistance(pointB);
				side2 = pointA.getDistance(pointC);
				side3 = pointD.getDistance(pointB);
				side4 = pointD.getDistance(pointC);
			} // else
		} // if
		else	
		{
			// opposite is XAC
			if(angleXAD > angleXAC)			
			{
				side1 = pointA.getDistance(pointB);
				side2 = pointA.getDistance(pointD);
				side3 = pointC.getDistance(pointB);
				side4 = pointC.getDistance(pointD);
			} // if 
			// opposite is XAD
			else if (angleXAD > angleXAB)
			{
				side1 = pointA.getDistance(pointB);
				side2 = pointA.getDistance(pointC);
				side3 = pointD.getDistance(pointB);
				side4 = pointD.getDistance(pointC);
			} // else if 
			// opposite is XAB
			else 	
			{
				side1 = pointA.getDistance(pointC);
				side2 = pointA.getDistance(pointD);
				side3 = pointB.getDistance(pointC);
				side4 = pointB.getDistance(pointD);
			} // else
		} // else		
		return 	side1 + side2 + side3 + side4;
		
	} // perimeter;

} // class Rectangle