// Representation of a car.
public class Car extends Vehicle
{
    // The number of doors on the car.
    private final int noOfDoors;

    // Construct a car with a given number of doors.
    public Car(int requiredNoOfDoors)
    {
        noOfDoors = requiredNoOfDoors;
    } // Car

    // Return the number of doors on the car.
    public int getNoOfDoors()
    {
        return noOfDoors;
    } // getNoOfDoors

    // ... Lots of stuff here specific to a car.

} // class Car
