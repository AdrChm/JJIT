// Representation of a quadratic polynomial.
// Each not provided coefficient has assigned value of 0.  
public class QuadPoly
{
	private double coefficientOfx2 = 0;
	private double coefficientOfx = 0;
	private double constant = 0;

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

	public boolean isLessThan(QuadPoly other)
	{
		return coefficientOfx2 < other.coefficientOfx2 || coefficientOfx2 == other.coefficientOfx2
			&& (coefficientOfx < other.coefficientOfx || coefficientOfx == other.coefficientOfx
			&& constant < other.constant);
	} // isEqual

	public boolean isEqualTo(QuadPoly other)
	{
		return coefficientOfx2 == other.coefficientOfx2 
			&& coefficientOfx == other.coefficientOfx
			&& constant == other.constant;
	} // isEqualTo

	// Creates quadratic polynomial String to display it in a proper manner.
	public String toString()
	{
		return coefficientOfx2 + "x^2 + "+ coefficientOfx + "x + " + constant;
	} // toString


	// adds coefficients fo given quadratic polymonials and returns new one as the result.
	public QuadPoly addQuadPoly(QuadPoly other)
	{

		return new QuadPoly(coefficientOfx2 + other.coefficientOfx2,
				    coefficientOfx + other.coefficientOfx,
				    constant + other.constant);
	} // addQuadPoly
} // class QuadPoly 