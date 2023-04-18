// Representation of a hard disc.
public class HardDisc extends StockItem
{
    // Capacity of the hard disc in GB.
    private int GBCapacity;
    // Constructor supplying StockItem superclass.
    public HardDisc(int initialPriceExVat, int initialQuantityInStock, int size)
    {
        super(initialPriceExVat, initialQuantityInStock);
        GBCapacity = size;
    } // MouseMat

    // Return type of this HardDisc.
    public String getStockItemType()
    {
        return "Hard disc";
    } // getStockCode

    // Return description of this HardDisc.
    public String getDescription()
    {
        return GBCapacity + "GB of space";
    } // getStockItemDescription

} // class HardDisc