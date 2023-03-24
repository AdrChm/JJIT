// Program to test RomanNumber class
// Only proper input is expected (I, V, X, L, C, D, M) letters with proper order.
// Also scope of input is between 1 (I) and 3980 (MMMCMLXXX) as loop will cover
// subsequent 19 elements.
public class RomanNumberTest {

    // Test checks if program translates correctly subsequent values by loop
    public static void main(String[] args) {

        RomanNumber romanNumber = new RomanNumber(args[0]);
        int number = romanNumber.intValue();
        System.out.println(romanNumber);

        // Iteration through subsequent 19 elements.
        for (int index = 1; index < 20; index++)
        {
            romanNumber = new RomanNumber(number + index);
            System.out.println(romanNumber);
        } // for

    } // main
} // class RomanNumberTest
