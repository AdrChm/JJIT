// Return a Pair containing min and max of given array.
public class MinMaxArray <T>
{

    // Returns a Pair on <T> items representing minimum and maximum
    // item value from given array
    public static <T extends Comparable<T>> Pair getPair(T [] array)
    {
        if(array == null || array.length == 0)
            throw new IllegalArgumentException("Given array should exists and must not be empty!");

        T min = array[0];
        T max = array[0];
        for (int index = 1; index < array.length; index++)
        {
            if(array[index].compareTo(min) < 0)
                min = array[index];

            if (array[index].compareTo(max) > 0)
                max = array[index];

        } // for
        return new Pair<T, T> (min, max);
    } // getPair

} // class MinMaxArray