// Program to produce scores comparison of given number of marks
// (assuming there is one mark per person, thus compare students)
// Marks number must be positive (more than 0) otherwise message is displayed
import java.util.Scanner;

public class MarkAnalysis {

    public static void main(String[] args) {

        // Getting arguments.
        Scanner inputScanner = new Scanner(System.in);

        // Number of marks.
        System.out.print("Enter the number of marks: ");
        int numberOfMarks = inputScanner.nextInt();

        if(numberOfMarks > 0) {

            // Processing each mark and calculating sum of marks.
            int sumOfMarks = 0;
            int[] students = new int[numberOfMarks];
            int[] marks = new int[numberOfMarks];

            for (int index = 0; index < numberOfMarks; index++)
            {
                System.out.print("Enter mark # " + (index + 1) + ": ");
                marks[index] = inputScanner.nextInt();
                students[index] = marks[index];
                sumOfMarks += marks[index];

            } // for

            // Getting max and min value
            mergeSort(marks);
            int maxMark = marks[marks.length - 1];
            int minMark = marks[0];

            double meanMark = sumOfMarks/ (double) numberOfMarks;

            // Final report.
            System.out.println();
            System.out.println("The mean mark is : " + meanMark);
            System.out.println("The minimum mark is: " + minMark);
            System.out.println("The maximum mark is: " + maxMark);
            System.out.println();

            System.out.println("Person | Score | difference from mean");
            for (int index = 0; index < numberOfMarks; index++)
                System.out.printf("%6d | %5d | %6.2f%n", findArrayIndex(students, marks[index]) + 1, marks[index], (double)marks[index] - meanMark);

        } // if
        else // Wrong number of marks is entered
            System.out.println("Given number of marks is invalid. Data will not be processed");

    } // main

    // For this task I decided to use merge sort as it seems to be one of the most reasonable algorithms.
    public static void mergeSort(int [] anArray)
    {
        // Divides array until there is one element.
       if(anArray.length < 2)
            return; // Nothing to be done here continue.

        int[] firstHalfArray = new int[anArray.length /2];
        int[] secondHalfArray = new int[anArray.length - firstHalfArray.length];

        // Filling the elements for first and then second sub array.
        for (int index = 0; index < firstHalfArray.length; index++)
            firstHalfArray[index] = anArray[index];

        for (int index = 0; index < secondHalfArray.length; index++)
            secondHalfArray[index] = anArray[index + firstHalfArray.length];

        mergeSort(firstHalfArray);
        mergeSort(secondHalfArray);
        merge(firstHalfArray,secondHalfArray, anArray);

    } // mergeSort

    // Private helper method to sort merge sorted arrays.
    public static void merge(int[] array1, int[] array2 ,int[] mergedArray)
    {
        int array1Index = 0, array2Index = 0, mergedArrayIndex = 0;
        while (array1Index < array1.length && array2Index < array2.length)
        {
            if(array1[array1Index] <= array2[array2Index])
            {
                mergedArray[mergedArrayIndex] = array1[array1Index];
                array1Index++;
            } // if
            else
            {
                mergedArray[mergedArrayIndex] = array2[array2Index];
                array2Index++;
            } // else
            mergedArrayIndex++;
        } // while

        // Filing remaining part
        while (array1Index < array1.length){
            mergedArray[mergedArrayIndex] = array1[array1Index];
            array1Index++;
            mergedArrayIndex++;
        } // while

        while (array2Index < array2.length){
            mergedArray[mergedArrayIndex] = array2[array2Index];
            array2Index++;
            mergedArrayIndex++;
        } // while

    } // merge

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

} // class MarkAnalysis
