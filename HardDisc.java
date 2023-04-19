// Representation of a hard disc.
public class HardDisc extends StockItem
{
    // Capacity of the hard disc in GB.
    private int GBCapacity;

    // Psychical size of hard disc in inches.
    private double inchSize;

    // Rotation speed of hard disc in revolutions per minute.
    private int RPMspeed;

    // Cache size of this hard disc in MB
    private int MBCacheSize;

    // Constructor supplying StockItem superclass.
    public HardDisc(int initialPriceExVat, int initialQuantityInStock, int size,
                    double inchSize, int RPMspeed, int MBCacheSize, Vendor vendor)
    {
        super("Lots of space", initialPriceExVat, initialQuantityInStock, vendor);
        GBCapacity = size;
        this.inchSize = inchSize;
        this.RPMspeed = RPMspeed;
        this.MBCacheSize = MBCacheSize;
        this.setDescription(GBCapacity + "GB of space");
        System.out.println("HardDisc");

    } // MouseMat

    // Return type of this HardDisc.
    public String getStockItemType()
    {
        return "Hard disc";
    } // getStockCode

    // Return description of this HardDisc.
    public String getDescription()
    {
        return super.getDescription() + ", " + inchSize + " inch, " + GBCapacity + "GB of space, "
                                    + MBCacheSize + "MB of cache memory, " + RPMspeed + " RPMs";

    } // getDescription

} // class HardDisc