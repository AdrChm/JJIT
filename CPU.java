// Representation of a CPU.
public class CPU extends StockItem
{
    // Constructor supplying StockItem superclass.
    public CPU(int initialPriceExVat, int initialQuantityInStock)
    {
        super(initialPriceExVat, initialQuantityInStock);
    } // MouseMat

    // Return type of this CPU.
    public String getStockItemType()
    {
        return "CPU";
    } // getStockCode

    // Return description of this CPU.
    public String getDescription()
    {
        return "Really fast";
    } // getStockItemDescription

} // class CPU