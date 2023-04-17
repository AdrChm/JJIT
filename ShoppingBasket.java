
public class ShoppingBasket
{
    // Initial size of the shopping basket.
    private final int INITIAL_ARRAY_SIZE = 10;

    // Shopping basket multiplication factor.
    private final int ARRAY_MULTIPLICATION_FACTOR = 2;

    // Number of stock items in the shopping basket.
    // Also represents first free array index.
    private int numberOfStockItems = 0;

    // List of StockItemPurchaseRequest
    private final StockItemPurchaseRequest [] shoppingBasket;

    public ShoppingBasket()
    {
        shoppingBasket = new StockItemPurchaseRequest[INITIAL_ARRAY_SIZE];
    } // ShoppingBasket

    public void add(StockItemPurchaseRequest (StockItem item, int quantity))
    {
        // When shoppingBasket is full.
        if(numberOfStockItems == shoppingBasket.length)
            extendShoppingBasket();
        else
        {
            shoppingBasket[numberOfStockItems] = new StockItemPurchaseRequest(item, quantity);
            numberOfStockItems++;
        } // else
    } // add

    // Shopping basket extension.
    private void extendShoppingBasket()
    {
        StockItemPurchaseRequest [] newArray =
                StockItemPurchaseRequest [shoppingBasket.length * ARRAY_MULTIPLICATION_FACTOR];
        for (int index = 0; index < shoppingBasket.length; index++)
            newArray[index] = shoppingBasket[index];

        shoppingBasket = newArray;

    } // extendShoppingBasket

    // Go through shopping basket and sell each item.
    public String checkout()
    {
        StringBuilder sellReport = new StringBuilder();
        for (StockItemPurchaseRequest item: shoppingBasket)
        {
            sellReport.append(item.getStockItem().sell(item.getRequestedQuantity()));
        } // for

        return sellReport.toString();

    } // checkout

    // Mainly for testing.
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        for (StockItemPurchaseRequest item: shoppingBasket)
        {
            result.append(item);
            result.append("\n");
        } // for
            return result.toString();
    } // toString

} // class ShoppingBasket
