// Representation of a book.
public class Book extends StockItem
{
    // Constructor supplying StockItem superclass.
    public Book(String title, int initialPriceExVat, int initialQuantityInStock, Vendor vendor)
    {
        super(title,initialPriceExVat, initialQuantityInStock, vendor);
    } // Book

    // Return type of this book.
    public String getStockItemType()
    {
        return "Book";
    } // getStockCode

    // Returns the percentage VAT rate of the book.
    public double getVatRate()
    {
        return 0;
    } // getVatRate

} // class Book
