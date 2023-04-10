// Representation of a hard disc.
public class HardDisc extends StockItem
{
    // Constructor supplying StockItem superclass.
    public HardDisc(int initialPriceExVat, int initialQuantityInStock)
    {
        super(initialPriceExVat, initialQuantityInStock);
    } // MouseMat

    // Return type of this HardDisc.
    public String getStockItemType()
    {
        return "Hard disc";
    } // getStockCode

    // Return description of this HardDisc.
    public String getStockItemDescription()
    {
        return "Lots of space";
    } // getStockItemDescription

} // class HardDisc