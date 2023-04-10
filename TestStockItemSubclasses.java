// Program to test StockItem subclasses.
// I hope there will be changes in StockItem in upcoming chapters.
public class TestStockItemSubclasses
{
    // Creating each subclass of the StockItem.
    public static void main(String[] args)
    {
        StockItem [] inventory =
        {
                new MouseMat("Plain blue cloth, foam backed", 1000, 20),
                new MouseMat("Gaming mouse mat with led lightning", 4000, 20),
                new Book("List of all items and prices", 0, 100),
                new Book("Java: Just in Time", 15000, 100),
                new Keyboard( 4999, 15),
                new CPU( 99999, 10),
                new HardDisc( 19999, 20)
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

        if(item instanceof TextDescriptionStockItem)
            testTextDescriptionStockItem((TextDescriptionStockItem) item);

    } // test

    // Display description of stock item as it changes along the way.
    private static void testTextDescriptionStockItem(TextDescriptionStockItem item)
    {
        item.setDescription("Description updated!");
        System.out.println(item);
    } // testTextDescriptionStockItem

} // class TestStockItemSubclasses
