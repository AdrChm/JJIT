import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Color;

// Program to print out a neat multiplication table.
// It can take up to two arguments:
// First describes scope of the table (starting from one)
// Second describes number, which will be multiplied by each table element.
public class TimesTable extends JFrame
{
	// Constructor method
	public TimesTable(int tableSize, int numberToMultiply) {

		setTitle( tableSize + " x " + numberToMultiply);
		Container content = getContentPane();
		content.setLayout(new GridLayout(0,5, 0, 5));
		content.setBackground(Color.WHITE);

		for (int index = 1; index <= tableSize; index++) {

			if(index % 2 == 0)
			{
				content.add(formatJLabel("" + index));
				content.add(formatJLabel("X"));
				content.add(formatJLabel("" + numberToMultiply));
				content.add(formatJLabel("="));
				content.add(formatJLabel("" + index * numberToMultiply));
			}
			else {

				content.add(new JLabel("" + index));
				content.add(new JLabel("X"));
				content.add(new JLabel("" + numberToMultiply));
				content.add(new JLabel("="));
				content.add(new JLabel("" + index * numberToMultiply));

			} // else
		} // for

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();

	} // TimesTable

	// Option extra - setting colors for alternating rows.
	// Private helper method to color even labels
	private JLabel formatJLabel(String text)
	{
		Color lightBlue = new Color(222, 245, 255);
		JLabel label = new JLabel(text);
		label.setOpaque(true);
		label.setBackground(lightBlue);
		return label;
	}

	// Create a TimesTable and make it appear on screen.
	public static void main(String[] args) {

		TimesTable theTimesTable = new TimesTable(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		theTimesTable.setVisible(true);
	} // main

} // TimesTable class