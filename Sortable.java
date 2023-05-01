// A type for all things which can be sorted.
public interface Sortable
{
    // This method must provide a total order, and return:
    //      a negative int if this should be ordered before the given order,
    //      zero if they should have the same ordering or
    //      a positive int if this should be ordered after the given other.
    int compareTo(Sortable other);

} // interface Sortable
