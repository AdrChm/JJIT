// Program to test StockItem class.
// There will be changes in StockItem in upcoming chapters, but so far
// that's how test must follow to fulfill requirements of class build
// and the test output.
public class TestStockItem
{
    public static void main(String[] args)
    {
        StockItem mouseMatStockItem = new MouseMat( 499, 10);
        System.out.println("Creating a mouse mat stock item, " + mouseMatStockItem.getQuantityInStock()
                            + " in stock @ " + mouseMatStockItem.getPriceExVat());
        System.out.println(mouseMatStockItem);

        StockItem catalogueStockItem = new Catalogue( 9999, 20);
        System.out.println("Creating a catalogue stock item, " + catalogueStockItem.getQuantityInStock()
                            + " in stock @ " + catalogueStockItem.getPriceExVat());
        System.out.println(catalogueStockItem);

        System.out.println("Obtain 10 mouse mats");
        mouseMatStockItem.increaseStock(10);
        System.out.println(mouseMatStockItem);

        System.out.println("Obtain 20 catalogues");
        catalogueStockItem.increaseStock(20);
        System.out.println(catalogueStockItem);

        System.out.println("Sell 5 mouse mats");
        mouseMatStockItem.sellStock(5);
        System.out.println(mouseMatStockItem);

        System.out.println("Sell 10 catalogues");
        catalogueStockItem.sellStock(10);
        System.out.println(catalogueStockItem);

        System.out.println("Change mouse mat price to 399");
        mouseMatStockItem.setPriceExVat(399);
        System.out.println(mouseMatStockItem);

        System.out.println("Change catalogue price to 7999");
        catalogueStockItem.setPriceExVat(7999);
        System.out.println(catalogueStockItem);

    } // main
} // class TestStockItem
