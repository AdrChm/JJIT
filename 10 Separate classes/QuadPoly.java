// Class related to AddQuadPoly
// This class will create instances of quadratic polynomials 
public class QuadPoly
{
	// varialbes accordingly to the formula
	// ax^2 + bx + c 
	public double a, b, c;

	// polynomials constructor
	public QuadPoly(double firstValue, double secondValue, double thirdValue)
	{
		a = firstValue;
		b = secondValue;
		c = thirdValue;

	} // QuadPoly constructor


	// Returns the a + "x^2 + " + b + "x + " + c as represntation of polynomial
	public String toString()
	{
		return a + "x^2 + " + b + "x + " + c;
	}

	// instance method, which verifies if polynomials are equal
	public boolean equals(QuadPoly toCompare)
	{
		return a == toCompare.a && b == toCompare.b && c == toCompare.c;
	}

	// instance method, which returns if instance polynomial 
	// is smaller than one in the parameter
	public boolean lessThan(QuadPoly toCompare)
	{
		return a < toCompare.a || a == toCompare.a
				 && ( b < toCompare.b || b == toCompare.b && c < toCompare.c);
	}



} // QuadPoly class 