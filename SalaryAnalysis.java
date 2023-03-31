import java.util.Scanner;

/* This program analyses integer salaries entered by the user.
   It outputs each salary together with its difference from the
   mean of the salaries. There must be at least one salary.
    The salaries are output in ascending order.
 */
public class SalaryAnalysis {

    public static void main(String[] args) {

        // A scanner for getting data from the user.
        Scanner salariesScanner = new Scanner(System.in);

        System.out.print("Enter the number of salaries: ");
        int numberOfSalaries = salariesScanner.nextInt();

        // Salaries are ints stored in the array.
        int[] salaries = new int[numberOfSalaries];
        int[] people = new int[numberOfSalaries];
        //Obtain salaries for the input and compute the sum of the salaries.
        for (int index = 0; index < numberOfSalaries; index++)
        {
            System.out.print("Enter salary # " + (index + 1) + ": ");
            salaries[index] = salariesScanner.nextInt();
            people[index] = salaries[index];
        } // for

        // Now we compute the sum of the salaries.
        int sumOfSalaries = 0;
        for (int salary: salaries)
            sumOfSalaries += salary;

        // Compute the mean, which is double not an integer.
        double meanSalary = sumOfSalaries / (double)numberOfSalaries;

        // But we also want to round it to simplify the results.
        int meanSalaryRounded = (int) Math.round(meanSalary);

        // Sort the salaries into ascending order.
        sort(salaries);

        // Produce the result.
        System.out.println();
        System.out.println("The mean salary is:\t" + meanSalary);
        System.out.println("Which round to:\t" + meanSalaryRounded);
        System.out.println();

        for (int index = 0; index < numberOfSalaries; index++)
        {
            int differenceFromMean = salaries[index] - meanSalaryRounded;
            String comparisonToMean = differenceFromMean == 0
                                      ? "zero difference from"
                                      : (differenceFromMean < 0
                                        ? "less than" : "greater than");
            System.out.printf("Person %2d earns %5d , which is %5d %s the mean%n",
                    findArrayIndex(people, salaries[index]) + 1, salaries[index],
                              Math.abs(differenceFromMean), comparisonToMean);
        } // for

    } // main

    // Coffee 14.3.5 solving index problem, without changing sort method.
    // Coping reference doesn't work so, values must be copied.
    // Compare arrays elements to adjust index values.
    // Private helper method to find index of given array based on given value
    private static int findArrayIndex(int[] anArray, int searchedValue)
    {

        for (int index = 0; index < anArray.length; index++)
        {
            if (anArray[index] == searchedValue)
                return index;
        } // for

        // return -1 if value was not found
            return -1;

    } // findArrayIndex

    // Sort a given array of int into ascending order.
    public static void sort(int [] anArray)
    {
        // Each pass of the sort reduces unsortedLength by one.
        int unsortedLength = anArray.length;
        // If no change is made on a pass, the main loop can stop.
        boolean changedOnThisPass;
        do
        {
            changedOnThisPass = false;
            for (int pairLeftIndex = 0;
                 pairLeftIndex < unsortedLength - 1; pairLeftIndex++)
                if(anArray[pairLeftIndex] > anArray[pairLeftIndex + 1])
                {
                    int thatWasAtPairLeftIndex = anArray[pairLeftIndex];
                    anArray[pairLeftIndex] = anArray[pairLeftIndex + 1];
                    anArray[pairLeftIndex + 1] = thatWasAtPairLeftIndex;
                    changedOnThisPass = true;
                } // if
            unsortedLength--;
        } while (changedOnThisPass);
    } // sort

} // class SalaryAnalysis
