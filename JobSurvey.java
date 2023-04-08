import java.util.Scanner;
import java.io.File;

/* Program to report jobs and their salaries.
   Each command line argument is the name of a text file containing:
     The first line is a name or description of the jobs.
     Subsequent lines describe one job, in the format:
       Employer (including spaces but not tabs) <TAB> salary.
   Output is a reporter for each file containing:
     Name or description of the jobs, average salary
     Job details in name order and again in salary order.
 */
public class JobSurvey
{
    public static void main(String[] args) throws Exception
    {
        for (String fileName: args)
        {
            JobList jobList = new JobList(new Scanner(new File(fileName)));
            System.out.println(jobList);
            System.out.println();
        } // for
    } // main

} // class JobSurvey
