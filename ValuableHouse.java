// representation of a Valuable which is a house.
public class ValuableHouse extends House implements Valuable
{
    // A measure of the value of the area the house is in.
    private double locationDesirabilityIndex;

    // Construct a ValuableHouse with a given number of bedrooms
    // and a location desirability.
    public ValuableHouse(int requiredNoOfBedrooms, double requiredLocationDesirabilityIndex)
    {
        super(requiredNoOfBedrooms);
        locationDesirabilityIndex = requiredLocationDesirabilityIndex;
    } // ValuableHouse

    // Calculate and return the value of this valuable item.
    @Override
    public int value()
    {
        return (int) (getNoOfBedrooms() * 50000 * locationDesirabilityIndex);
    } // value

    // Return a short description of this as a valuable item.
    @Override
    public String toString()
    {
        return "House worth " + value();
    } // toString

} // class ValuableHouse
