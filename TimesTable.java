import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.GridLayout;

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
		content.setLayout(new GridLayout(0,5, 50, 5));

		for (int index = 1; index <= tableSize; index++) {
			content.add(new JLabel("" + index));
			content.add(new JLabel("X"));
			content.add(new JLabel("" + numberToMultiply));
			content.add(new JLabel("="));
			content.add(new JLabel("" + index * numberToMultiply));
		}

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	} // TimesTable

	// Create a TimesTable and make it appear on screen.
	public static void main(String[] args) {

		TimesTable theTimesTable = new TimesTable(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		theTimesTable.setVisible(true);
	}


} // TimesTable class