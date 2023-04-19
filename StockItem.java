// Representation of a stock item.
public abstract class StockItem
{

    // Description of the stock item.
    private String description = "";

    // Vendor of this stock item.
    private Vendor vendor;

    // Price of this stock item in whole pence, before VAT tax.
    private int priceExVat;

    // VAT tax rate of this stock item.
    private double vatRate = 17.5;

    // Current amount of item in the stock.
    private int quantityInStock;

    // The number of stock items created so far.
    private static int numberOfItemsCreated = 0;

    // The fixed stock code of this item.
    private final int stockCode;

    // Constructor without description.
    public StockItem(int initialPriceExVat, int initialQuantityInStock, Vendor vendor)
    {
        numberOfItemsCreated++;
        stockCode = numberOfItemsCreated;

        quantityInStock = initialQuantityInStock;
        priceExVat = initialPriceExVat;
        this.vendor = vendor;
        System.out.println("StockItem");
    } // StockItem

    // Constructor with description.
    public StockItem(String description, int initialPriceExVat, int initialQuantityInStock, Vendor vendor)
    {
        numberOfItemsCreated++;
        stockCode = numberOfItemsCreated;

        quantityInStock = initialQuantityInStock;
        priceExVat = initialPriceExVat;
        this.description = description;
        this.vendor = vendor;
        System.out.println("StockItem");
    } // StockItem

    // Return the code of this stock item.
    public int getStockCode()
    {
        return stockCode;
    } // getStockCode

    // Return type of this stock item.
    public abstract String getStockItemType();

    // Return description of this stock item.
    public String getDescription()
    {
        return description;
    }

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

    // Set description of this stock item to given input.
    public void setDescription(String description)
    {
        this.description = description;
    } //setDescription

    // String representation of the stock item.
    public String toString()
    {
        return "SC" + stockCode + ": "
               + vendor.getName() + " "
               + getStockItemType() + ", "
               + getDescription() + " ("
               + getQuantityInStock() + " @ "
               + getPriceExVat() + "p/"
               + getPriceIncVat() + "p)";
    } // toString

} // class StockItem