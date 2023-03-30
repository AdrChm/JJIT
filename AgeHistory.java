import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

/* Report the age history of a person.
	Current date and person details are entered through text fields.
	The result is displayed in a text area.
	A ''new'' button enables multiple displays.
*/
public class AgeHistory extends JFrame implements ActionListener
{

	// JTextFields for the present date.
	private final JTextField presentDayJTextField = new JTextField(2);
	private final JTextField presentMonthJTextField = new JTextField(2);
	private final JTextField presentYearJTextField = new JTextField(4);

	// JTextFields for the name and birthday.
	private final JTextField nameJTextField = new JTextField(15);
	private final JTextField birthDayJTextField = new JTextField(2);
	private final JTextField birthMonthJTextField = new JTextField(2);
	private final JTextField birthYearJTextField = new JTextField(4);

	// JTextArea for the result.
	private final JTextArea ageHistoryJTextArea = new JTextArea(15,20);

	// TThe age history display button.
	private final JButton displayJButton = new JButton("Display");

	// TThe new window button.
	private final JButton newJButton = new JButton("New");

	// The number of instances created: each has its number in the title.
	private static int instanceCountSoFar = 0;

	// Constructor.
	public AgeHistory()
	{
		instanceCountSoFar++;
		setTitle("Age History (" + instanceCountSoFar + ")");

		Container contents = getContentPane();
		contents.setLayout(new BorderLayout());

		// The top panel is for the inputs.
		// It will be a grid of 3 by 2.
		JPanel inputDataJPanel = new JPanel();
		contents.add(inputDataJPanel, BorderLayout.NORTH);
		inputDataJPanel.setLayout(new GridLayout(0,2));

		// Top left of inputDataJPanel.
		inputDataJPanel.add(new JLabel("Present date"));

		// Top right of inputDataJPanel.
		// A JPanel with left aligned FlowLayout,
		// For today's date components.
		JPanel presentDayJPanel = new JPanel();
		inputDataJPanel.add(presentDayJPanel);
		presentDayJPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

		// JTextFields for present date components, with JLabels.
		presentDayJPanel.add(presentDayJTextField);
		presentDayJPanel.add(new JLabel("/"));
		presentDayJPanel.add(presentMonthJTextField);
		presentDayJPanel.add(new JLabel("/"));
		presentDayJPanel.add(presentYearJTextField);

		// Middle left of inputDataJPanel.
		inputDataJPanel.add(new JLabel("Person name"));

		// Middle right of inputDataJPanel.
		// Use a JPanel so that alignment matches rows above and below.
		JPanel nameJPanel = new JPanel();
		inputDataJPanel.add(nameJPanel);
		nameJPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		nameJPanel.add(nameJTextField);

		// Bottom left of inputDataJPanel.
		inputDataJPanel.add(new JLabel("Birthday"));

		// Bottom right of inputDataJPanel.
		// A JPanel with left aligned FlowLayout,
		// For birthday components.
		JPanel birthdayJPanel = new JPanel();
		inputDataJPanel.add(birthdayJPanel);
		birthdayJPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

		// JTextFields for birthday components, with JLabels.
		birthdayJPanel.add(birthDayJTextField);
		birthdayJPanel.add(new JLabel("/"));
		birthdayJPanel.add(birthMonthJTextField);
		birthdayJPanel.add(new JLabel("/"));
		birthdayJPanel.add(birthYearJTextField);

		// The result JTextArea goes in the centre.
		contents.add(new JScrollPane(ageHistoryJTextArea), BorderLayout.CENTER);

		// The buttons go at the bottom, in a JPanel with FlowLayout.
		JPanel buttonJPanel = new JPanel();
		contents.add(buttonJPanel,BorderLayout.SOUTH);
		buttonJPanel.setLayout(new FlowLayout());
		buttonJPanel.add(displayJButton);
		displayJButton.addActionListener(this);
		buttonJPanel.add(newJButton);
		newJButton.addActionListener(this);

		// Allow for the possibility that the present date has already been set.
		Date presentDate = Date.getPresentDate();
		if (presentDate != null)
		{
			presentDayJTextField.setText("" + presentDate.getDay());
			presentMonthJTextField.setText("" + presentDate.getMonth());
			presentYearJTextField.setText("" + presentDate.getYear());
			presentDayJTextField.setEnabled(false);
			presentMonthJTextField.setEnabled(false);
			presentYearJTextField.setEnabled(false);
		} // if

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		pack();

	} // AgeHistory

	// Act upon the button being pressed.
	public void actionPerformed(ActionEvent event)
	{
		if(event.getSource() == newJButton)
		{
			new AgeHistory().setVisible(true);


		} // if



		else if (event.getSource() == displayJButton)
		{
			// Set the present date only if it has not already been set.
			if (Date.getPresentDate() == null)
			{

				Date presentDate = new Date(Integer.parseInt(presentDayJTextField.getText()),
											Integer.parseInt(presentMonthJTextField.getText()),
											Integer.parseInt(presentYearJTextField.getText()));

			System.out.println("gen" + presentDate);

				Date.setPresentDate(presentDate);

				// Date should be set only once: disable further editing.
				presentDayJTextField.setEnabled(false);
				presentMonthJTextField.setEnabled(false);
				presentYearJTextField.setEnabled(false);
			} // if
			else // Prevents existence of multiple present dates
			{
				Date givenPresentDate = new Date(Integer.parseInt(presentDayJTextField.getText()),
												 Integer.parseInt(presentMonthJTextField.getText()),
												 Integer.parseInt(presentYearJTextField.getText()));

				// When given date is not present date, fields will update themselves to original value.
				if(Date.getPresentDate().compareTo(givenPresentDate) != 0)
				{
					presentDayJTextField.setText("" + Date.getPresentDate().getDay());
					presentMonthJTextField.setText("" + Date.getPresentDate().getMonth());
					presentYearJTextField.setText("" + Date.getPresentDate().getYear());
					presentDayJTextField.setEnabled(false);
					presentMonthJTextField.setEnabled(false);
					presentYearJTextField.setEnabled(false);
				} // if
			}
			// Compute and display the age history.
			String name = nameJTextField.getText();
			Date birthday = new Date(Integer.parseInt(birthDayJTextField.getText()),
									 Integer.parseInt(birthMonthJTextField.getText()),
									 Integer.parseInt(birthYearJTextField.getText()));

			Person person = new Person(name, birthday);
			ageHistoryJTextArea.setText(person.ageHistory());
		} // else if
	} // actionPerformed

	// Create and AgeHistory and make it appear on the screen.
	public static void main(String [] args)
	{
		// Ensure we use just \n for age history line separator on all platforms.
		Person.setLineSeparator("\n");
		new AgeHistory().setVisible(true);
	} // main

} // class AgeHistory