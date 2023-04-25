// Exception to be used in DeleteField class.
public class DeleteFieldException extends Exception
{
    // Create LineNumberException with no message and no cause.
    public DeleteFieldException()
    {
        super();
    } // DeleteFieldException

    // Create LineNumberException with message, but no cause.
    public DeleteFieldException(String message)
    {
        super(message);
    } // DeleteFieldException

    // Create LineNumberException with message and cause.
    public DeleteFieldException(String message, Throwable cause)
    {
        super(message, cause);
    } // DeleteFieldException

    // Create LineNumberException with no message, but with cause.
    public DeleteFieldException(Throwable cause)
    {
        super(cause);
    } // DeleteFieldException

} // class DeleteFieldException
