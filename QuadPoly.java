// Representation of a quadratic polynomial.
// Each not provided coefficient has assigned value of 0.  
public class QuadPoly
{
	public double coefficientOfx2 = 0;
	public double coefficientOfx = 0;
	public double constant = 0;

	// Construct a quadratic polynomial by providing its coeffients.
	public QuadPoly(double a, double b, double c)
	{
		coefficientOfx2 = a;
		coefficientOfx = b;
		constant = c;
	} // QuadPoly

	// 10.2.5 Option extra - additional constructors
	// Construct a quadratic polynomial by providing its two first coeffients.
	public QuadPoly(double a, double b)
	{
		coefficientOfx2 = a;
		coefficientOfx = b;
	} // QuadPoly

	// Construct a quadratic polynomial by providing its first coeffient.
	public QuadPoly(double a)
	{
		coefficientOfx2 = a;
	} // QuadPoly

	// Construct a quadratic polynomial with all coeffients being 0.
	public QuadPoly()
	{
	} // QuadPoly

} // class QuadPoly 