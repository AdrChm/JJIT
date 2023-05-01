import java.util.Collections;
public class DeliveryHouseDetails implements Comparable<DeliveryHouseDetails>
{
    // Address house number
    private final int houseNumber;

    // Delivery details.
    private String deliveryDetails;

    // Constructor method.
    public DeliveryHouseDetails(int houseNumber, String deliveryDetails)
    {
        this.houseNumber = houseNumber;
        this.deliveryDetails = deliveryDetails;
    } // DeliveryHouseDetails

    // Returns address number of the house.
    public int getHouseNumber()
    {
        return houseNumber;
    } // getHouseNumber

    // Returns home address and name of the person in the house
    public String getDeliveryDetails()
    {
        return deliveryDetails;
    } // getDeliveryDetails

    // Returns int value representing comparison of this house delivery
    // with the other according to the requirements.
    @Override
    public int compareTo(DeliveryHouseDetails other) {
        System.out.print("c " + houseNumber + "," + other.houseNumber);
        // Both house numbers are odd.
        if (houseNumber % 2 == 1 && other.houseNumber % 2 == 1)
        {
            System.out.println(" both odd " + (houseNumber - other.houseNumber));
            return houseNumber - other.houseNumber;
        }
        // Both house numbers are even.
        else if (houseNumber % 2 == 0 && other.houseNumber % 2 == 0)
        {
            System.out.println(" both even " + (houseNumber - other.houseNumber));
            return other.houseNumber - houseNumber;
        }// This house numbers is odd.
        else if (houseNumber % 2 == 1)
        {
            System.out.println(" odd " + -1);
            return -1;
        }// This house numbers is even.
        else
        {
            System.out.println(" even " + 1);
            return 1;
        }
    } // compareTo

    // Equivalence test, consistent with compareTo.
    @Override
    public boolean equals(Object other)
    {
        if (other instanceof DeliveryHouseDetails)
            return houseNumber == ((DeliveryHouseDetails) other).houseNumber;
        else
            return super.equals(other);
    } // equals


} // class DeliveryHouseDetails
