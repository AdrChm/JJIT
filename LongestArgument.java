// Find the longest command line argument and report it and its position.
// (Warning: this program does not catch RunTimeExceptions.)
public class LongestArgument
{
    public static void main(String[] args) throws RuntimeException
    {
        Pair<String, Integer> result = LongestString.findLongestString(args);
        String longestArg = result.getFirst();
        int longestIndex = result.getSecond();

        System.out.println("A longest arguments was '" + longestArg + "'");
        System.out.println("of length " + longestArg.length());
        System.out.println("fount at position " + (longestIndex + 1));
    } // main

} // class LongestArgument
