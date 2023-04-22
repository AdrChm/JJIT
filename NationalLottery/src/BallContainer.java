// Representation off a container of balls for the lottery,
// with a fixed size and zero or more balls in a certain order.
public abstract class BallContainer
{
    // The name of BallContainer.
    private final String name;

    // The balls contained in the BallContainer.
    private final Ball[] balls;

    // The number of balls contained in the BallContainer.
    // These are stored in balls, indexes 0 to noOfBalls -1.
    private int noOfBalls;

    // Constructor is given the name and size.
    public BallContainer(String requiredName, int requiredSize) throws BallContainerException
    {
        if(requiredSize < 1)
            throw new BallContainerException("Size must be at least 1");
        name = requiredName;
        balls = new Ball[requiredSize];
        noOfBalls = 0;
    } // BallContainer

    // Returns the BallContainer's name.
    public String getName()
    {
        return name;
    } // getName

    // Returns the name of the type of BallContainer.
    public abstract String getType();

    // Returns the Ball at the given index in the BallContainer.
    // Throws exception if that index is not in the range 0 to noOfBalls -1.
    public Ball getBall(int index) throws BallContainerException
    {
        if(noOfBalls == 0)
            throw new BallContainerException("Cannot get balls: is empty");
        if(index < 0 || index >= noOfBalls)
            throw new BallContainerException("Get ball at " + index + ": not in range 0.."
                                            + (noOfBalls - 1));

        return balls[index];

    } // getBall

    // Returns the number of balls in the BallContainer.
    public int getNoOfBalls()
    {
        return noOfBalls;
    } // getNoOfBalls

    // Returns the size of the BallContainer.
    public int getSize()
    {
        return balls.length;
    } // getSize

    // Adds the given ball into the BallContainer, at the next highest unused
    // index position. Throws exception if the BallContainer is full.
    public void addBall(Ball ball) throws BallContainerException
    {
        if (noOfBalls == balls.length)
            throw new BallContainerException("Cannot add ball: is full");

        balls[noOfBalls] = ball;
        noOfBalls++;

    } // addBall

    // Swaps the balls at the two given index positions.
    // Throws exception if either index is not in the range 0 to noOfBalls -1.
    public void swapBalls(int index1, int index2) throws BallContainerException
    {
        if (noOfBalls == 0)
            throw new BallContainerException("Cannot swap balls: is empty");

        if (index1 < 0 || index1 >= noOfBalls)
            throw new BallContainerException
                    ("Swap ball at " + index1 + ": not in range 0.."
                    + (noOfBalls - 1));

        if (index2 < 0 || index2 >= noOfBalls)
            throw new BallContainerException
                    ("Swap ball at " + index2 + ": not in range 0.."
                            + (noOfBalls - 1));

        Ball thatWasAtIndex1 = balls[index1];
        balls[index1] = balls[index2];
        balls[index2] = thatWasAtIndex1;

    } // swapBalls

    // Remove the Ball at the highest used index position.
    // Throws exception if the BallContainer is empty.
    public void removeBall() throws BallContainerException
    {
        if(noOfBalls <= 0)
            throw new BallContainerException("Cannot remove ball: is empty");

        noOfBalls--;
    } // removeBall

    @Override
    // Mainly for testing.
    public String toString()
    {
        String result = getType() + " " + name + "(<=" + balls.length + ")";
        for(int index = 0; index < noOfBalls; index++)
            result += String.format("%n%d %s", index, balls[index]);
        return result;
    } // toString

} // class BallContainer
