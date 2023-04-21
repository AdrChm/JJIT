// Tests of GreedyChild exception handling.
public class TestGreedyChildExceptions
{
    public static void main(String[] args)
    {
        try {
            GreedyChild child1 = new GreedyChild(null);
        } catch (Exception exception) {
            try {
                System.out.println(exception);
                GreedyChild child3 = new GreedyChild("sadasd", -100);
            } catch (Exception exception1) {
                try {
                    System.out.println(exception1);
                    GreedyChild child4 = new GreedyChild("sadasdasd", 0);
                } catch (Exception exception2) {
                    try {
                        System.out.println(exception2);
                        GreedyChild child5 = new GreedyChild(":P", 100);
                        child5.enterParlour(null);
                    } catch (Exception exception3) {
                        try {
                            System.out.println(exception3);
                            GreedyChild child5 = new GreedyChild(":P", 100);
                            child5.leaveParlour();
                        } catch (Exception exception4) {
                            try {
                                System.out.println(exception4);
                                GreedyChild child5 = new GreedyChild(":P", 100);
                                child5.tryToEat(-10);
                            } catch (Exception exception5) {
                                try {
                                    System.out.println(exception5);
                                    GreedyChild child5 = new GreedyChild(":P", 100);
                                    child5.tryToEat(10);
                                } catch (Exception exception6) {
                                    try {
                                        System.out.println(exception6);
                                        GreedyChild child5 = new GreedyChild(":P", 100);
                                        IceCreamParlour parlour1 = new IceCreamParlour("XD");
                                        parlour1.acceptDelivery(100);
                                        child5.enterParlour(parlour1);
                                        child5.tryToEat(-10);
                                    } catch (Exception exception7) {
                                        try {
                                            System.out.println(exception7);
                                            GreedyChild child5 = new GreedyChild(":P", 100);
                                            IceCreamParlour parlour1 = new IceCreamParlour("XD");
                                            IceCreamParlour parlour2 = new IceCreamParlour("XDD");
                                            parlour1.acceptDelivery(100);
                                            child5.enterParlour(parlour1);
                                            child5.enterParlour(parlour2);
                                            child5.tryToEat(10);

                                        } catch (Exception exception8) {
                                            System.out.println(exception8);
                                            GreedyChild child5 = new GreedyChild(":P", 100);
                                            IceCreamParlour parlour1 = new IceCreamParlour("XD");
                                            IceCreamParlour parlour2 = new IceCreamParlour("XDD");
                                            parlour1.acceptDelivery(100);
                                            child5.enterParlour(parlour1);
                                            child5.tryToEat(10);
                                        } // catch 8
                                    } // catch 7
                                } // catch 6
                            } // catch 5
                        } // catch 4
                    } // catch 3
                } // catch 2
            } // catch 1
        } // catch
    } // main

} // class TestGreedyChildExceptions
