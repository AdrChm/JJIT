// Representation of a reliable hard disc.
public class ReliableHardDisc extends HardDisc
{
    // Number of years the disc guarantees to work properly.
    private int guaranteedYears;

    // Constructor method.
    public ReliableHardDisc(int initialPriceExVat, int initialQuantityInStock, int size, int guaranteedYears) {
        super(initialPriceExVat, initialQuantityInStock, size);
        this.guaranteedYears = guaranteedYears;
    } // ReliableHardDisc

    // Return description of this ReliableHardDisc.
    public String getDescription()
    {
        return super.getDescription() + ", guaranteed " + guaranteedYears + " years";
    } // getDescription

}
