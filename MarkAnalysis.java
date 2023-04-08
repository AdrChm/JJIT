// Program to produce scores comparison of given number of marks
// (assuming there is one mark per person, thus compare students)
// Marks number must be positive (more than 0) otherwise message is displayed
import java.util.Scanner;

public class MarkAnalysis {

    public static void main(String[] args) {

        // A scanner for getting data from the user.
        Scanner inputScanner = new Scanner(System.in);

        // Number of marks.
        System.out.print("Enter the number of students: ");
        int numberOfStudents = inputScanner.nextInt();

        // Skip past the end of that line.
        inputScanner.nextLine();

        if(numberOfStudents > 0) {

            // Obtaining data for each student and calculating sum of marks.
            int sumOfMarks = 0;
            Student [] students = new Student[numberOfStudents];

            for (int studentCount = 1; studentCount <= numberOfStudents; studentCount++)
            {
                System.out.print("Enter the name of the student " + studentCount + ": ");
                String name = inputScanner.nextLine();
                System.out.print("Enter the mark for '" + name + "': ");
                int mark = inputScanner.nextInt();

                students [studentCount - 1] = new Student(name, mark);
                sumOfMarks += mark;

                // Skip past the end of that line.
                inputScanner.nextLine();
            } // for

            // Getting max and min value
            mergeSort(students);
            int maxMark = students[numberOfStudents - 1].getMark();
            int minMark = students[0].getMark();

            double meanMark = sumOfMarks/ (double) numberOfStudents;

            // Final report.
            System.out.println();
            System.out.println("The mean mark is : " + meanMark);
            System.out.println("The minimum mark is: " + minMark);
            System.out.println("The maximum mark is: " + maxMark);
            System.out.println();

            System.out.println("Person | Score | difference from mean");
            for (int index = 0; index < numberOfStudents; index++)
                System.out.printf("%s | %6.2f%n", students[index].toString("mark"), students[index].getMark() - meanMark);

        } // if
        else // Wrong number of marks is entered
            System.out.println("Given number of marks is invalid. Data will not be processed");

    } // main

    // For this task I decided to use merge sort as it seems to be one of the most reasonable algorithms.
    public static void mergeSort(Student [] anArray)
    {

        // Divides array until there is one element.
       if(anArray.length < 2)
            return; // Nothing to be done here continue.

        Student[] firstHalfArray = new Student[anArray.length /2];
        Student[] secondHalfArray = new Student[anArray.length - firstHalfArray.length];

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
    public static void merge(Student[] array1, Student[] array2 ,Student[] mergedArray)
    {
        int array1Index = 0, array2Index = 0, mergedArrayIndex = 0;
        while (array1Index < array1.length && array2Index < array2.length)
        {
            if(array1[array1Index].compareTo(array2[array2Index]) <= 0)
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

} // class MarkAnalysis
