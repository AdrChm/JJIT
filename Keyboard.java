import java.awt.Color;

// Representation of a keyboard.
public class Keyboard extends StockItem
{
    // Keyboard color of this keyboard.
    private Color color;

    // Number of keys of this keyboard.
    private int noOfKeys;

    // Special features of this keyboard.
    private String specialFeatures;

    // Constructor supplying StockItem superclass.
    public Keyboard(int initialPriceExVat, int initialQuantityInStock,
                    Color color, int noOfKeys, String specialFeatures, Vendor vendor)
    {
        super("Cream, non-click", initialPriceExVat, initialQuantityInStock, vendor);
        this.color = color;
        this.noOfKeys = noOfKeys;
        this.specialFeatures = specialFeatures;
    } // MouseMat

    // Return type of this keyboard.
    public String getStockItemType()
    {
        return "Keyboard";
    } // getStockCode

    // Return description of this keyboard.
    public String getDescription()
    {
        return super.getDescription() + ", " + color + ", " + noOfKeys
                                    + " keys, special features: " + specialFeatures;
    } // getDescription

} // class Keyboard