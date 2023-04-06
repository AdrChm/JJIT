import java.util.Scanner;

// Keeps list of food items, and provides a search facility.
public class FoodList
{
    // For array extension fo FoodList.
    private static final int INITIAL_ARRAY_SIZE = 100, ARRAY_RESIZE_FACTOR = 2;

    // The food details are stored in a partially filled array
    // with an associated count.
    private final int noOfFoodItems;
    private final Food[] foodList;

    // The constructor reads the food details from a given scanner
    // and stores them in foodList, extending as necessary.
    public FoodList(Scanner scanner)
    {
        // The first line is just titles.
        scanner.nextLine();

        Food [] foodListSoFar = new Food[INITIAL_ARRAY_SIZE];
        int noOfItemsSoFar = 0;
        while (scanner.hasNextLine())
        {
            // Food constructor parses the whole line.
            Food latestFood = new Food(scanner.nextLine());

            // Extend the array if it is full.
            if (noOfItemsSoFar == foodListSoFar.length)
            {
                Food[] biggerArray = new Food[foodListSoFar.length * ARRAY_RESIZE_FACTOR];

                for (int index = 0; index < foodListSoFar.length; index++)
                    biggerArray[index] = foodListSoFar[index];

                foodListSoFar = biggerArray;
            } // if

            // Store the new item and count it.
            foodListSoFar[noOfItemsSoFar] = latestFood;
            noOfItemsSoFar++;

        } // while

        noOfFoodItems = noOfItemsSoFar;
        foodList = foodListSoFar;

    } // FoodList

    // Find the food object corresponding to foodNameToFind
    // or return null if not found.
    public Food findFood(String foodNameToFind)
    {
        int foodIndex = 0;
        while (foodIndex < noOfFoodItems
                && ! foodList[foodIndex].getName().equals(foodNameToFind))
            foodIndex++;
        if(foodIndex == noOfFoodItems)
            return null;
        else
            return foodList[foodIndex];
    } // findFood
} // class FoodList
