import java.util.HashSet;
import java.util.Set;

// List all the prime numbers less than or equal to the command line arguments.
// (Warning: this program  does not catch RunTimeExceptions.)
public class Primes
{
    public static void main(String[] args)
    {
        // The maximum number we need to consider.
        int maxPossiblePrime = Integer.parseInt(args[0]);

        // The set of all multiplies of prime numbers found so far.
        // These are therefore not prime numbers.
        Set<Integer> multipleOfPrimesFound = new HashSet<Integer>();

        // Consider every number from 2 up to maximum,
        // it is a possible prime, output and count it if it is.
        int noOfPrimesFoundSoFar = 0;

        for (int possiblePrimeNumber = 2;
             possiblePrimeNumber <= maxPossiblePrime; possiblePrimeNumber++)
            if(! multipleOfPrimesFound.contains(possiblePrimeNumber))
        {
            // possiblePrimeNumber really is a prime number.
            noOfPrimesFoundSoFar++;
            System.out.println(noOfPrimesFoundSoFar + " : " + possiblePrimeNumber);
            // Now add multiplies of possiblePrimeNumber to multipliesOfPrimesFound.
            for (int primeMultiple = possiblePrimeNumber * 2;
                 primeMultiple <= maxPossiblePrime;
                 primeMultiple += possiblePrimeNumber)
                multipleOfPrimesFound.add(primeMultiple);
        } // if
    } // main

} // class Primes
