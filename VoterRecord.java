import java.util.LinkedList;

// Represents single element of HashMap for DuplicateVotes class,
// (which personally I find to be unnecessary).
public class VoterRecord
{
    // Data of the voter.
    private final String voterData;

    // Time and location of voting.
    private LinkedList<String> votingTimesAndLocations = new LinkedList<String>();

    // Constructor
    public VoterRecord(String voterData)
    {
        this.voterData = voterData;
    } // VoterRecord

    // Returns data of the voter.
    public String getVoterData()
    {
        return voterData;
    }

    // Adds vote time and location to the linkedList.
    public void addVote(String timeAndLocation)
    {
        votingTimesAndLocations.add(timeAndLocation);
    } // addVote

    // Returns amount of times the votes has voted.
    public int numberOfVotes()
    {
        return votingTimesAndLocations.size();
    }

    // Returns VoterRecord string representation listing all voting times and locations.
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder(voterData + '\n');

        for(String timeAndLocation: votingTimesAndLocations)
            stringBuilder.append('\t').append(timeAndLocation).append('\n');

        return stringBuilder.toString();

    } // toString

} //  class VoterRecord
