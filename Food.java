// Representation of a food, as a name
// together with nutritional data in grams per kilogram.
public class Food
{
    // This defines the spelling and order of nutritional components.
    public static final String [] NUTRITIONAL_COMPONENTS
                        = {"Protein", "Carb", "Fat", "Fibre", "Sodium"};

    // The name of this food.
    private final String name;

    // Nutritional data in the same order as NUTRITIONAL_COMPONENTS.
    private final int[] nutrientGramsPerKilogram = new int[NUTRITIONAL_COMPONENTS.length];

    // Constructor is given name and data as tab separated parts of a string.
    public Food(String details)
    {
        String [] detailParts = details.split("\t+");
        name = detailParts[0];
        for (int index = 0; index < NUTRITIONAL_COMPONENTS.length; index++)
            nutrientGramsPerKilogram[index] = Integer.parseInt(detailParts[index + 1]);
    } // Food

    // Accessor for name.
    public String getName()
    {
        return name;
    } // getName

    // Returns the number of milligrams of each component.
    // For the given number of grams consumed.
    public int[] componentMilliGramsForWeight (int grams)
    {
        int [] result = new int[NUTRITIONAL_COMPONENTS.length];
        for (int index = 0; index < NUTRITIONAL_COMPONENTS.length; index++)
            result[index] = nutrientGramsPerKilogram[index] * grams;

        return result;
    } // componentMilliGramsForWeight

} //  class Food
