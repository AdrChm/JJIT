// Exception to be used in LineNumber class.
public class LineNumberException extends Exception
{
    // Create LineNumberException with no message and no cause.
    public LineNumberException()
    {
        super();
    } // LineNumberException

    // Create LineNumberException with message, but no cause.
    public LineNumberException(String message)
    {
        super(message);
    } // LineNumberException

    // Create LineNumberException with message and cause.
    public LineNumberException(String message, Throwable cause)
    {
        super(message, cause);
    } // LineNumberException

    // Create LineNumberException with no message, but with cause.
    public LineNumberException(Throwable cause)
    {
        super(cause);
    } // LineNumberException

} // class LineNumberException
