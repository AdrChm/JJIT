// representation of a Valuable which is a car.
public class ValuableCar extends Car implements Valuable, Comparable<Valuable>
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

    // Return negative if this value is greater than other's value,
    // zero if they are the same, or positive if this value is lesser.
    @Override
    public int compareTo(Valuable other)
    {
        return other.value() - value();
    } // compareTo

    // Return true if and only if this and other have the same value.
    // Unless other is not a Valuable, in which case delegate to superclass.
    @Override
    public boolean equals(Object other)
    {
        if(other instanceof Valuable)
            return compareTo((Valuable) other) == 0;
        else
            return super.equals(other);
    } // equals

} // class ValuableCar
