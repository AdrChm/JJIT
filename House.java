// Representation of a house.
public class House extends Building
{
    // THe number of bedrooms in the house.
    private int noOfBedrooms;

    // Construct a house with a given number of bedrooms.
    public House(int requiredNoOfBedrooms)
    {
        noOfBedrooms = requiredNoOfBedrooms;
    } // House

    // Return the number of bedrooms in the house.
    public int getNoOfBedrooms()
    {
        return noOfBedrooms;
    } // getNoOfBedrooms

    // ... Lots of stuff here specific to a house.

} // class House
