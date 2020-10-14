// Class related to AddQuadPoly
// This class will create instances of quadratic polynomials 
public class QuadPoly
{
	// varialbes accordingly to the formula
	// ax^2 + bx + c 
	private double a, b, c;

	// polynomials constructor
	public QuadPoly(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;

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

	// 10.5.4 method to improve AddQuadPoly class  
	public QuadPoly addPoly(QuadPoly added)
	{
		double newA = a + added.a;
		double newB = b + added.b;
		double newC = c + added.c;

		return new QuadPoly(newA, newB, newC);
	} // addPoly

		public QuadPoly substractPoly(QuadPoly substracted)
	{
		double newA = a - substracted.a;
		double newB = b - substracted.b;
		double newC = c - substracted.c;

		return new QuadPoly(newA, newB, newC);
	} // substractPoly

	public QuadPoly divideBy(double divisor)
	{
		double newA = a / divisor;
		double newB = b / divisor;
		double newC = c / divisor;

		return new QuadPoly(newA, newB, newC);
	} // divideBy

	public QuadPoly multiplyBy(double multiplier)
	{
		double newA = a * multiplier;
		double newB = b * multiplier;
		double newC = c * multiplier;

		return new QuadPoly(newA, newB, newC);
	} // multiplyBy

} // QuadPoly class 