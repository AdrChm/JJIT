// Representation of a reliable hard disc.
public class ReliableHardDisc extends HardDisc
{
    // Number of years the disc guarantees to work properly.
    private int guaranteedYears;

    // Constructor method.
    public ReliableHardDisc(int initialPriceExVat, int initialQuantityInStock, int size, int guaranteedYears,
                            double inchSize, int RPMspeed, int MBCacheSize, Vendor vendor)
    {
        super(initialPriceExVat, initialQuantityInStock, size, inchSize, RPMspeed, MBCacheSize, vendor);
        this.guaranteedYears = guaranteedYears;
        System.out.println("ReliableHardDisc");
    } // ReliableHardDisc

    @Override
    // Return description of this ReliableHardDisc.
    public String getDescription()
    {
        return super.getDescription() + ", guaranteed " + guaranteedYears + " years";
    } // getDescription

} // ReliableHardDisc
