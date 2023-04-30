// Provides and efficient search for a Comparable in a sorted Comparable[].
public class SearchArray
{
    // Use binary search to find searchItem in anArray which must be sorted.
    // Returns a negative number if not presented, or array index.
    public static <ArrayType extends Comparable<ArrayType>> int search(
            ArrayType [] anArray, int noOfItems, ArrayType searchItem)
            throws IllegalArgumentException
    {
        if (anArray == null)
            throw new IllegalArgumentException("Array must exist");
        if (noOfItems > anArray.length)
            throw new IllegalArgumentException("Data length > array length: " +
                                                noOfItems + " " + anArray.length);
        if (noOfItems == 0)
            return -1;

        int lowIndex = 0;
        int highIndex = noOfItems - 1;
        int midIndex = (highIndex + lowIndex) / 2;
        while (lowIndex < highIndex && !anArray[midIndex].equals(searchItem))
        {
            if(anArray[midIndex].compareTo(searchItem) < 0)
                lowIndex = midIndex + 1;
            else
                highIndex = midIndex - 1;
            midIndex = (highIndex + lowIndex) / 2;
        } // while
        if(anArray[midIndex].equals(searchItem))
            return midIndex;
        else
            return -1;
    } // search

} // class SearchArray
