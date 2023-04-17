
public class StockItemPurchaseRequest
{
    // Requested stock item.
    private StockItem stockItem;

    // Amount of requested stock item.
    private int requestedQuantity;

    public StockItemPurchaseRequest(StockItem stockItem, int requestedQuantity)
    {
        this.stockItem = stockItem;
        this.requestedQuantity = requestedQuantity;
    } // StockItemPurchaseRequest

    public StockItem getStockItem()
    {
        return stockItem;
    } // getStockItem

    public int getRequestedQuantity()
    {
        return requestedQuantity;
    } //getRequestedQuantity
} // class StockItemPurchaseRequest
