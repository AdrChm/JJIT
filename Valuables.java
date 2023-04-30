// Representation of a collection of Valuables.
public class Valuables
{
    // The Valuables, stored in partially filled array, together with size.
    private final Valuable[] valuableArray;
    private int noOfValuables;

    // Create a collection with the given maximum size.
    public Valuables(int maxNoOfValuables)
    {
        valuableArray = new Valuable[maxNoOfValuables];
        noOfValuables = 0;
    } // Valuables

    // Add a given Valuable to the collection (ignore if full).
    public void addValuable(Valuable valuable)
    {
        if (noOfValuables < valuableArray.length)
        {
            valuableArray[noOfValuables] = valuable;
            noOfValuables++;
        } // if
    } // addValuable

    // Calculate and return the total value of the collection.
    public int totalValue()
    {
        int result = 0;
        for (int index = 0; index < noOfValuables; index++)
            result += valuableArray[index].value();
        return result;
    } // totalValue

    // Return a short description of the collection.
    @Override
    public String toString()
    {
        if (noOfValuables == 0)
            return "Nothing valuable";

        String result = valuableArray[0].toString();
        for (int index = 1; index < noOfValuables; index++)
            result += String.format("%n%s", valuableArray[index]);
        return result;

    } // toString


    // Create a Valuables collection, add Valuable items and show result.
    // Purely for testing during development.
    public static void main(String[] args)
    {
        Valuables valuables = new Valuables(5);

        // My first house -- I was so proud of its spare bedroom
        // and 'value for money' area.
        valuables.addValuable(new ValuableHouse(2, 0.5));

        // My first car, not quite a 'head turner',
        // but its third door was handy when the main 2 got stuck.
        valuables.addValuable(new ValuableCar(3, 0.25));

        // It was nice to have a new car when I started work.
        valuables.addValuable(new ValuableCar(4, 1.0));

        // Then I won the lottery! (Yeah, right.)
        valuables.addValuable(new ValuableHouse(6, 2.0));
        valuables.addValuable(new ValuableCar(12, 4.0));

        System.out.println("My valuables are worth " + valuables.totalValue());

        System.out.println(valuables);
    } // main

} // class Valuables
