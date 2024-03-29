// Representation of a CPU.
public class CPU extends StockItem
{
    // Description of CPU architecture.
    private String architecture;

    // CPU clock speed in GHz.
    private double GHzClockSpeed;

    // Constructor supplying StockItem superclass.
    public CPU(int initialPriceExVat, int initialQuantityInStock, double GHzClockSpeed,
               String architecture, Vendor vendor)
    {
        super("Really fast", initialPriceExVat, initialQuantityInStock, vendor);
        this.GHzClockSpeed = GHzClockSpeed;
        this.architecture = architecture;
        System.out.println("CPU");
    } // MouseMat

    @Override
    // Return type of this CPU.
    public String getStockItemType()
    {
        return "CPU";
    } // getStockCode

    @Override
    // Return description of this CPU.
    public String getDescription()
    {
        return super.getDescription() + ", " + GHzClockSpeed + " GHz, " + architecture + " architecture";
    } // getDescription

} // class CPU