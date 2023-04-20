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
    public BallContainer(String requiredName, int requiredSize)
    {
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

    // Returns the Ball at the given index in the BallContainer,
    // or null if that index is not in the range 0 to noOfBalls -1.
    public Ball getBall(int index)
    {
        if (index >= 0 && index < noOfBalls)
            return balls[index];
        else
            return null;
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
    // index position. Has no effect if the BallContainer is full.
    public void addBall(Ball ball)
    {
        if(noOfBalls < balls.length)
        {
            balls[noOfBalls] = ball;
            noOfBalls++;
        } // if
    } // addBall

    // Swaps the balls at the two given index positions.
    // Has no effect if either index is not in the range 0 to noOfBalls -1.
    public void swapBalls(int index1, int index2)
    {
        if(index1 >= 0 && index1 < noOfBalls
            && index2 >= 0 && index2 < noOfBalls)
        {
            Ball thatWasAtIndex1 = balls[index1];
            balls[index1] = balls[index2];
            balls[index2] = thatWasAtIndex1;
        } // if
    } // swapBalls

    // Remove the Ball at the highest used index position.
    // has no effect if the BallContainer is empty.
    public void removeBall()
    {
        if(noOfBalls > 0)
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
