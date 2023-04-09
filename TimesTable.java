import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// Program to show a times table for a multiplier chosen by the user.
// The user also chooses the size of the table.
public class TimesTable extends JFrame implements ActionListener
{
	// A text field for the user to enter the multiplier.
	private final JTextField multiplierJTextField = new JTextField(5);

	// A text field for the user to enter the size of the table.
	private final JTextField tableSizeJTextField = new JTextField("10");

	// A text area for the resulting times table, 15 lines or 20 characters.
	private final JTextArea displayJTextArea = new JTextArea(15,20);

	// Constructor method
	public TimesTable()
	{
		setTitle("Times Table");
		Container contents = getContentPane();
		contents.setLayout(new BorderLayout());

		// A JPanel the two text fields.
		// It will be a GridLayout of two times two,
		// at the top of the JFrame contents.
		JPanel numbersPanel = new JPanel();
		contents.add(numbersPanel, BorderLayout.NORTH);
		numbersPanel.setLayout(new GridLayout(2,0));

		// Add to JLabels, and two JTextFields to the numbersPanel.
		numbersPanel.add(new JLabel("Multiplier:"));
		numbersPanel.add(multiplierJTextField);
		numbersPanel.add(new JLabel("Table size:"));
		numbersPanel.add(tableSizeJTextField);

		// The result JScrollPane/JTextArea goes in the centre.
		contents.add(new JScrollPane(displayJTextArea), BorderLayout.CENTER);

		// The JButton goes at the bottom.
		JButton displayJButton = new JButton("Display");
		contents.add(displayJButton,BorderLayout.SOUTH);
		displayJButton.addActionListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();

	} // TimesTable

	public TimesTable(String multiplierJTextFieldMessage)
	{
		setTitle("Times Table Error");
		Container contents = getContentPane();
		contents.setLayout(new BorderLayout());
		contents.add(displayJTextArea);
		displayJTextArea.setText(multiplierJTextFieldMessage);
		displayJTextArea.append("\nOnly whole numbers are accepted arguments.");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		pack();

	} // TimesTable

	// Act upon the button being pressed.
	public void actionPerformed(ActionEvent event)
	{
		try {
			// Empty the text area to remove any previous result.
			displayJTextArea.setText("");

			int multiplier = Integer.parseInt(multiplierJTextField.getText());
			int tableSize = Integer.parseInt(tableSizeJTextField.getText());

			displayJTextArea.append("--------------------------------\n");
			displayJTextArea.append("| Times table for " + multiplier + "\n");
			displayJTextArea.append("--------------------------------\n");
			for (int thisNumber = 1; thisNumber <= tableSize; thisNumber++)
				displayJTextArea.append("| " + thisNumber + " x " + multiplier
						+ " = " + thisNumber * multiplier + "\n");

			displayJTextArea.append("--------------------------------\n");
		} // try
		catch (NumberFormatException exception)
		{
				System.err.println(exception.getMessage());
				TimesTable errorTable = new TimesTable(exception.getMessage());
				errorTable.setVisible(true);
		} // catch
	} // actionPerformed

	// Create a TimesTable and make it appear on screen.
	public static void main(String [] args) {
		new TimesTable().setVisible(true);
	} // main

} // TimesTable class