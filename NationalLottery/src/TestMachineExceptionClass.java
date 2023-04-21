import java.awt.Color;

/* For testing BallContainer and Machine with BallContainerException and
   MachineException. Depending on the values given, it will produce exceptions
   at different points, which we catch and print out. By running it with
   different values, we are able to test every possible throw statement in
   BallContainer and Machine.
 */
public class TestMachineExceptionClass
{
    public static void main(String[] args)
    {
        int machineSize = Integer.parseInt(args[0]);
        int fillCount = Integer.parseInt(args[1]);
        int fillIndex = Integer.parseInt(args[2]);
        int removeCount1 = Integer.parseInt(args[3]);
        int swapIndex1 = Integer.parseInt(args[4]);
        int swapIndex2 = Integer.parseInt(args[5]);
        int removeCount2 = Integer.parseInt(args[6]);
        int ejectCount = Integer.parseInt(args[7]);

        try
        {
            System.out.println("Creating machine sized " + machineSize);
            Machine machine = new Machine("Test4U", machineSize);

            System.out.println("Filling with " + fillCount + " balls");
            for (int i = 1; i <= fillCount; i++)
                machine.addBall(new Ball(i, Color.red));

            System.out.println("Finding ball at " + fillIndex);
            machine.getBall(fillIndex);

            System.out.println("Adding another ball");
            machine.addBall(new Ball(fillCount + 1, Color.red));

            System.out.println("Removing " + removeCount1 + " balls");
            for (int i = 1; i <= removeCount1; i++)
                machine.removeBall();

            System.out.println("Swapping balls at " + swapIndex1
                                + " and " + swapIndex2);
            machine.swapBalls(swapIndex1, swapIndex2);

            System.out.println("Removing " + removeCount2 + " balls");
            for (int i = 1; i <= removeCount2; i++)
                machine.removeBall();

            System.out.println("Eject " + ejectCount + " balls");
            for (int i = 1; i <= ejectCount ; i++)
                machine.ejectBall();

        } // try
        catch (Exception exception)
        {
            System.out.println("Got exception " + exception);
            if(exception.getCause() != null)
                System.out.println("Caused by: " + exception.getCause());
        } // catch
    } // main
} // class TestMachineExceptionClass
