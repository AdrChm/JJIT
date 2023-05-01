// representation of a Valuable which is a car.
public class ValuableCar extends Car implements Valuable, Comparable
{
    // A measure of the value of the car in general.
    private double streetCredibilityIndex;

    // Construct a ValuableCar with a given number of doors
    // and general desirability.
    public ValuableCar(int requiredNoOfDoors, double requiredStreetCredibilityIndex)
    {
        super(requiredNoOfDoors);
        streetCredibilityIndex = requiredStreetCredibilityIndex;
    } // ValuableCar

    // Calculate and return the value of this valuable item.
    @Override
    public int value()
    {
        return (int) (getNoOfDoors() * 2000 * streetCredibilityIndex);
    } // value

    // Return a short description of this as a valuable item.
    @Override
    public String toString()
    {
        return "Car worth " + value();
    } // toString

    @Override
    public int compareTo(Object o)
    {
        ValuableCar other = (ValuableCar) o;

        if(value() == other.value())
            if (getNoOfDoors() == other.getNoOfDoors())
                return 0;
            else
                return getNoOfDoors() - other.getNoOfDoors();

        return (value() - other.value());
    } // compareTo

} // class ValuableCar
