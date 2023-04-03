// A class for representing a Job,
// comprising a firm's name and their typical salary.
public class Job {
    // The name of the film for this instance.
    private final String employer;

    // Their typical salary.
    private final int salary;

    // The constructor method.
    public Job(String requiredEmployer, int requiredSalary)
    {
        employer = requiredEmployer;
        salary = requiredSalary;
    } // public Job

    // Get the employer.
    public String getEmployer()
    {
        return employer;
    } // getEmployer

    // Get the salary.
    public int getSalary()
    {
        return salary;
    } // getSalary

    // Compare this Job with a given other,
    // basing the comparison on the salaries, then the employers.
    // Return -ve(<), 0(=) or +ve(>) int. -ve means this one is the smallest.
    public int compareTo(Job other)
    {
        if(salary == other.salary)
            return employer.compareTo(other.employer);
        else
            return salary - other.salary;
    } // compareTo

    // Return a string representation.
    public String toString(){
        return String.format("%-15s pays %5d", employer, salary);
    } // toString

} //  class Job
