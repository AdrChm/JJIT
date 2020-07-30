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

	// print polynomial format
	public void printQuadPoly(){
		System.out.print(a + "x^2 + " + b + "x + " + c);
	}


} // QuadPoly class 