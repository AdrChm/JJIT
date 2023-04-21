// Exceptions to be used with the MobileIceCreamParlour class
public class MobileIceCreamParlourException extends IceCreamParlourException
{
    // Create MobileIceCreamParlourException with no message and no cause.
    public MobileIceCreamParlourException()
    {
        super();
    } // MobileIceCreamParlourException

    // Create MobileIceCreamParlourException with message, but no cause.
    public MobileIceCreamParlourException(String message)
    {
        super(message);
    } // MobileIceCreamParlourException

    // Create MobileIceCreamParlourException with message and cause.
    public MobileIceCreamParlourException(String message, Throwable cause)
    {
        super(message, cause);
    } // MobileIceCreamParlourException

    // Create MobileIceCreamParlourException with no message, but with cause.
    public MobileIceCreamParlourException(Throwable cause)
    {
        super(cause);
    } // MobileIceCreamParlourException

} // class MobileIceCreamParlourException
