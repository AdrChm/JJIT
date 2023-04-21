// Class to test MobileIceCreamParlour exception handling.
public class TestMobileIceCreamParlourExceptions
{
    public static void main(String[] args)
    {
        try {
            MobileIceCreamParlour mobileIceCreamParlour = new MobileIceCreamParlour(null);
        } catch (Exception exception) {
            try{
            System.out.println(exception);
            MobileIceCreamParlour mobileIceCreamParlour = new MobileIceCreamParlour("Lorry");
            mobileIceCreamParlour.obtainFuel(-10);
            } catch (Exception exception1) {
                try{
                    System.out.println(exception1);
                    MobileIceCreamParlour mobileIceCreamParlour = new MobileIceCreamParlour("Lorry");
                    mobileIceCreamParlour.obtainFuel(10);
                    mobileIceCreamParlour.drive(-100);
                } catch (Exception exception2) {
                    try{
                        System.out.println(exception2);
                        MobileIceCreamParlour mobileIceCreamParlour = new MobileIceCreamParlour("Lorry");
                        mobileIceCreamParlour.obtainFuel(10);
                        mobileIceCreamParlour.drive(0);

                    } catch (Exception exception3) {
                        System.out.println(exception3);
                        MobileIceCreamParlour mobileIceCreamParlour = new MobileIceCreamParlour("Lorry");
                        mobileIceCreamParlour.obtainFuel(10);
                        mobileIceCreamParlour.drive(100);
                        System.out.println(mobileIceCreamParlour);
                    } // catch 3
                } // catch 2
            } // catch 1
        } // catch
    } // main

} // class TestMobileIceCreamParlourExceptions
