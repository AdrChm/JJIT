// Representation of a phone call
// together with its duration and its cost.
public class PhoneCall
{
    // Phone number representation.
    private final String phoneNumber;

    // Duration of the call.
    private final Duration callDuration;

    // Cost of this call.
    private final double callCost;

    public PhoneCall(String fileRecord)
    {
        String [] phoneCallElements = fileRecord.split("\t+");

        phoneNumber = phoneCallElements[0];
        callDuration = new Duration(phoneCallElements[1]);
        callCost = Double.parseDouble(phoneCallElements[2]);
    } // PhoneCall

    // Returns boolean information, if given string is prefix of this phone number.
    public boolean isPrefix(String searchedValue)
    {
        return phoneNumber.startsWith(searchedValue);
    } // isPrefix

    // Accessor for phone call duration.
    public Duration getCallDuration()
    {
        return callDuration;
    } // getCallDuration

    // Accessor for phone call cost.
    public double getCallCost()
    {
        return callCost;
    } // getCallCost

    // String representation of the phone call.
    public String toString()
    {
        return String.format( "%-15s\t%s\t%1.2f",phoneNumber,callDuration,callCost);
    } // toString

} // class PhoneCall

