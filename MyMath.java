/**
 * Private repository of math methods, which may have wider use
 * along with progress in the book.
 *
 * @author Adrian Chmielewski
 */
public class MyMath {


    /**
     *  Computer the greatest common divisor of two numbers. The numbers must be positive.
     *
     * @param multiple1OfGCD One of the numbers.
     * @param multiple2OfGCD The other number.
     *
     * @return The greatest common divisor of multiple1OfGCD and multiple2OfGCD.
     */
    public static int greatestCommonDivisor(int multiple1OfGCD,
                                             int multiple2OfGCD)
    {
        // Both multiple1OfGCD and multiple2OfGCD must be positive
        // While the two multiples are not the same, the difference
        // between them must also be a multiple of GCD.
        // So we keep subtracting the smallest from the largest
        // until they are equal.
        while (multiple1OfGCD != multiple2OfGCD)
            if( multiple1OfGCD > multiple2OfGCD)
                multiple1OfGCD -= multiple2OfGCD;
            else
                multiple2OfGCD -= multiple1OfGCD;

        // Now multiple1OfGCD == multiple2OfGCD
        // which is also the GCD of their original values.
        return multiple1OfGCD;

    } // greatestCommonDivisor

    /**
     *  Computer the greatest common divisor of two numbers. The numbers must be positive.
     *  Created as partial solution to option extra of 13.8.4 - GCD for non-integer numbers
     *
     * @param multiple1OfGCD One of the numbers.
     * @param multiple2OfGCD The other number.
     *
     * @return The greatest common divisor of multiple1OfGCD and multiple2OfGCD.
     */
    public static long greatestCommonDivisor(long multiple1OfGCD,
                                             long multiple2OfGCD)
    {
        // Both multiple1OfGCD and multiple2OfGCD must be positive
        // While the two multiples are not the same, the difference
        // between them must also be a multiple of GCD.
        // So we keep subtracting the smallest from the largest
        // until they are equal.
        while (multiple1OfGCD != multiple2OfGCD)
            if( multiple1OfGCD > multiple2OfGCD)
                multiple1OfGCD -= multiple2OfGCD;
            else
                multiple2OfGCD -= multiple1OfGCD;

        // Now multiple1OfGCD == multiple2OfGCD
        // which is also the GCD of their original values.
        return multiple1OfGCD;

    } // greatestCommonDivisor

} // class MyMath
