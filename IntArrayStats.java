// Provides a Triple for given int array.
public class IntArrayStats
{

    // Finds the minimum, maximum and mean value of given int array.
    // Throw IllegalArgumentException if array is null or empty.
    public static Triple getStats(int [] array) throws IllegalArgumentException
    {
        if(array == null || array.length == 0)
            throw new IllegalArgumentException("Array must exist and be non-empty");

        int minimum = array[0];
        int maximum = array[0];
        double mean = array[0];

        for (int index = 1; index < array.length; index++)
        {
            if(array[index] > maximum)
                maximum = array[index];
            else if (array[index] < minimum)
                minimum = array[index];

            mean += array[index];
        } // for

        return new Triple(minimum, maximum, mean / array.length);
    } // getStats

} // class IntArrayStats
