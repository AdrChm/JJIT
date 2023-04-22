// Exceptions to be used with the BallContainer class.
public class BallContainerException extends Exception
{
    // Create BallContainerException with no message and no cause.
    public BallContainerException()
    {
        super();
    } // BallContainerException

    // Create BallContainerException with message, but no cause.
    public BallContainerException(String message)
    {
        super(message);
    } // BallContainerException

    // Create BallContainerException with message and cause.
    public BallContainerException(String message, Throwable cause)
    {
        super(message, cause);
    } // BallContainerException

    // Create BallContainerException with no message, but with cause.
    public BallContainerException(Throwable cause)
    {
        super(cause);
    } // BallContainerException

} // class BallContainerException
