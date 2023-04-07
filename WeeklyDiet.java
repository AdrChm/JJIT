import java.io.File;
import java.util.Scanner;

/* This program read food information from food-details.txt
   and diet information from diet-diary.txt
   and produces a table of how much nutritional component was eaten
   on each day of the week.
 */
public class WeeklyDiet
{
    // The FoodList to be obtained from food-details.txt.
    private static FoodList foodList;

    // The main method.
    public static void main(String[] args) throws Exception
    {
        foodList = new FoodList(new Scanner(new File("food-details.txt")));
        readDietDiary(new Scanner(new File("diet-diary.txt")));
        printDietTable();
    } // main

    // Days of the week -- this defines spelling for use in diet-diary.txt
    // and their order in dietTable.
    private static final String[] DAY_NAMES = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    // Find the day index for the given day name, or -1 if not found.
    private static int findDayIndex(String dayName)
    {
        int dayIndex = 0;
        while(dayIndex < DAY_NAMES.length
                && ! DAY_NAMES[dayIndex].equals(dayName))
            dayIndex++;
        if (dayIndex == DAY_NAMES.length)
            return -1;
        else
            return dayIndex;
    } // findDayIndex

    // A two-dimensional array of nutritional component amounts.
    // Index is [day number][component number]
    // and data is accumulated as number of milligrams of that component
    // eaten on that day.
    private static int[][] dietTable =
            new int[DAY_NAMES.length][Food.NUTRITIONAL_COMPONENTS.length];

    // read the diet information from the given scanner
    // accumulating nutritional components in dietTable.
    private static void readDietDiary(Scanner scanner)
    {
        // First initialize the amount to zero.
        for (int dayIndex = 0; dayIndex < DAY_NAMES.length; dayIndex++)
            for (int componentIndex = 0;
                 componentIndex < Food.NUTRITIONAL_COMPONENTS.length; componentIndex++)
                dietTable[dayIndex][componentIndex] = 0;

        // Now read each line.
        while (scanner.hasNextLine())
        {
            String[] portionDetails = scanner.nextLine().split("\t+");
            // Day name is the first item.
            int dayIndex = findDayIndex(portionDetails[0]);
            if(dayIndex == -1)
                System.out.println("Unrecognized day name:" + portionDetails[0]);
            // Food name is the second item.
            Food food = foodList.findFood(portionDetails[1]);
            if (food == null)
                System.out.println("Unrecognized food name: " + portionDetails[1]);
            if(dayIndex != -1 && food != null)
            {
                // Food amount is the third item.
                int amount = Integer.parseInt(portionDetails[2]);
                // Obtain nutritional components from that amount.
                int[] foodComponents = food.componentMilliGramsForWeight(amount);
                // And accumulate them in dietTable.
                for (int componentIndex = 0;
                     componentIndex < Food.NUTRITIONAL_COMPONENTS.length; componentIndex++)
                    dietTable[dayIndex][componentIndex] += foodComponents[componentIndex];
            } // if
        } // while
    } // readDietDiary

    // Print the dietTable as grams (so divide by 1000).
    private static void printDietTable()
    {
        // First print the column headings.
        for (String componentName : Food.NUTRITIONAL_COMPONENTS)
            System.out.print("\t" + componentName);
        System.out.println();

        // Now print the rows, one for each day of the week.
        for (int dayIndex = 0; dayIndex < DAY_NAMES.length; dayIndex++)
        {
            System.out.print(DAY_NAMES[dayIndex]);
            for (int amountOfComponentEaten : dietTable[dayIndex])
                System.out.print("\t" + Math.round(amountOfComponentEaten / 1000));
            System.out.println();
        } // for
    } // printDietTable

} // class WeeklyDiet
