import java.util.Scanner;

/* A JobList holds a list of Job objects, the data for which is read from a
   Scanner passed on to the construction. It sorts these by employer and salary.
   The toString method returns a String showing both lists.
 */
public class JobList
{
    // The description of this JobList.
    private final String description;

    // The number of Jobs.
    private int noOfJobs;

    // The jobs in original order.
    // The only first 0 to noOfJobs - 1 indices are used.
    private Job[] jobsInOriginalOrder;

    // The jobs in ascending order by employer name.
    private final Job[] jobsSortedByEmployer;

    // The jobs in ascending order by salary.
    private final Job[] jobsSortedBySalary;

    // The mean and rounded mean salary.
    private final double meanSalary;
    private final int meanSalaryRounded;

    // The constructor is given a Scanner from which to read
    //  the description of the JobList
    //  and then the job data.
    public JobList(Scanner scanner)
    {
        description = scanner.nextLine();
        readJobsInOriginalOrder(scanner);

        // Copy the jobs into two arrays.
        jobsSortedByEmployer = copyJobArray(jobsInOriginalOrder, noOfJobs);
        jobsSortedBySalary = copyJobArray(jobsInOriginalOrder, noOfJobs);

        // Sort each array into its correct order.
        sort(jobsSortedByEmployer,Job.SortOrder.BY_EMPLOYER);
        sort(jobsSortedBySalary, Job.SortOrder.BY_SALARY);

        // Now compute the sum of salaries.
        int sumOfSalaries = 0;
        for(Job job: jobsSortedBySalary)
            sumOfSalaries += job.getSalary();

        // Compute the mean, which is a double, not an integer.
        meanSalary = sumOfSalaries / (double) noOfJobs;

        // But we also want to round it to simplify the results.
        meanSalaryRounded = (int) Math.round(meanSalary);
    } // JobList

    // Initial size of the readJobsInOriginalOrder array.
    private static final int INITIAL_ARRAY_SIZE = 2;

    // When readJobsInOriginalOrder is full, we extend it by this factor.
    private static final int ARRAY_RESIZE_FACTOR = 2;

    // Read job data from the given Scanner, count them using noOfJobs,
    // and store in jobsInOriginalOrder -- extending as required;
    private void readJobsInOriginalOrder(Scanner scanner)
    {
        jobsInOriginalOrder = new Job [INITIAL_ARRAY_SIZE];
        noOfJobs = 0;
        while (scanner.hasNextLine())
        {

            // Obtain the next Job.
            Job currentJob = readOneJob(scanner);
            // Extend the array if it is too small.
            if(noOfJobs == jobsInOriginalOrder.length)
            {
                Job [] biggerArray = new Job[jobsInOriginalOrder.length * ARRAY_RESIZE_FACTOR];
                for (int index = 0; index < jobsInOriginalOrder.length; index++)
                    biggerArray[index] = jobsInOriginalOrder[index];
                jobsInOriginalOrder = biggerArray;
            } // if
            // Finally store the Job and update noOfJobs.
            jobsInOriginalOrder[noOfJobs] = currentJob;
            noOfJobs++;
        } // while
    } // readJobsInOriginalOrder

    // Read one line of the text from the Scanner,
    // split it into employer name <TAB> salary,
    // create a corresponding Job and return it.
    private Job readOneJob(Scanner scanner)
    {
        String [] jobData = scanner.nextLine().split("\t");
        return new Job(jobData[0], Integer.parseInt(jobData[1]));
    } // readOneJob

    // Return a shallow copy of given source,
    // but only the first dataLength elements.
    private Job[] copyJobArray(Job[] source, int dataLength)
    {
        Job [] result = new Job[dataLength];
        for (int index = 0; index < dataLength; index++)
            result[index] = source[index];
        return result;
    } // copyJobArray

    // Sort the given array of jobs.
    // using compareTo on the Job objects with the given sortOrder.
    private void sort(Job[] anArray, Job.SortOrder sortOder)
    {
        // Each pass of sort reduces the unsortedLength by one.
        int unsortedLength = anArray.length;
        // If no change is made on a pass, the main loop can stop.
        boolean changeOnThisPass;
        do {
            changeOnThisPass = false;

            for (int pairLeftIndex = 0; pairLeftIndex < unsortedLength - 1; pairLeftIndex++)
                if(anArray[pairLeftIndex].compareTo(anArray[pairLeftIndex + 1],sortOder)  > 0)
                {
                    Job thatWasAPairLeftIndex = anArray[pairLeftIndex];
                    anArray[pairLeftIndex] = anArray[pairLeftIndex + 1];
                    anArray[pairLeftIndex + 1] = thatWasAPairLeftIndex;
                    changeOnThisPass = true;
                } // if

            unsortedLength--;

        } while (changeOnThisPass);
    } // sort

    // Return job details sorted by employer name and then salary.
    public String toString()
    {
        return String.format("Job list: %s\tAverage: %f%n%n"
                            + "Sorted by employer%s%n%nSorted by salary%s",
                            description, meanSalary,
                            listOneJobArray(jobsSortedByEmployer),
                            listOneJobArray(jobsSortedBySalary));
    } // toString

    // Helper method for toString.
    private String listOneJobArray(Job[] jobArray)
    {
        StringBuffer result = new StringBuffer("");
        for (Job job: jobArray) {
            int differenceFromMean = job.getSalary() - meanSalaryRounded;
            String comparisonToMean = differenceFromMean == 0
                                      ? "zero difference from"
                                      : (differenceFromMean < 0
                                        ? "less than" : "greater than");
            result.append(String.format("%n%s, which is %5d %s the mean",
                                   job, Math.abs(differenceFromMean), comparisonToMean));
        } // for
        return result.toString();
    } // listOneJobArray

} // class JobList
