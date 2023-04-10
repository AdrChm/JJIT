// Representation of book.
public class Book extends TextDescriptionStockItem

{    // Constructor supplying TextDescriptionStockItem superclass.
    public Book(String title, int initialPriceExVat, int initialQuantityInStock)
    {
        super(title,initialPriceExVat, initialQuantityInStock);
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
