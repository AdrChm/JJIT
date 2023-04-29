// Program to measure how much the mean of the integer command line arguments
// differs from the average of their minimum and maximum.
// (Warning: this program does not catch RunTimeExceptions.)
public class MeanMinMaxMinusMean
{
    public static void main(String[] args)
    {
        int [] array = new int[args.length];
        for (int index = 0; index < args.length; index++)
            array[index] = Integer.parseInt(args[index]);

        Triple stats = new IntArrayStats().getStats(array);
        int max = ((Integer)stats.getMaxValue()).intValue();
        int min = ((Integer)stats.getMinValue()).intValue();
        double mean = ((Double)stats.getMeanValue()).doubleValue();
        System.out.println((min + max) / 2.0 - mean);
    } // main
} // class MeanMinMaxMinusMean
