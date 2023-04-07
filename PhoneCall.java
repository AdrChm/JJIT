import java.util.regex.Pattern;
import java.util.regex.Matcher;

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
        String [] phoneNumberSections = phoneCallElements[0].split("\\W?\\.?\\-?");
        StringBuilder tempPhoneNumber = new StringBuilder();
        for (String subString: phoneNumberSections)
            tempPhoneNumber.append(subString);

        phoneNumber = tempPhoneNumber.toString();
        callDuration = new Duration(phoneCallElements[1]);
        callCost = Double.parseDouble(phoneCallElements[2]);
    } // PhoneCall

    // Returns boolean information, if given string is matches this phone number.
    public boolean isMatching(String searchedValue)
    {
        // Verification of given input
        searchedValue = convertToPhoneNumber(searchedValue);

        return phoneNumber.startsWith(searchedValue);

    } // isMatching

    // Helper method to check validity of the user input and return phone number to be searched
    private String convertToPhoneNumber(String userInput)
    {
        // General pattern for phone number.
        Pattern pattern = Pattern.compile("\\+?\\(?\\.?\\W?(\\d{0,10})\\)?-?\\.?\\W?(\\d{0,10})-?\\.?\\W?(\\d{0,10})-?\\.?\\W?(\\d{0,10})");
        Matcher matcher = pattern.matcher(userInput);
        // If input is actual phone number or its prefix.
        if (matcher.matches())
        {
            StringBuilder phoneNumber = new StringBuilder();

            // Creates phone number by appending found digit groups.
            for (int index = 1; index <= matcher.groupCount(); index++)
            {
                if(matcher.group(index) != null)
                    phoneNumber.append(matcher.group(index));

            } // for
            //System.out.println("build number: " + phoneNumber.toString());
            return phoneNumber.toString();
        } // if

        return "Invalid User Input";

    } // convertToPhoneNumber

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

