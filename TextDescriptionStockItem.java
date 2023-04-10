// Representation of Stock Item with custom text description.
public abstract class TextDescriptionStockItem extends StockItem
{

    // Description of the stock item.
    private String description;
    public TextDescriptionStockItem(String description, int initialPriceExVat, int initialQuantityInStock)
    {
        super(initialPriceExVat,initialQuantityInStock);
        this.description = description;

    } // TextDescriptionStockItem

    // Return description of this stock item.
    public String getDescription()
    {
        return description;
    } // getDescription

    // Set description of this stock item to given input.
    public void setDescription(String description)
    {
        this.description = description;
    } //setDescription

} //  class TextDescriptionStockItem
