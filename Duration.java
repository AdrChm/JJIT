// Representation of a time duration.
public class Duration
{
    // represented as hh:mm:ss string and as total seconds.
    private final String stringRep;
    private final int totalSeconds;

    // Construct from a hh:mm:ss string.
    public Duration(String requiredStringRep)
    {
        stringRep = requiredStringRep;
        String[] parts = requiredStringRep.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2]);
        totalSeconds = (hours * 60 + minutes) * 60 + seconds;
    } // Duration

    // Construct from a total number of seconds.

    public Duration(int requiredNoOfSeconds)
    {
        totalSeconds = requiredNoOfSeconds;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        stringRep = String.format("%02d:%02d:%02d", hours, minutes, seconds);
    } // Duration

    // Returns the hh:mm:ss representation.
    public String toString()
    {
        return stringRep;
    } // toString

    // Adds this to another to create a new.
    public Duration add(Duration other)
    {
        return new Duration(totalSeconds + other.totalSeconds);
    } // add

} // class Duration