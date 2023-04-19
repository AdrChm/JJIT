import java.awt.*;

// Testing class for StockItemPurchaseRequest and ShoppingBasket.
public class TestShoppingBasket
{
    public static void main(String[] args)
    {
        Vendor publisher = new Vendor("O'Reilly Media Inc","04-2789763","1005 Gravenstein Highway N\n Sebastopol\n CA\n United States\n 95472");
        Vendor hardware = new Vendor("HP Inc.", "94-1081436","1501 Page Mill Road\n Palo Alto\n California\n 94304");

        StockItem [] stockItems =
                {
                    /* 0 */ new MouseMat("Plain Blue cloth, foam backed", 150, 10, hardware),
                    /* 1 */ new MouseMat("Pink vinyl with fluffy trim", 350, 10, hardware),
                    /* 2 */ new Book("List of all items and prices", 150, 10, new Vendor("Our store", "01-1000100", "here")),
                    /* 3 */ new Book("Build a gaming monster", 1799, 0, publisher),
                    /* 4 */ new CPU(1500, 10, 2.4, "EPYC", hardware),
                    /* 5 */ new HardDisc(5500, 10, 500, 3.5, 7200, 250, hardware),
                    /* 6 */ new Keyboard(200, 10,  new Color(1,1,1), 105, "small display monitor", hardware)
                };

        System.out.println("Stock before purchase:");
        for(StockItem stockItem : stockItems)
            System.out.println(stockItem);
        System.out.println();

        ShoppingBasket shoppingBasket = new ShoppingBasket();

        shoppingBasket.add(stockItems[0], 2);
        shoppingBasket.add(stockItems[2], 1);
        shoppingBasket.add(stockItems[4], 8);
        shoppingBasket.add(stockItems[5], 9);
        shoppingBasket.add(stockItems[4], 3);
        shoppingBasket.add(stockItems[6], 8);
        shoppingBasket.add(stockItems[3], 1);

        System.out.println("Shopping basket filled up:");
        System.out.println(shoppingBasket);
        System.out.println();

        System.out.println("Performing checkout:");
        System.out.println("Checkout report:");
        System.out.println(shoppingBasket.checkout());
        System.out.println();

        System.out.println("Shopping basket after checkout:");
        System.out.println(shoppingBasket);

        System.out.println("Stock after checkout:");
        for(StockItem stockItem : stockItems)
            System.out.println(stockItem);

    } // main

} // class TestShoppingBasket
