// This class represents calendar dates and provides certain
// manipulations of them.
public class Time {

    // Instance variables: hours, minutes and seconds of a date.
    private final int hours, minutes, seconds;

    // Construct a time -- given the required hours, minutes and seconds.
    public Time(int hours, int minutes, int seconds)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    } // Time

    // Construct a time -- given the required string representation
    // in format hh<\W>mm<\W>ss, where
    // <\W> means any character not being character, nor digit.
    public Time(String requiredFormat)
    {
        String [] dateTimeComponents = requiredFormat.split("\\W");
        hours = Integer.parseInt(dateTimeComponents[0]);
        minutes = Integer.parseInt(dateTimeComponents[1]);
        seconds = Integer.parseInt(dateTimeComponents[2]);

    } // Time

    // Provides the hour:minute:second representation of this time.
    public String toString()
    {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    } // toString

} // class Time
