// Representation of a CPU.
public class CPU extends StockItem
{
    // Constructor supplying StockItem superclass.
    public CPU(int initialPriceExVat, int initialQuantityInStock)
    {
        super("Really fast", initialPriceExVat, initialQuantityInStock);
    } // MouseMat

    // Return type of this CPU.
    public String getStockItemType()
    {
        return "CPU";
    } // getStockCode

} // class CPU