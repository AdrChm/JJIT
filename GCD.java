import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

// Calculate the GCD of three integers.
public class GCD extends JFrame implements ActionListener
{
    // A JTextField for each number.
    private final JTextField number1JTextField = new JTextField(20);
    private final JTextField number2JTextField = new JTextField(20);
    private final JTextField number3JTextField = new JTextField(20);
    // A JTextField for the result.
    private final JTextField resultJTextField = new JTextField(20);

    // Constructor.
    public GCD()
    {
        setTitle("GCD");

        Container contents = getContentPane();
        // Single column.
        contents.setLayout(new GridLayout(0 ,1));

        contents.add(new JLabel("Number 1"));
        contents.add(number1JTextField);
        contents.add(new JLabel("Number 2"));
        contents.add(number2JTextField);
        contents.add(new JLabel("Number 3"));
        contents.add(number3JTextField);

        JButton computeJButton = new JButton("Compute");
        contents.add(computeJButton);
        computeJButton.addActionListener(this);

        contents.add(new JLabel("GCD of Number 1, Number 2 and Number 3"));
        contents.add(resultJTextField);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    } // GCD

    // Act upon the button being pressed.
    public void actionPerformed(ActionEvent event) {
        // Handling of non-integer values is not an easy task.
        // The problem is infinite 0.1 - to avoid this problem I decided to take
        // some desperate measures - multiply every given fraction up to 10^18
        // which is determined by length of the JTextField
        // (0. doesn't require additional multiplication)

        // Check if there is a fraction.
        int number1 = fractionLength(number1JTextField.getText());
        int number2 = fractionLength(number2JTextField.getText());
        int number3 = fractionLength(number3JTextField.getText());

        // Finding required shift of digits.
        int digitsShift;
        if(number1 >= number2)
        {
            if(number3 > number1)
                digitsShift = number3;
            else
                digitsShift = number1;
        } // if
        else
        {
            if(number3 > number2)
                digitsShift = number3;
            else
                digitsShift = number2;
        } // else

        // Overwriting required digit shift with excepted result of casting to int.
        number1 = shiftDigits(Double.parseDouble(number1JTextField.getText()), digitsShift);
        number2 = shiftDigits(Double.parseDouble(number2JTextField.getText()), digitsShift);
        number3 = shiftDigits(Double.parseDouble(number3JTextField.getText()), digitsShift);

        // If any result is 0 then result must be cast to long.
        // And GCD is returned as such.
        if(number1 == 0 || number2 == 0 || number3 == 0) {
            long extendedNumber1 = (long) (Double.parseDouble(number1JTextField.getText()) * Math.pow(10, digitsShift));
            long extendedNumber2 = (long) (Double.parseDouble(number2JTextField.getText()) * Math.pow(10, digitsShift));
            long extendedNumber3 = (long) (Double.parseDouble(number3JTextField.getText()) * Math.pow(10, digitsShift));

            long theGCD = MyMath.greatestCommonDivisor(extendedNumber1, extendedNumber2);
            theGCD = MyMath.greatestCommonDivisor(theGCD, extendedNumber3);
            resultJTextField.setText(shiftDigits(theGCD, digitsShift));

        } // if
        else
        {
            // Overwriting required digit shift with excepted result of casting to int.
            number1 = shiftDigits(Double.parseDouble(number1JTextField.getText()), digitsShift);
            number2 = shiftDigits(Double.parseDouble(number2JTextField.getText()), digitsShift);
            number3 = shiftDigits(Double.parseDouble(number3JTextField.getText()), digitsShift);

            int theGCD = MyMath.greatestCommonDivisor(number1, number2);
            theGCD = MyMath.greatestCommonDivisor(theGCD, number3);
            resultJTextField.setText(shiftDigits(theGCD, digitsShift));
        } // else



    } // actionPerformed

    // Private method helping to find length of fraction in given string.
    // If there is a fraction value, it will be multiplied till there is a whole number
    // and return it as long.
    private static int fractionLength(String number)
    {

        // Check if there is a fraction.
        int fractionElementStart = number.indexOf('.');

        // If the is no fraction.
        if(fractionElementStart == -1)
            return 0;
        else
        {
            // Fraction element is changed from index into position.
            fractionElementStart++;

            // Finding necessary amount of multiplication.
            // First assumption - none of fraction elements is used (all 0).
            int fractionDigits = 0;

            // Finds position of the last digit, which is not 0.
            for (int index = fractionElementStart; index < number.length(); index++) {
                if(!(number.charAt(index) == '0'))
                    fractionDigits = index + 1;
            } // for

            // If loop did not update it means there are no other values than 0.
            // Otherwise, fraction is represented by difference between start of the fraction
            // and its last valid (non 0) digit.
            if(fractionDigits == 0)
                return fractionDigits;
            else
                return fractionDigits - fractionElementStart;

        } // else
    } // fractionLength

    // Private helper method to return proper fraction of GCD.
    private static String shiftDigits(int GCD, int requiredShift)
    {
        System.out.println(requiredShift);
        StringBuffer stringBuffer = new StringBuffer();
        String intValue = String.valueOf(GCD);

        // When GCD length is longer then new String is long by 1
        // just insert dot somewhere in the middle.
        if(intValue.length() > requiredShift)
        {
            for (int index = 0; index < intValue.length(); index++) {

                if (index == intValue.length() - requiredShift)
                    stringBuffer.append('.');

                stringBuffer.append(intValue.charAt(index));
            } // for
        } // if
        else // shift is longer than given number. Two elements are added.
        {
            stringBuffer.append("0.");
            // Starting index should be negative, characters with index < 0 are filled with 0.
            for (int index = intValue.length() - requiredShift; index < intValue.length() ; index++) {
                if(index >= 0)
                    stringBuffer.append(intValue.charAt(index));
                else
                    stringBuffer.append('0');

                System.out.println(stringBuffer.toString());
            } // for

        } // else
        return stringBuffer.toString();
    } // shiftDigits

    // Private helper method to return proper fraction of GCD.
    private static String shiftDigits(long GCD, int requiredShift)
    {
        StringBuffer stringBuffer = new StringBuffer();
        String longValue = String.valueOf(GCD);

        // When GCD length is longer then new String is long by 1
        // just insert dot somewhere in the middle.
        if(longValue.length() > requiredShift)
        {
            for (int index = 0; index < longValue.length(); index++) {

                if (index == longValue.length() - requiredShift)
                    stringBuffer.append('.');

                stringBuffer.append(longValue.charAt(index));
            } // for
            return stringBuffer.toString();
        } // if
        else // shift is longer than given number. Two elements are added.
        {
            stringBuffer.append("0.");
            // Starting index should be negative, characters with index < 0 are filled with 0.
            for (int index = longValue.length() - requiredShift; index < longValue.length() ; index++) {
                if(index >= 0)
                    stringBuffer.append(longValue.charAt(index));
                else
                    stringBuffer.append('0');
            } // for

        } // else

        return stringBuffer.toString();
    } // shiftDigits
    // Private helper method to shift values by a given digit.
    // If result number exceeds int range, then 0 is returned.
    private static int shiftDigits(double changedNumber, int requiredShift)
    {
        // Check if number can be held by integer.
        if(changedNumber * Math.pow(10,requiredShift) > Integer.MAX_VALUE)
            return 0;
        else
            return (int) (changedNumber * Math.pow(10,requiredShift));

    } // shiftDigits

    // Create a GCD and make it appear on screen.
    public static void main(String [] args)
    {
        new GCD().setVisible(true);
    } // main

} //  class GCD {
