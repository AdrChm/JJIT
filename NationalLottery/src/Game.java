// representation of a lottery game, comprising a machine and a rack.
public class Game
{
    // The machine for the game.
    private final Machine machine;

    // The rack for the game.
    private final Rack rack;

    // Constructor takes name and size of the machine, and the rack.
    public Game(String machineName, int machineSize,
                String rackName, int rackSize)
    {
        machine = new Machine(machineName, machineSize);
        rack = new Rack(rackName, rackSize);
    } // Game

    // Return the size of the machine.
    public int getMachineSize()
    {
        return machine.getSize();
    } // getMachineSize

    // Return the size of the rack.
    public int getRackSize()
    {
        return rack.getSize();
    } // getRackSize

    // Return the number of balls in the rack.
    public int getRackNoOfBalls(Ball ball)
    {
        return rack.getNoOfBalls();
    } // getRackNoOfBalls

    // Add a ball into the machine.
    public void machineAddBall(Ball ball)
    {
        machine.addBall(ball);
    } // machineAddBall

    // Eject a ball from the machine into the rack.
    // Also return the rejected Ball.
    public Ball ejectBall()
    {
        if(machine.getNoOfBalls() > 0
            && rack.getNoOfBalls() < rack.getSize())
        {
            Ball ejectedBall = machine.ejectBall();
            rack.addBall(ejectedBall);
            return ejectedBall;
        } // if
        else
            return null;
    } // ejectBall

    // Returns true if and only if the rack contains
    // a Ball with the given number.
    public boolean rackContains(int value)
    {
        return rack.contains(value);
    } // rackContains

    // Sorts the ball in the rack into ascending order.
    public void rackSortBalls()
    {
        rack.sortBalls();
    } // rackSortBalls

    // Mainly for testing.
    public String toString()
    {
        return String.format("%s%n%s", machine, rack);
    } // toString

} // class Game