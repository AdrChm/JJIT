// Program to test StockItem class.
// There will be changes in StockItem in upcoming chapters, but so far
// that's how test must follow to fulfill requirements of class build
// and the test output.
public class TestStockItem
{
    public static void main(String[] args)
    {

        Vendor vendor = new Vendor("HP Inc.", "94-1081436","1501 Page Mill Road\n Palo Alto\n California\n 94304");
        Vendor publisher = new Vendor("O'Reilly Media Inc.","04-2789763","1005 Gravenstein Highway N\n Sebastopol\n CA\n United States\n 95472");

        StockItem mouseMat = new MouseMat("Plain blue cloth, foam backed", 499, 10, vendor);
        System.out.println("Creating a mouse mat stock item, " + mouseMat.getQuantityInStock()
                            + " in stock @ " + mouseMat.getPriceExVat());
        System.out.println(mouseMat);

        StockItem book = new Book("List of all items and prices", 9999, 20, publisher);
        System.out.println("Creating a catalogue stock item, " + book.getQuantityInStock()
                            + " in stock @ " + book.getPriceExVat());
        System.out.println(book);

        System.out.println("Obtain 10 mouse mats");
        mouseMat.increaseStock(10);
        System.out.println(mouseMat);

        System.out.println("Obtain 20 catalogues");
        book.increaseStock(20);
        System.out.println(book);

        System.out.println("Sell 5 mouse mats");
        mouseMat.sellStock(5);
        System.out.println(mouseMat);

        System.out.println("Sell 10 catalogues");
        book.sellStock(10);
        System.out.println(book);

        System.out.println("Change mouse mat price to 399");
        mouseMat.setPriceExVat(399);
        System.out.println(mouseMat);

        System.out.println("Change catalogue price to 7999");
        book.setPriceExVat(7999);
        System.out.println(book);

    } // main
} // class TestStockItem
