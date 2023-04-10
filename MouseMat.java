// Representation of a mouse mat.
public class MouseMat extends TextDescriptionStockItem
{
    // Constructor supplying TextDescriptionStockItem superclass.
    public MouseMat(String description, int initialPriceExVat, int initialQuantityInStock)
    {
        super(description, initialPriceExVat, initialQuantityInStock);
    } // MouseMat

    // Return type of this mouse mat.
    public String getStockItemType()
    {
        return "Mouse Mat";
    } // getStockCode

} // class MouseMat
