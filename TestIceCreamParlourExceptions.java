// Tests of IceCreamParlour exception handling.
public class TestIceCreamParlourExceptions
{
    public static void main(String[] args)
    {
        try {
            IceCreamParlour parlour = new IceCreamParlour(null);
        } catch (Exception exception) {
            try {
                System.out.println(exception);
                IceCreamParlour parlour = new IceCreamParlour("XD");
                GreedyChild child = new GreedyChild(":P");
                child.tryToEat(10);
            } catch (Exception exception1) {
                try {
                    System.out.println(exception1);
                    IceCreamParlour parlour = new IceCreamParlour("XD");
                    GreedyChild child = new GreedyChild(":P");
                    child.enterParlour(parlour);
                    child.tryToEat(10);
                } catch (Exception exception2) {
                    try {
                        System.out.println(exception2);
                        IceCreamParlour parlour = new IceCreamParlour("XD");
                        GreedyChild child = new GreedyChild(":P");
                        child.enterParlour(parlour);
                        parlour.acceptDelivery(-100);
                    } catch (Exception exception3) {
                        try {
                            System.out.println(exception3);
                            IceCreamParlour parlour = new IceCreamParlour("XD");
                            GreedyChild child = new GreedyChild(":P");
                            child.enterParlour(parlour);
                            parlour.acceptDelivery(00);
                        } catch (Exception exception4) {
                            System.out.println(exception4);
                            IceCreamParlour parlour = new IceCreamParlour("XD");
                            GreedyChild child = new GreedyChild(":P");
                            child.enterParlour(parlour);
                            parlour.acceptDelivery(100);
                            child.tryToEat(10);
                            child.tryToEat(100);
                        } // catch 4
                    } // catch 3
                } // catch 2
            } // catch 1
        } // catch
    } // main

} // class TestIceCreamParlourExceptions
