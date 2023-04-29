import java.awt.Color;

// Representation of a worker making balls
// and filling up machines in the lottery.
public class Worker extends MoodyPerson
{
    // Constructor is given the person's name.
    public Worker(String name)
    {
        super(name);
    } // Worker

    @Override
    // Returns the name of the type of Person.
    public String getPersonType()
    {
        return "Worker";
    } // getPersonType

    @Override
    // Returns Person's current saying.
    public String getCurrentSaying()
    {
        if(isHappy())
            return "Time for tea, I think";
        else
            return "Puff, pant, puff, pant";
    } // getCurrentSaying


    // Returns a newly created Ball with the given number and colour.
    public Ball makeNewBall(int number, Color color)
    {
        return new Ball(number,color);
    } // makeNewBall

    // Makes this worker fill the machine of the given Game.
    // The balls are created as they are inserted into the Machine.
    public void fillMachine(Game game) throws BallContainerException
    {
        // Color of balls are evenly spread between these colours,
        // in ascending order.
        Color [] colourGroupColours = new Color [] {Color.red, Color.orange, Color.yellow, Color.green,
                                            Color.blue, Color.pink, Color.magenta };

        // This happiness change will show up when the GUI is added.
        setHappy(false);
        speak();

        int noOfBalls = game.getMachineSize();
        for (int count = 1; count <= noOfBalls; count++)
        {
            // The colour group is a number form 0
            // to the number of colour groups - 1.
            // For the nth ball, we take the fraction
            // (n - 1) divided by the number of balls
            // and multiply that by the number of groups.
            int colourGroup = (int) ((count - 1.0)/(double) noOfBalls * (double) colourGroupColours.length);
            Color ballColour = colourGroupColours[colourGroup];
            game.machineAddBall(makeNewBall(count, ballColour));
        } // for

        setHappy(true);
        speak();

    } // fillMachine

} // class Worker
