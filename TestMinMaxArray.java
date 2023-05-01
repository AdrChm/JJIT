// Program to test MinMaxArray class
public class TestMinMaxArray
{
    // Testing on arrays of different types.
    public static void main(String[] args)
    {
        Integer [] integers = {1, 3, 5, 7, 10, -9, 11, 6, 20, 2};
        String [] strings = {"the", "cat", "vaporized", "on", "the", "mat", "or", "something", "like", "that"};
        ValuableCar[] cars = { new ValuableCar(2,10),
                               new ValuableCar(5,8),
                               new ValuableCar(5,6),
                               new ValuableCar(2,10)};

        System.out.println("integers");
        for (int index = 0; index < integers.length; index++)
            System.out.println(integers[index]);

        Pair minMaxInt = MinMaxArray.getPair(integers);
        System.out.println(minMaxInt);

        System.out.println("\nStrings");
        for (int index = 0; index < strings.length; index++)
            System.out.println(strings[index]);

        Pair minMaxString = MinMaxArray.getPair(strings);
        System.out.println(minMaxString);

        System.out.println("\nValuableCars");
        for (int index = 0; index < cars.length; index++)
            System.out.println(cars[index]);

        Pair minMaxCars = MinMaxArray.getPair(cars);
        System.out.println(minMaxCars);

    } // main
} // class TestMinMaxArray
