// Representation of a keyboard.
public class Keyboard extends StockItem
{
    // Constructor supplying StockItem superclass.
    public Keyboard(int initialPriceExVat, int initialQuantityInStock)
    {
        super("Cream, non-click", initialPriceExVat, initialQuantityInStock);
    } // MouseMat

    // Return type of this keyboard.
    public String getStockItemType()
    {
        return "Keyboard";
    } // getStockCode

} // class Keyboard