// Program to test MouseMat class.
public class TestMouseMat
{
    public static void main(String[] args) {
        MouseMat mouse = new MouseMat("Plain blue cloth, foam backed", 49, 10);
        System.out.println("Creating a mouse mat stock item, " + mouse.getQuantityInStock()
                + " in stock @ " + mouse.getPriceExVat());
        System.out.println(mouse);

        System.out.println("Obtain 10 mouse mats");
        mouse.increaseStock(10);
        System.out.println(mouse);

        System.out.println("Sell 5 mouse mats");
        mouse.sellStock(5);
        System.out.println(mouse);

        System.out.println("Change mouse mat price to 39");
        mouse.setPriceExVat(39);
        System.out.println(mouse);

    } // main

} // class TestMouseMat
