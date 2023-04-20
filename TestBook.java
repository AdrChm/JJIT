// Program to test Book class.
public class TestBook
{
    public static void main(String[] args)
    {
        Vendor publisher = new Vendor("Our store.", "01-1000100", "here");
        Book catalogue = new Book("List of all items and prices", 0, 100, publisher);
        System.out.println("Creating a mouse mat stock item, " + catalogue.getQuantityInStock()
                + " in stock @ " + catalogue.getPriceExVat());
        System.out.println(catalogue);

        System.out.println("Obtain 100 catalogues");
        catalogue.increaseStock(100);
        System.out.println(catalogue);

        System.out.println("Give away 150 catalogues");
        catalogue.sellStock(150);
        System.out.println(catalogue);

        System.out.println("Change catalogue price to 1");
        catalogue.setPriceExVat(1);
        System.out.println(catalogue);
    } // main

} // class TestBook
