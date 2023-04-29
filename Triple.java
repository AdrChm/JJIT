// Representation of 3 values, to be used as IntArrayStats class helper
// to represent given array in the class mentioned above.
public class Triple<TypeOne, TypeTwo, TypeThree>
{
    // Minimal value of some data set.
    private final TypeOne minValue;

    // Maximum value of some data set.
    private final TypeTwo maxValue;

    // Mean value of some data set.
    private final TypeThree meanValue;

    // Constructor method.
    public Triple(TypeOne minValue, TypeTwo maxValue, TypeThree meanValue)
    {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.meanValue = meanValue;
    } // Triple

    // Returns the minimal value.
    public TypeOne getMinValue()
    {
        return minValue;
    } // getMinValue

    // Returns the maximum value.
    public TypeTwo getMaxValue()
    {
        return maxValue;
    } // getMaxValue

    // Returns the mean value.
    public TypeThree getMeanValue()
    {
        return meanValue;
    } // getMeanValue

} // class Triple
