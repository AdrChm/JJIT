import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// Calculate the GCD of two integers.
public class GCD extends JFrame implements ActionListener
{
    // A JTextField for each number.
    private final JTextField number1JTextField = new JTextField(20);
    private final JTextField number2JTextField = new JTextField(20);
    // A JTextField for the result.
    private final JTextField resultJTextField = new JTextField(20);

    // Constructor.
    public GCD()
    {
        setTitle("GCD");

        Container contents = getContentPane();
        // Main layout will be 2 by 1.
        contents.setLayout(new GridLayout(0 ,1));

        // A JPanel for the top half of the main grid.
        // This will have a layout of 2 by 2.
        // It will contain 2 labels, and two text fields for input.
        JPanel numberFieldsJPanel = new JPanel();
        contents.add(numberFieldsJPanel);
        numberFieldsJPanel.setLayout(new GridLayout(0,2));

        // A JPanel for the bottom half of the main grid.
        // This will have a layout of 1 by 2.
        // It will contain the button and JPanel for the result.
        JPanel buttonAndResultJPanel = new JPanel();
        contents.add(buttonAndResultJPanel);
        buttonAndResultJPanel.setLayout(new GridLayout(0,2));

        // Two labels and two text fields for the top JPanel.
        numberFieldsJPanel.add(new JLabel("Number 1"));
        numberFieldsJPanel.add(new JLabel("Number 2"));
        numberFieldsJPanel.add(number1JTextField);
        numberFieldsJPanel.add(number2JTextField);

        // The compute button will live in the left of the bottom JPanel.
        JButton computeJButton = new JButton("Compute");
        buttonAndResultJPanel.add(computeJButton);
        computeJButton.addActionListener(this);

        // A for the right of the bottom half of the main grid.
        // This will have layout of 2 by 1.
        // It will contain a label and a text field for the result.
        JPanel resultJPanel = new JPanel();
        buttonAndResultJPanel.add(resultJPanel);
        resultJPanel.setLayout(new GridLayout(0, 1));

        // A label and a text field for the bottom right JPanel.
        resultJPanel.add(new JLabel("GCD of Number 1 and Number 2"));
        resultJPanel.add(resultJTextField);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    } // GCD

    // Act upon the button being pressed.
    public void actionPerformed(ActionEvent event)
    {
        int number1 = Integer.parseInt(number1JTextField.getText());
        int number2 = Integer.parseInt(number2JTextField.getText());
        int theGCD = MyMath.greatestCommonDivisor(number1, number2);
        resultJTextField.setText("" + theGCD);
    } // actionPerformed

    // Create a GCD and make it appear on screen.
    public static void main(String [] args)
    {
        new GCD().setVisible(true);
    } // main

} //  class GCD {
