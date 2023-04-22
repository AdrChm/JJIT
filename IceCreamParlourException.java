// Exceptions to be used with the IceCreamParlour class
public class IceCreamParlourException extends RuntimeException
{
    // Create GreedyChildException with no message and no cause.
    public IceCreamParlourException()
    {
        super();
    } // IceCreamParlourException

    // Create IceCreamParlourException with message, but no cause.
    public IceCreamParlourException(String message)
    {
        super(message);
    } // IceCreamParlourException

    // Create IceCreamParlourException with message and cause.
    public IceCreamParlourException(String message, Throwable cause)
    {
        super(message, cause);
    } // IceCreamParlourException

    // Create IceCreamParlourException with no message, but with cause.
    public IceCreamParlourException(Throwable cause)
    {
        super(cause);
    } // IceCreamParlourException

} // IceCreamParlourException
