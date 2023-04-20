import java.awt.*;

// Program to test StockItem subclasses.
// I hope there will be changes in StockItem in upcoming chapters.
public class TestStockItemSubclasses
{
    // Creating each subclass of the StockItem.
    public static void main(String[] args)
    {
        Vendor publisher = new Vendor("O'Reilly Media Inc.","04-2789763","1005 Gravenstein Highway N\n Sebastopol\n CA\n United States\n 95472");
        Vendor hardware = new Vendor("HP Inc.", "94-1081436","1501 Page Mill Road\n Palo Alto\n California\n 94304");
        StockItem [] inventory =
        {
                new MouseMat("Plain blue cloth, foam backed", 1000, 20, hardware),
                new MouseMat("Gaming mouse mat with led lightning", 4000, 20, hardware),
                new Book("List of all items and prices", 0, 100, new Vendor("Our store.", "01-1000100", "here")),
                new Book("Java: Just in Time", 15000, 100, publisher),
                new Keyboard( 4999, 15, new Color(1,1,1), 105, "small display monitor", hardware),
                new CPU( 99999, 10, 2.4, "EPYC", hardware),
                new HardDisc( 19999, 20, 500, 3.5, 7200, 250, hardware),
                new ReliableHardDisc( 19999, 20, 500, 10,3.5, 7200, 250, hardware)
        };

            for(StockItem item: inventory)
                test(item);



    } // main

    // Display state of the stock item as it changes along the way.
    private static void test(StockItem item)
    {

        System.out.println("-------------------------------------------------");

        System.out.println("Creating a stock item, " + item.getQuantityInStock()
                            + " in stock @ " + item.getPriceExVat());
        System.out.println(item);

        System.out.println("Obtain 10 more " + item.getStockItemType() + "s");
        item.increaseStock(10);
        System.out.println(item);

        System.out.println("Sell 5 " + item.getStockItemType() + "s");
        item.sellStock(5);
        System.out.println(item);

        System.out.println("Make a discount reducing the price by 20%");
        item.setPriceExVat((int) Math.round(item.getPriceExVat() * 0.8));
        System.out.println(item);

            testTextDescriptionStockItem(item);

    } // test

    // Display description of stock item as it changes along the way.
    private static void testTextDescriptionStockItem(StockItem item)
    {
        item.setDescription("Description updated!");
        System.out.println(item);
    } // testTextDescriptionStockItem

} // class TestStockItemSubclasses
