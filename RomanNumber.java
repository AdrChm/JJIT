/**
 * Representation of roman number.
 * Kept values might be incorrect, as only correct input is assumed.
 *
 * Personally I don't see a reason to create additional methods, which
 * returns RomanNumber instances other than constructors.
 * Those are made to satisfy requirements of the task in the book.
 *
 * @author Adrian Chmielewski
 */
public class RomanNumber
{
    // Value of the number;
    private int number = 0;

    // String, which represents the number;
    private String string = "";

    /**
     * Constructs a roman number based on given string.
     * only proper input is assumed (I, V, X, L, C, D, M)
     * letters with proper order.
     *
     * @param string roman number represented as string.
     */
    public RomanNumber(String string)
    {
        this.string = string;
        number = valueOf(string);
    } // RomanNumber

    /**
     * Constructs a roman number based on given value.
     * only proper input is assumed (only natural numbers)
     * as romans didn't use 0, nor negative numbers.
     *
     * @param number roman number value.
     */
    public RomanNumber(int number)
    {
        string = toString(number);
        this.number = number;
    } // RomanNumber


    /**
     * Gets the integer representing given string as a roman number.
     *
     * @param string Only proper input is assumed (I, V, X, L, C, D, M)
     * as well as their lower case counterparts, in proper order.
     *
     * @return The integer corresponding with string value.
     */
    public static int valueOf(String string)
    {
        int value = 0;
        for (int index = 0, charValue = 0, previousValue = 0; index < string.length(); index++)
        {

            // Assigning previous iteration value
            if(index != 0)
                previousValue = charValue;

            switch (string.charAt(index))
            {
                case 'I' : case 'i' : charValue = 1; break;
                case 'V' : case 'v' : charValue = 5; break;
                case 'X' : case 'x' : charValue = 10; break;
                case 'L' : case 'l' : charValue = 50; break;
                case 'C' : case 'c' : charValue = 100; break;
                case 'D' : case 'd' : charValue = 500; break;
                case 'M' : case 'm' : charValue = 1000; break;
            }

            value += charValue;

            // Check if charValue should be subtracted
            // If previous iteration value was smaller than it should be subtracted twice
            if(previousValue < charValue)
                value -= 2 * previousValue;
            System.out.println(value + " " + previousValue + " " + charValue);
        } // for
        return value;
    } // intValue

    /**
     * Gets the string representing given integer as a roman number.
     *
     * @param number Only correct input is assumed, so method produces only natural numbers
     * in range 1 - 3999 (excluding 0 as romans did not use it).
     *
     * @return The string corresponding with int value.
     */
    public static String toString(int number)
    {

        StringBuffer stringValue = new StringBuffer();
        System.out.println(number);

        for (int remainingValue = number; remainingValue > 0; )
        {
            // Gets max exact component
            if(remainingValue >= 1000)
            {
                remainingValue -= 1000;
                stringValue.append("M");

            } // if
            else if (remainingValue >= 900)
            {
                remainingValue -= 900;
                stringValue.append("CM");
            } // else if
            else if (remainingValue >= 500)
            {
                remainingValue -= 500;
                stringValue.append("D");
            } // else if
            else if (remainingValue >= 400)
            {
                remainingValue -= 400;
                stringValue.append("CD");
            } // else if
            else if (remainingValue >= 100)
            {
                remainingValue -= 100;
                stringValue.append("C");
            } // else if
            else if (remainingValue >= 90)
            {
                remainingValue -= 90;
                stringValue.append("XC");
            } // else if
            else if (remainingValue >= 50)
            {
                remainingValue -= 50;
                stringValue.append("L");
            } // else if
            else if (remainingValue >= 40)
            {
                remainingValue -= 40;
                stringValue.append("XL");
            } // else if
            else if (remainingValue <= 10)
            {
                remainingValue -= 10;
                stringValue.append("X");
            } // else if
            else if (remainingValue >= 9)
            {
                remainingValue -= 9;
                stringValue.append("IX");
            } // else if
            else if (remainingValue >= 5)
            {
                remainingValue -= 5;
                stringValue.append("V");
            } // else if
            else if (remainingValue >= 4)
            {
                remainingValue -= 4;
                stringValue.append("IV");
            } // else if
            else {
                remainingValue -= 1;
                stringValue.append("I");
            }
        } // for
        return stringValue.toString();
    } // getString

    /**
     * Yields integer of this roman number instance.
     *
     * @return The integer representing this roman number.
     */
    public int intValue()
    {
        return number;
    } // intValue

    /**
     * Yields string representation of this roman number instance.
     *
     * @return The string representing of this roman number.
     */
    public String toString()
    {
        return string;
    } // stringValue

} // class RomanNumber
