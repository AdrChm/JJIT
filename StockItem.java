// representation of a stock item.
public class StockItem {

    // Stock item type.
    private String stockItemType = "Stock item type";

    // Stock item description.
    private String stockItemDescription = "A description of the stock item";

    // Price of this stock item in whole pence, before VAT tax.
    private int priceExVat;

    // VAT tax rate of this stock item.
    private double vatRate = 20.0;

    // Current amount of item in the stock.
    private int quantityInStock;

    // The number of stock items created so far.
    private static int numberOfItemsCreated = 0;

    // The fixed stock code of this item.
    private final int stockCode;

    public StockItem(int initialPriceExVat, int initialQuantityInStock)
    {
        numberOfItemsCreated++;
        stockCode = numberOfItemsCreated;

        quantityInStock = initialQuantityInStock;
        priceExVat = initialPriceExVat;
    } // StockItem

    // Return the code of this stock item.
    public int getStockCode()
    {
        return stockCode;
    } // getStockCode

    // Return type of this stock item.
    public String getStockItemType()
    {
        return stockItemType;
    } // getStockCode

    // Return description of this stock item.
    public String getStockItemDescription()
    {
        return stockItemDescription;
    } // getStockItemDescription

    // Return the quantity in stock of the stock item.
    public int getQuantityInStock()
    {
        return quantityInStock;
    } // getQuantityInStock

    // Increases the stock level the by the given amount.
    public void increaseStock(int amount)
    {
        if(amount < 1)
            throw new IllegalArgumentException("This amount cannot increase the stock.");
        else
            quantityInStock += amount;

    } // increaseStock

    // Attempt to reduce the stock level the by the given amount.
    public boolean sellStock(int amount)
    {
        if(amount < 1)
            throw new IllegalArgumentException("This amount cannot be sold.");

        if (amount > quantityInStock)
            return false;
        else
            quantityInStock -= amount;

        return true;

    } // sellStock

    // Sets the price of this item to the given int.
    public void setPriceExVat(int newPrice)
    {
        priceExVat = newPrice;
    } // setPriceExVat

    // Returns the price before VAT.
    public int getPriceExVat()
    {
        return priceExVat;
    } // getPriceExVat

    // Returns the standard percentage VAT rate of the stock item.
    public double getVatRate()
    {
        return vatRate;
    } // getVatRate

    // Returns the price including VAT rounded to the nearest penny.
    public int getPriceIncVat()
    {
        return (int) Math.round(priceExVat * (1 + getVatRate()/100));
    } // getPriceIncVat

    // String representation of the stock item.
    public String toString()
    {
        return "SC" + stockCode + ": "
               + getStockItemType() + ", "
               + getStockItemDescription() + " ("
               + getQuantityInStock() + " @ "
               + getPriceExVat() + "p/"
               + getPriceIncVat() + "p)";
    } // toString
}// class StockItem
