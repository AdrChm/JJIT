// Representation of catalogue.
public class Catalogue extends StockItem

{    // Constructor supplying StockItem superclass.
    public Catalogue(int initialPriceExVat, int initialQuantityInStock)
    {
        super(initialPriceExVat, initialQuantityInStock);
    }

    // Return type of this catalogue.
    public String getStockItemType()
    {
        return "Catalogue";
    } // getStockCode

    // Return description of this catalogue.
    public String getStockItemDescription()
    {
        return "List of all items and prices";
    } // getStockItemDescription

    // Returns the percentage VAT rate of the catalogue.
    public double getVatRate()
    {
        return 0;
    } // getVatRate

} // class Catalogue
