// Exceptions to be used with the Machine class.
public class MachineException extends BallContainerException
{
    // Create MachineException with no message and no cause.
    public MachineException()
    {
        super();
    } // MachineException

    // Create MachineException with message, but no cause.
    public MachineException(String message)
    {
        super(message);
    } // MachineException

    // Create MachineException with message and cause.
    public MachineException(String message, Throwable cause)
    {
        super(message, cause);
    } // MachineException

    // Create MachineException with no message, but with cause.
    public MachineException(Throwable cause)
    {
        super(cause);
    } // MachineException

} // class MachineException
