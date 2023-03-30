import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

// Program to represent possible weights measures with help of three
// weights given by the user.
public class ThreeWeights extends JFrame implements ActionListener {

	// Text fields for user to enter the weights.
	private final JTextField number1JTextField = new JTextField(10);
	private final JTextField number2JTextField = new JTextField(10);
	private final JTextField number3JTextField = new JTextField(10);

	// Result text area
	JTextArea resultJTextArea = new JTextArea("Waiting for calculation",15,10);

	// Constructor
	public ThreeWeights() {
		setTitle("Three weights");

		Container content = getContentPane();
		content.setLayout(new BorderLayout());

		// A JPanel the three text fields.
		// It will be a GridLayout of two times two,
		// at the top of the JFrame contents.

		JPanel numbersPanel = new JPanel(new GridLayout(0,2));
		content.add(numbersPanel,BorderLayout.NORTH);
		numbersPanel.add(new JLabel("Weight 1: "));
		numbersPanel.add(number1JTextField);
		numbersPanel.add(new JLabel("Weight 2: "));
		numbersPanel.add(number2JTextField);
		numbersPanel.add(new JLabel("Weight 3: "));
		numbersPanel.add(number3JTextField);

		content.add(new JScrollPane(resultJTextArea),  BorderLayout.CENTER);
		resultJTextArea.setEnabled(false);


		// The calculated button.
		JButton calculateJButton = new JButton("Calculate");
		content.add(calculateJButton, BorderLayout.SOUTH);
		calculateJButton.addActionListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();

	} // ThreeWeights

	public void actionPerformed(ActionEvent event)
	{
		resultJTextArea.setText("");
		
		int weight1 = Integer.parseInt(number1JTextField.getText());
		int weight2 = Integer.parseInt(number2JTextField.getText());
		int weight3 = Integer.parseInt(number3JTextField.getText());
		
		// Calculating weights combinations
		for (int weight1Index = -1; weight1Index <= 1 ; weight1Index++)
			for (int weight2Index = -1; weight2Index <= 1 ; weight2Index++)
				for (int weight3Index = -1; weight3Index <= 1 ; weight3Index++)
					resultJTextArea.append(weight1Index * weight1 + weight2 * weight2Index + weight3 * weight3Index + "\n");

	} // actionPerformed
	public static void main(String [] args)
	{
		new ThreeWeights().setVisible(true);

	} // main

} // class ThreeWeights