import java.util.Scanner;
import java.io.File;

public class RandomOrderPuzzle
{
    // Initial size of the readJobsInOriginalOrder array
    private static final int INITIAL_ARRAY_SIZE  = 10;

    // When readJobsInOriginalOrder is full, we extend it by this factor.
    private static final int ARRAY_RESIZE_FACTOR = 2;

    // The lyrics in original order.
    private String [] lyrics;

    // The lyrics in randomized order.
    private String [] thePuzzle;

    public static void main(String[] args) throws Exception
    {
        System.out.println(args[0]);
        Scanner fileScanner = new Scanner(new File(args[0]));
        RandomOrderPuzzle puzzle = new RandomOrderPuzzle(fileScanner);

        Scanner inputScanner = new Scanner(System.in);
        System.out.println(puzzle);
        int moveCount = 0;
        while(!puzzle.isSorted())
        {
            System.out.println("Enter a line number to swap with the last one: ");
            puzzle.swapLine(inputScanner.nextInt());
            System.out.println(puzzle);
            moveCount++;
        } // while

        System.out.println("Game over in " + moveCount + " moves.");
    } // main

    private void randomizeStringArrayOrder(String[] anArray)
    {
        for (int itemsRemaining = anArray.length - 1; itemsRemaining > 0; itemsRemaining--)
        {
            int anIndex = (int) (Math.random() * itemsRemaining + 1);
            String itemAnIndex = anArray[anIndex];
            anArray[anIndex] = anArray[anIndex - 1];
            anArray[anIndex - 1] = itemAnIndex;
        } // for
    } // randomizeStringArrayOrder

    // Private constructor.
    private RandomOrderPuzzle(Scanner fileScanner)
    {
        lyrics = new String[INITIAL_ARRAY_SIZE];
        thePuzzle = new String[INITIAL_ARRAY_SIZE];

        int linesReadSoFar = 0;
        while(fileScanner.hasNextLine())
        {
            if(linesReadSoFar == lyrics.length)
            {
                lyrics = arrayExtension(lyrics);
                thePuzzle = arrayExtension(thePuzzle);
            } // if

            lyrics[linesReadSoFar] = fileScanner.nextLine();
            thePuzzle[linesReadSoFar] = lyrics[linesReadSoFar];

            linesReadSoFar++;
        } // while

        lyrics = cutEmptyElements(lyrics);
        thePuzzle = cutEmptyElements(thePuzzle);

        randomizeStringArrayOrder(thePuzzle);
    } // RandomOrderPuzzle

    // Helper method to extend array once it's full.
    private String [] arrayExtension(String [] array)
    {
        String [] newArray = new String [array.length * ARRAY_RESIZE_FACTOR];
        for (int index = 0; index < array.length; index++)
            newArray[index] = array[index];

        return newArray;
    } // arrayExtension

    // Helper method to swap line at given index with the last line of the puzzle.
    private void swapLine(int lineNumber)
    {
        String tempString = thePuzzle[lineNumber];
        thePuzzle[lineNumber] = thePuzzle[thePuzzle.length - 1];
        thePuzzle[thePuzzle.length - 1] = tempString;
    } // swapLine

    // Helper method to access if puzzle is solved (according to the lyrics)
    private boolean isSorted()
    {
        for (int index = 0; index < thePuzzle.length; index++)
            if(!thePuzzle[index].equals(lyrics[index]))
                return false;

        return true;
    } // isSorted

    // To string method returning String representation of current state of the puzzle.
    public String toString()
    {
        StringBuilder buffer = new StringBuilder();
        for (int index = 0; index < thePuzzle.length; index++)
        {
            buffer.append(index);
            buffer.append("\t");
            buffer.append(thePuzzle[index]);
            buffer.append("\n");
        } // for

        return buffer.toString();
    } // toString

    // Helper method to adjust array to required length cutting out null values.
    private String [] cutEmptyElements(String [] anArray)
    {
        int finalSize = 0;
        // This method allows the text to contain null values inside the text.
        // The last not null value is considered the end of the text.
        for (int index = 0; index < anArray.length ; index++)
            if(anArray[index]!=null)
                finalSize = index;

        String [] truncatedArray = new String[finalSize + 1];
        for (int finalIndex = 0; finalIndex < truncatedArray.length; finalIndex++)
            truncatedArray[finalIndex] = anArray[finalIndex];

        return truncatedArray;
    } // cutEmptyElements

} // class RandomOrderPuzzle

