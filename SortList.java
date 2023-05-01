import java.util.List;

// Provides a class method for sorting a List of any Comparable objects.
public class SortList
{
    public static <ListType extends Comparable<ListType>> void sort(List<ListType> list)
    {
        // Each pass of the sort reduces unsortedLength by one.
        int unsortedLength = list.size();

        // If no change is made on pass, the main loop can stop.
        boolean changeOnThisPass;
        do
        {
            changeOnThisPass = false;
            for (int pairLeftIndex = 0 ;pairLeftIndex < unsortedLength - 1; pairLeftIndex++)
            {
                if (list.get(pairLeftIndex).compareTo(list.get(pairLeftIndex + 1)) > 0)
                {
                    ListType thatWasAtPairLeftIndex = list.get(pairLeftIndex);
                    list.set(pairLeftIndex, list.get(pairLeftIndex + 1));
                    list.set(pairLeftIndex + 1, thatWasAtPairLeftIndex);
                    changeOnThisPass = true;
                } // if
            } // for
            unsortedLength--;
        } while (changeOnThisPass);
    } // sort

} // class SortList
