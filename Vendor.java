// Representation of a vendor of stock item.
public class Vendor
{
    // Name of the Vendor
    private String name;

    // Employer Identification Number of this Vendor
    private final String EIN;

    // Vendor address
    private String address;

    // Constructor.
    public Vendor(String name, String ein, String address)
    {
        this.name = name;
        EIN = ein;
        this.address = address;
    } // Vendor

    // Returns the name of the vendor.
    public String getName()
    {
        return name;
    } // getName

    // Returns Employer Identification Number of this Vendor.
    public String getEIN()
    {
        return EIN;
    } // getEIN

    // Returns the address of the vendor.
    public String getAddress()
    {
        return address;
    } // getAddress

    // Mostly for testing.
    public String toString()
    {
        return "Vendor: " + name + ", EIN " + EIN +
                ", address '" + address + ", ";
    } // toString

} // class Vendor
