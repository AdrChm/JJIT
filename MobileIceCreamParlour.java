// An IceCreamParlour with the additional feature of needing to use fuel.
public class MobileIceCreamParlour extends IceCreamParlour
{
    // The amount of fuel in the tank.
    private double fuelLeft = 0;

    // Constructor a mobile ice cream parlour -- given required name.
    public MobileIceCreamParlour(String name) throws MobileIceCreamParlourException
    {
        super(name);
    } // MobileIceCreamParlour

    // Put fuel in the tank.
    public void obtainFuel(double amount) throws MobileIceCreamParlourException
    {
        if(amount <= 0)
            throw new MobileIceCreamParlourException("Can't supply fuel with given amount: " + amount);
        fuelLeft += amount;
    } // obtainFuel

    // Use some fuel by driving.
    public void drive(double desiredFuelUsed) throws MobileIceCreamParlourException
    {
        if(desiredFuelUsed <= 0)
            throw new MobileIceCreamParlourException("Can't use given amount of fuel: " + desiredFuelUsed);

        double fuelUsed = desiredFuelUsed <= fuelLeft ? desiredFuelUsed : fuelLeft;
        fuelLeft -= fuelUsed;
    } // drive

    // Return a String giving the name and state.
    @Override
    public String toString()
    {
        return super.toString() + "[fuel " + fuelLeft + "]";
    } // toString

} // class MobileIceCreamParlour