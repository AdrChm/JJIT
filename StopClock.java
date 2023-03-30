import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;

// A simple stop clock program. The button stops and starts the clock.
// The clock records start time, stop time and shows elapsed time.
public class StopClock extends JFrame implements ActionListener{

    // True if and only if the clock is running.
    private boolean isRunning = false;

    // The time when the clock is started.
    // as milliseconds since midnight, January 1st, 1970.
    private long startTime = 0;

    // The time when the clock is stopped.
    // as milliseconds since midnight, January 1st, 1970.
    private long stopTime = 0;

    // The time when the slip button is being pushed.
    // as milliseconds since midnight, January 1st, 1970.
    private long slipTime = 0;

    // Amount of slips done so far. Counting starts from 1
    // as first split is just clock being run.
    private int slipCounter = 1;

    // Case1: Pause has started
    // The time when the pause is started.
    // as milliseconds since midnight, January 1st, 1970.
    // Case2: Pause has ended
    // Time difference between the start and end of the pause.
    private long pauseTime = 0;

    // Split pause used to reflect amount of pause before given split has begun
    private long splitPause = 0;

    // True if and only if the clock is paused.
    // This is necessary, as during the pause, the clock can be stopped.
    private boolean isPause = false;

    // Number to represent sum of previous pauses.
    private long previousPauses = 0;

    // A text field for showing the elapsed time.
    private final JTextField elapsedTimeJTextField = new JTextField("Not started");

    // A text field for showing the elapsed time.
    private final JTextField splitTimeJTextField = new JTextField("Not started");

    private Font JTextFont = elapsedTimeJTextField.getFont();

    // Start/Stop button.
    private final JButton startStopJButton;

    // Split button.
    private final JButton splitJButton;

    // Pause/Resume button.
    private final JButton pauseJButton;
    // Container.
    private final Container contents;
    // Constructor.
    public StopClock()
    {
        setTitle("Stop Clock");

        contents = getContentPane();
        // Use a grid layout with one column.
        contents.setLayout(new GridLayout(0, 1));

        contents.add(new JLabel("Elapsed time (seconds):"));
        contents.add(elapsedTimeJTextField);
        elapsedTimeJTextField.setEnabled(false);

        JTextFont = new Font(JTextFont.getFontName(), Font.BOLD, JTextFont.getSize());
        elapsedTimeJTextField.setFont(JTextFont);

        contents.add(new JLabel("Split time (seconds):"));
        contents.add(splitTimeJTextField);
        splitTimeJTextField.setEnabled(false);
        splitTimeJTextField.setFont(JTextFont);

        this.startStopJButton = new JButton("Start");
        startStopJButton.addActionListener(this);
        contents.add(startStopJButton);

        this.splitJButton = new JButton("Split");
        splitJButton.addActionListener(this);
        splitJButton.setEnabled(false);
        contents.add(splitJButton);

        this.pauseJButton = new JButton("Pause");
        pauseJButton.addActionListener(this);
        pauseJButton.setEnabled(false);
        contents.add(pauseJButton);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    } // StopClock

    // Perform action when the button is pressed.
    public void actionPerformed(ActionEvent event)
    {
        // Event behaviour for Start/Stop button.
        if(event.getSource() == this.startStopJButton)
            if (!isRunning)
            {
                // Start the clock.
                startStopJButton.setText("Stop");
                splitJButton.setEnabled(true);
                pauseJButton.setEnabled(true);
                startTime = System.currentTimeMillis();
                elapsedTimeJTextField.setText("Running... ");
                splitTimeJTextField.setText("Running... ");
                isRunning = true;
            } // if
            else // isRunning
            {
                // Stop the clock.
                stopTime = System.currentTimeMillis();
                startStopJButton.setText("Start");
                splitJButton.setEnabled(false);
                pauseJButton.setEnabled(false);

                // If pause is active it has to be stopped.
                if(isPause)
                {
                    pauseTime = stopTime - pauseTime;
                    previousPauses += pauseTime;
                    isPause = false;
                } // if

                long elapsedMilliseconds = stopTime - startTime - previousPauses;
                elapsedTimeJTextField.setText("" + elapsedMilliseconds/ 1000.0);
                isRunning = false;

                // Split time of the last slip is there was one than one additional
                // label is added to represent last split.
                if (slipCounter == 1)
                    splitTimeJTextField.setText("" + elapsedMilliseconds/ 1000.0);
                else
                {
                    JTextField newText = new JTextField("Split " + slipCounter + " time (seconds):"
                            + (stopTime - slipTime - (previousPauses - splitPause)) / 1000.0);
                    contents.add(newText);
                    newText.setEnabled(false);
                    newText.setFont(JTextFont);

                } // else

            } // else

        // Event behaviour for Split button.
        else if(event.getSource() == this.splitJButton)
        {
            if (slipTime == 0)
            {
                // First split. No previous split means all pauses ale in this one.
                slipTime = System.currentTimeMillis();
                long splitTimeMilliseconds = slipTime - startTime - previousPauses;
                splitTimeJTextField.setText("" + splitTimeMilliseconds / 1000.0);
                slipCounter++;

            } else // Next split.
            {
                long nextSplit = System.currentTimeMillis();
                JTextField newText = new JTextField("Split " + slipCounter + " time (seconds):"
                                                    + (nextSplit - slipTime  - (previousPauses - splitPause)) / 1000.0);
                contents.add(newText);
                newText.setEnabled(false);
                newText.setFont(JTextFont);
                slipTime = nextSplit;
            } // else
            splitPause = previousPauses;
        } // else if
        else // Event behaviour for Pause/Resume button.
        {
            if (!isPause) // Pause option is not pushed yet
            {
                pauseJButton.setText("Resume");
                splitJButton.setEnabled(false);
                pauseTime = System.currentTimeMillis();
                elapsedTimeJTextField.setText("Paused... ");

                if (slipTime == 0)
                    splitTimeJTextField.setText("Paused... ");
                isPause = true;
            } // if
            else // Pause is active - resume.
            {
                pauseJButton.setText("Resume");
                splitJButton.setEnabled(true);
                long resumeTimeStamp = System.currentTimeMillis();
                pauseTime = resumeTimeStamp - pauseTime;
                previousPauses += pauseTime;
                elapsedTimeJTextField.setText("Running... ");

                if (slipTime == 0)
                    splitTimeJTextField.setText("Running... ");
                isPause = false;
            } // else
        } // else

        // It is a good idea to pack again
        // because of the size of the labels may have changed.
        pack();

    } // actionPerformed

    // Create StopClock and make it appear on screen.
    public static void main(String[] args) {
        new StopClock().setVisible(true);

    } // main

} // class StopClock
