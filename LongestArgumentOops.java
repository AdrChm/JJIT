// Find the longest command line argument and report it and its position.
// (Warning: this program does not catch RunTimeExceptions.)
public class LongestArgumentOops
{
    public static void main(String[] args)
    {
        Pair<Integer, String> result = LongestString.findLongestString(args);
        int longestIndex = result.getFirst().intValue();
        String longestArg = result.getSecond();

        System.out.println("A longest arguments was '" + longestArg + "'");
        System.out.println("of length " + longestArg.length());
        System.out.println("fount at position " + (longestIndex + 1));
    } // main

} // class LongestArgumentOops