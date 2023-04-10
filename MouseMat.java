// Representation of a mouse mat.
public class MouseMat extends StockItem
{
    // Constructor supplying StockItem superclass.
    public MouseMat(int initialPriceExVat, int initialQuantityInStock)
    {
        super(initialPriceExVat, initialQuantityInStock);
    } // MouseMat

    // Return type of this mouse mat.
    public String getStockItemType()
    {
        return "Mouse Mat";
    } // getStockCode

    // Return description of this mouse mat.
    public String getStockItemDescription()
    {
        return "Plain, blue cloth, foam backed";
    } // getStockItemDescription
} // class MouseMat
