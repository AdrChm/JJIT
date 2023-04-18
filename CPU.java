// Representation of a CPU.
public class CPU extends StockItem
{
    // Description of CPU architecture.
    private String architecture;

    // CPU clock speed in GHz.
    private double GHzClockSpeed;

    // Constructor supplying StockItem superclass.
    public CPU(int initialPriceExVat, int initialQuantityInStock, double GHzClockSpeed, String architecture)
    {
        super("Really fast", initialPriceExVat, initialQuantityInStock);
        this.GHzClockSpeed = GHzClockSpeed;
        this.architecture = architecture;
    } // MouseMat

    // Return type of this CPU.
    public String getStockItemType()
    {
        return "CPU";
    } // getStockCode

    // Return description of this CPU.
    public String getDescription()
    {
        return super.getDescription() + ", " + GHzClockSpeed + " GHz, " + architecture + " architecture";
    } // getDescription

} // class CPU