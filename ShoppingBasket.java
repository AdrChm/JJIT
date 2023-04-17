import javax.swing.*;

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
    private StockItemPurchaseRequest [] shoppingBasket;

    public ShoppingBasket()
    {
        shoppingBasket = new StockItemPurchaseRequest[INITIAL_ARRAY_SIZE];
    } // ShoppingBasket

    public void add(StockItem item, int quantity)
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
                new StockItemPurchaseRequest [shoppingBasket.length * ARRAY_MULTIPLICATION_FACTOR];
        for (int index = 0; index < shoppingBasket.length; index++)
            newArray[index] = shoppingBasket[index];

        shoppingBasket = newArray;

    } // extendShoppingBasket

    // Go through shopping basket and sell each item.
    public String checkout()
    {
        StringBuilder sellReport = new StringBuilder();
        for (int index = 0; index < numberOfStockItems; index++)
        {
            if(shoppingBasket[index].getStockItem().sellStock(shoppingBasket[index].getRequestedQuantity()))
            {
                sellReport.append("Purchased ");
                shoppingBasket[index] = null;
            } // if
            else
                sellReport.append("Not purchased ");

            sellReport.append(shoppingBasket[index]).append("\n");
        } // for
        cleanList();
        return sellReport.toString();

    } // checkout

    // Mainly for testing.
    public String toString()
    {

        StringBuilder result = new StringBuilder();
        for (int index = 0; index < numberOfStockItems; index++)
        {
            result.append(shoppingBasket[index]);
            result.append("\n");

        } // for
        return result.toString();

    } // toString

    // Helper method to remove purchased items (null) from the shopping basket.
    private void cleanList()
    {
        boolean isChanged = false;

        do
        {
            isChanged = false;
            for (int index = 0; index < numberOfStockItems; index++)
            {
                if (shoppingBasket[index] == null)
                {
                    numberOfStockItems--;
                    shoppingBasket[index] = shoppingBasket[numberOfStockItems];
                    shoppingBasket[numberOfStockItems] = null;
                    isChanged = true;
                }
            } // for
        }while(isChanged);

    } // cleanList

} // class ShoppingBasket
