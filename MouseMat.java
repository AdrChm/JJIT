// Representation of a mouse mat.
public class MouseMat extends StockItem
{
    // Constructor supplying StockItem superclass.
    public MouseMat(String description, int initialPriceExVat, int initialQuantityInStock, Vendor vendor)
    {
        super(description, initialPriceExVat, initialQuantityInStock, vendor);
        System.out.println("MouseMat");
    } // MouseMat

    @Override
    // Return type of this mouse mat.
    public String getStockItemType()
    {
        return "Mouse Mat";
    } // getStockCode

} // class MouseMat
