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

            // Processing each mark getting max and min value
            // as well as calculating sum of marks.
            int maxMark = 0;
            int minMark = 0;
            int sumOfMarks = 0;
            double meanMark = 0;

            int[] marks = new int[numberOfMarks];
            for (int index = 0; index < numberOfMarks; index++)
            {
                System.out.print("Enter mark # " + (index + 1) + ": ");
                marks[index] = inputScanner.nextInt();
                if(index > 0)
                {
                    // Updating min and max marks.
                    if(maxMark < marks[index])
                        maxMark = marks[index];
                    else if (minMark > marks[index])
                        minMark = marks[index];

                    sumOfMarks += marks[index];
                } // if
                else  // Assigning first mark.
                {
                    maxMark = marks[index];
                    minMark = marks[index];
                    sumOfMarks = marks[index];
                } // else
            } // for

            meanMark = sumOfMarks/ (double) numberOfMarks;

            // Final report.
            System.out.println();
            System.out.println("The mean mark is : " + meanMark);
            System.out.println("The minimum mark is: " + minMark);
            System.out.println("The maximum mark is: " + maxMark);
            System.out.println();

            System.out.println("Person | Score | difference from mean");
            for (int index = 0; index < numberOfMarks; index++)
                System.out.printf("%6d | %5d | %6.2f%n", index + 1, marks[index], (double)marks[index] - meanMark);

        } // if
        else // Wrong number of marks is entered
            System.out.println("Given number of marks is invalid. Data will not be processed");



    } // main
} // class MarkAnalysis
