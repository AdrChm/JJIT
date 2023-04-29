// Representation of 3 values, to be used as IntArrayStats class helper
// to represent given array in the class mentioned above.
public class Triple
{
    // Minimal value of some data set.
    private final int minValue;

    // Maximum value of some data set.
    private final int maxValue;

    // Mean value of some data set.
    private final double meanValue;

    // Constructor method.
    public Triple(int minValue, int maxValue, double meanValue)
    {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.meanValue = meanValue;
    } // Triple

    // Returns the minimal value.
    public int getMinValue()
    {
        return minValue;
    } // getMinValue

    // Returns the maximum value.
    public int getMaxValue()
    {
        return maxValue;
    } // getMaxValue
    
    // Returns the mean value.
    public double getMeanValue()
    {
        return meanValue;
    } // getMeanValue

} // class Triple
