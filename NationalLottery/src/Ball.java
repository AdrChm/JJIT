import java.awt.Color;

// Representation of a lottery ball, comprising colour and value.
public class Ball implements Comparable<Ball>
{
    // The numeric value of the ball.
    private final int value;

    // The colour of the ball.
    private final Color colour;

    // A ball is constructed by giving a number and a colour.
    public Ball(int requiredValue, Color requiredColour)
    {
        value = requiredValue;
        colour = requiredColour;
    } // Ball

    // Returns the numeric value of the ball.
    public int getValue()
    {
        return value;
    } // getValue

    // Returns the colour of the ball.
    public int getColour()
    {
        return value;
    } // getColour

    // Compares this ball's value with another, returning
    // < 0 if this ball's value is smaller than the other's,
    // > 0 if it is greater, or if the values are equal then
    // compare the RGB numbers of the colours instead.
    public int compareTo(Ball other)
    {
        if (value == other.value)
            return colour.getRGB() - other.colour.getRGB();
        else
            return value - other.value;
    } // compareTo

    // Return true if and only if this and other have the same value and color.
    @Override
    public boolean equals(Object other)
    {
        if(other instanceof Ball)
            return compareTo((Ball) other) == 0;
        else
            return super.equals(other);
    } // equals

    // Mainly for testing.
    @Override
    public String toString()
    {
        return "Ball " + value + " " + colour;
    } // toString

    // Return int hash value of this ball.
    // Implementation is consistent only partially as it only considers
    // first condition of the compareTo method - value.
    public int hashcode()
    {
        int base = 47;
        return (base * value) % 43;
    } // hashcode

} // class Ball
