// Exceptions to be used with the GreedyChild class
public class GreedyChildException extends RuntimeException
{
    // Create GreedyChildException with no message and no cause.
    public GreedyChildException()
    {
        super();
    } // GreedyChildException

    // Create GreedyChildException with message, but no cause.
    public GreedyChildException(String message)
    {
        super(message);
    } // GreedyChildException

    // Create GreedyChildException with message and cause.
    public GreedyChildException(String message, Throwable cause)
    {
        super(message, cause);
    } // GreedyChildException

    // Create GreedyChildException with no message, but with cause.
    public GreedyChildException(Throwable cause)
    {
        super(cause);
    } // GreedyChildException

} // class GreedyChildException
