
public class StockItemPurchaseRequest
{
    // Requested stock item.
    private StockItem stockItem;

    // Amount of requested stock item.
    private int requestedQuantity;

    // Constructor.
    public StockItemPurchaseRequest(StockItem stockItem, int requestedQuantity)
    {
        this.stockItem = stockItem;
        this.requestedQuantity = requestedQuantity;
    } // StockItemPurchaseRequest

    // Returns the requested stock item.
    public StockItem getStockItem()
    {
        return stockItem;
    } // getStockItem

    // Returns the requested quantity of the stock item.
    public int getRequestedQuantity()
    {
        return requestedQuantity;
    } //getRequestedQuantity

    @Override
    // Mainly for testing.
    public String toString()
    {
        return requestedQuantity + " of " + stockItem;
    } // toString


} // class StockItemPurchaseRequest
