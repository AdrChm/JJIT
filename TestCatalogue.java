// Program to test Catalogue class.
public class TestCatalogue
{
    public static void main(String[] args)
    {
        Catalogue catalogue = new Catalogue( 0, 100);
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
} // class TestCatalogue
