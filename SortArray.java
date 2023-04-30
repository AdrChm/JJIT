// Provides a class method for sorting an array of any Sortable objects.
public class SortArray
{

    // Sort the given array from indices 0 to noOfItemsToSort - 1.
    private static void sort(Sortable [] anArray, int noOfItemsToSort)
        throws NullPointerException, ArrayIndexOutOfBoundsException
    {
        // Each pass of the sort reduces unsortedLength by one.
        int unsortedLength = noOfItemsToSort;
        // If no change is made on a pass, the main loop can stop.
        boolean changeThisOnPass;
        do
        {
            changeThisOnPass = false;
            for (int pairLeftIndex = 0; pairLeftIndex < unsortedLength - 1; pairLeftIndex++)
            {
                if (anArray[pairLeftIndex].compareTo(anArray[pairLeftIndex + 1]) > 0)
                {
                    Sortable thatWasAtPairLeftIndex = anArray[pairLeftIndex];
                    anArray [pairLeftIndex] = anArray [pairLeftIndex + 1];
                    anArray [pairLeftIndex + 1] = thatWasAtPairLeftIndex;
                    changeThisOnPass = true;
                } // if

            } // for
            unsortedLength--;
        } while (changeThisOnPass);
    } // sort

} // class SortArray
