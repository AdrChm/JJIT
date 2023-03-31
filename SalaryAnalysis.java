import java.util.Scanner;

/* This program analyses integer salaries entered by the user.
   It outputs each salary together with its difference from the
   mean of the salaries. There must be at least one salary.

 */
public class SalaryAnalysis {

    public static void main(String[] args) {

        // A scanner for getting data from the user.
        Scanner salariesScanner = new Scanner(System.in);

        System.out.print("Enter the number of salaries: ");
        int numberOfSalaries = salariesScanner.nextInt();

        // Salaries are ints stored in the array.
        int[] salaries = new int[numberOfSalaries];

        // Obtain salaries for the input and compute the sum of the salaries.
        int sumOfSalaries = 0;
        for (int index = 0; index < numberOfSalaries; index++)
        {
            System.out.print("Enter salary # " + (index + 1) + ": ");
            salaries[index] = salariesScanner.nextInt();
            sumOfSalaries += salaries[index];
        } // for

        // Compute the mean, which is double not an integer.
        double meanSalary = sumOfSalaries / (double)numberOfSalaries;

        // But we also want to round it to simplify the results.
        int meanSalaryRounded = (int) Math.round(meanSalary);

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
                              (index+1), salaries[index],
                              Math.abs(differenceFromMean), comparisonToMean);
        } // for

    } // main



} // class SalaryAnalysis
