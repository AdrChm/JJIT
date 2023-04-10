// Program to test StockItem class.
// There will be changes in StockItem in upcoming chapters, but so far
// that's how test must follow to fulfill requirements of class build
// and the test output.
public class TestStockItem
{
    public static void main(String[] args)
    {
        StockItem keyboardStockItem = new StockItem( 499, 10);
        System.out.println("Creating a keyboard stock item, " + keyboardStockItem.getQuantityInStock()
                            + " in stock @ " + keyboardStockItem.getPriceExVat());
        System.out.println(keyboardStockItem);

        StockItem monitorStockItem = new StockItem( 9999, 20);
        System.out.println("Creating a monitor stock item, " + monitorStockItem.getQuantityInStock()
                            + " in stock @ " + monitorStockItem.getPriceExVat());
        System.out.println(monitorStockItem);

        System.out.println("Obtain 10 keyboards");
        keyboardStockItem.increaseStock(10);
        System.out.println(keyboardStockItem);

        System.out.println("Obtain 20 monitors");
        monitorStockItem.increaseStock(20);
        System.out.println(monitorStockItem);

        System.out.println("Sell 5 keyboards");
        keyboardStockItem.sellStock(5);
        System.out.println(keyboardStockItem);

        System.out.println("Sell 10 monitors");
        monitorStockItem.sellStock(10);
        System.out.println(monitorStockItem);

        System.out.println("Change keyboard price to 399");
        keyboardStockItem.setPriceExVat(399);
        System.out.println(keyboardStockItem);

        System.out.println("Change keyboard price to 7999");
        keyboardStockItem.setPriceExVat(7999);
        System.out.println(monitorStockItem);
    } // main
} // class TestStockItem
