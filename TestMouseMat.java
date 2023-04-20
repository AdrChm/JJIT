// Program to test MouseMat class.
public class TestMouseMat
{
    public static void main(String[] args)
    {
        Vendor vendor = new Vendor("HP Inc.", "94-1081436","1501 Page Mill Road\n Palo Alto\n California\n 94304");

        MouseMat mouseMat = new MouseMat("Plain blue cloth, foam backed", 49, 10, vendor);
        System.out.println("Creating a mouse mat stock item, " + mouseMat.getQuantityInStock()
                + " in stock @ " + mouseMat.getPriceExVat());
        System.out.println(mouseMat);

        System.out.println("Obtain 10 mouse mats");
        mouseMat.increaseStock(10);
        System.out.println(mouseMat);

        System.out.println("Sell 5 mouse mats");
        mouseMat.sellStock(5);
        System.out.println(mouseMat);

        System.out.println("Change mouse mat price to 39");
        mouseMat.setPriceExVat(39);
        System.out.println(mouseMat);

    } // main

} // class TestMouseMat
