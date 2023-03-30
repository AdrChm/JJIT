import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

// The ActionListener for CoinTosser's TossCoin JButton. Each time
// actionPerformed is called, we count the number of tosses, and update the
// given JLabel with that count, plus either "Heads" or "Tails".
public class TossCoinActionListener implements ActionListener {

    // The JLabel needs to be updated.
    private final JLabel headsOrTailsJLabel;

    // We count the tosses, so it is clear when we have a new toss.
    private int noOfTossesSoFar = 0;

    // Constructor.
    public TossCoinActionListener(JLabel requiredHeadsOrTailsJLabel)
    {
        headsOrTailsJLabel = requiredHeadsOrTailsJLabel;
    } // TossCoinActionListener

    // Action performed: update noOfTossesSoFar and headsOrTailsJLabel.
    public void actionPerformed(ActionEvent event){
        noOfTossesSoFar++;
        if(Math.random() >= 0.5)
            headsOrTailsJLabel.setText("Toss " + noOfTossesSoFar + ": Heads");
        else
            headsOrTailsJLabel.setText("Toss " + noOfTossesSoFar + ": Tails");
    } // actionPerformed

} // class TossCoinActionListener
