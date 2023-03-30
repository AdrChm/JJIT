import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// Program to show a times table for a multiplier chosen by the user.
public class TimesTable extends JFrame implements ActionListener
{
	// A text field for the user to enter the multiplier.
	private final JTextField multiplierJTextField = new JTextField(5);

	// A text area for the resulting times table, 15 lines or 20 characters.
	private final JTextArea displayJTextArea = new JTextArea(15,20);

	// Constructor method
	public TimesTable()
	{
		setTitle("Times Table");
		Container content = getContentPane();
		content.setLayout(new BorderLayout());

		content.add(multiplierJTextField, BorderLayout.NORTH);
		content.add(displayJTextArea, BorderLayout.CENTER);
		displayJTextArea.setEnabled(false);

		JButton displayJButton = new JButton("Display");
		content.add(displayJButton,BorderLayout.SOUTH);
		displayJButton.addActionListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();

	} // TimesTable

	// Act upon the button being pressed.
	public void actionPerformed(ActionEvent event)
	{
		// Empty the text area to remove any previous result.
		displayJTextArea.setText("");

		int multiplier = Integer.parseInt(multiplierJTextField.getText());

		displayJTextArea.append("--------------------------------\n");
		displayJTextArea.append("| Times table for " + multiplier + "\n");
		displayJTextArea.append("--------------------------------\n");
		for (int thisNumber = 1; thisNumber <= 10; thisNumber++)
			displayJTextArea.append("| " + thisNumber + " x " + multiplier
								   + " = " + thisNumber * multiplier + "\n");

		displayJTextArea.append("--------------------------------\n");
	} // actionPerformed

	// Create a TimesTable and make it appear on screen.
	public static void main(String [] args) {
		new TimesTable().setVisible(true);
	} // main

} // TimesTable class