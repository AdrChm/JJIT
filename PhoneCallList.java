import java.util.Scanner;

// Keeps list of phone calls and provides a search facility.
public class PhoneCallList
{
    // For array extension of PhoneCallList.
    private static final int INITIAL_ARRAY_SIZE = 10;
    private static final int ARRAY_RESIZE_FACTOR = 2;

    // Phone calls array elements amount.
    private final int noOfPhoneCallItems;

    // The call details.
    private final PhoneCall[] phoneCalls;

    // Constructor iterating thought subsequent records.
    public PhoneCallList(Scanner scanner)
    {
        int elementsAddedSoFar = 0;
        PhoneCall [] processedCalls = new PhoneCall[INITIAL_ARRAY_SIZE];

        while(scanner.hasNextLine())
        {
            // Extension of the array.
            if(processedCalls.length == elementsAddedSoFar)
            {
                PhoneCall [] upgradedArray = new PhoneCall[processedCalls.length * ARRAY_RESIZE_FACTOR];
                for (int index = 0; index < processedCalls.length; index++)
                    upgradedArray[index] = processedCalls[index];

                processedCalls = upgradedArray;
            } // if

            processedCalls[elementsAddedSoFar] = new PhoneCall(scanner.nextLine());
            elementsAddedSoFar++;
        } // while

        noOfPhoneCallItems = elementsAddedSoFar;
        phoneCalls = processedCalls;

    } // PhoneCallList

    // Find the PhoneCall objects corresponding to searchedValue.
    // Report lists all found records and produces summary:
    // number of matches found, total duration and cost of the calls.
    public String matchCallsReport(String searchedValue)
    {
        int matchesFound = 0;
        double totalCost = 0;
        Duration totalDuration = new Duration(0);
        StringBuilder result = new StringBuilder();

        for (int index = 0; index < noOfPhoneCallItems; index++)
            if(phoneCalls[index].isMatching(searchedValue))
            {
                result.append(phoneCalls[index]+"\n");
                totalCost += phoneCalls[index].getCallCost();
                totalDuration = totalDuration.add(phoneCalls[index].getCallDuration());
                matchesFound++;
            } // if

        result.append("\nCalls matched:\t").append(matchesFound);
        result.append("\nTotal duration:\t").append(totalDuration);
        result.append("\nTotal cost:\t").append(String.format("%1.2f",totalCost));

        return result.toString();
    } // matchCallsReport

} // class PhoneCallList
