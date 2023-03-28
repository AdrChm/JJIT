import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// A simple coin tossing program. The button tosses the coin.
// The label shows how many tosses there have been and whether
// the latest one was heads or tails.
public class CoinTosser extends JFrame{

    // Constructor
    public CoinTosser()
    {
        setTitle("Coin Tosser");
        Container contents = getContentPane();
        // Use a grid layout with one column.
        contents.setLayout(new GridLayout(0, 1));

        JLabel headsOrTailsJLabel = new JLabel("Not yet tossed");
        contents.add(headsOrTailsJLabel);

        JButton tossCoinJButton = new JButton("Toss the coin");
        contents.add(tossCoinJButton);

        // The action listener for the button needs to update the heads/tails.
        // JLabel, so we pass that reference to its constructor.
        TossCoinActionListener listener = new TossCoinActionListener(headsOrTailsJLabel);
        tossCoinJButton.addActionListener(listener);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    } // CoinTosser

    // Create a CoinTosser and make it appear on the screen.
    public static void main(String[] args) {
        CoinTosser theCoinTosser = new CoinTosser();
        theCoinTosser.setVisible(true);
    } // main

} // class CoinTosser
