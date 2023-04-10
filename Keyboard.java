// Representation of a keyboard.
public class Keyboard extends StockItem
{
    // Constructor supplying StockItem superclass.
    public Keyboard(int initialPriceExVat, int initialQuantityInStock)
    {
        super(initialPriceExVat, initialQuantityInStock);
    } // MouseMat

    // Return type of this keyboard.
    public String getStockItemType()
    {
        return "Keyboard";
    } // getStockCode

    // Return description of this keyboard.
    public String getStockItemDescription()
    {
        return "Cream, non-click";
    } // getStockItemDescription

} // class Keyboard