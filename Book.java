// Representation of a book.
public class Book extends StockItem
{
    // Constructor supplying StockItem superclass.
    public Book(String title, int initialPriceExVat, int initialQuantityInStock, Vendor vendor)
    {
        super(title,initialPriceExVat, initialQuantityInStock, vendor);
        System.out.println("Book");
    } // Book

    @Override
    // Return type of this book.
    public String getStockItemType()
    {
        return "Book";
    } // getStockCode

    @Override
    // Returns the percentage VAT rate of the book.
    public double getVatRate()
    {
        return 0;
    } // getVatRate

} // class Book
