import java.util.regex.Pattern;
import java.util.regex.Matcher;

// Representation of a phone call
// together with its duration and its cost.
public class PhoneCall
{
    // Phone number representation.
    private final String phoneNumber;

    // Duration of the call.
    private final Duration duration;

    // Cost of this call.
    private final double cost;

    // Date and time this call took place.
    private final Date date;
    private final Time time;
    public PhoneCall(String fileRecord) throws Exception
    {
        String [] phoneCallElements = fileRecord.split("\t+");
        String [] phoneNumberSections = phoneCallElements[0].split("\\W?\\.?\\-?");
        StringBuilder tempPhoneNumber = new StringBuilder();
        for (String subString: phoneNumberSections)
            tempPhoneNumber.append(subString);

        phoneNumber = tempPhoneNumber.toString();
        duration = new Duration(phoneCallElements[1]);
        cost = Double.parseDouble(phoneCallElements[2]);

        String [] dateTimeComponents = phoneCallElements[3].split("\\W");
        date = new Date(Integer.parseInt(dateTimeComponents[0]), Integer.parseInt(dateTimeComponents[1]), Integer.parseInt(dateTimeComponents[2]));
        time = new Time(Integer.parseInt(dateTimeComponents[3]), Integer.parseInt(dateTimeComponents[4]), Integer.parseInt(dateTimeComponents[5]));

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

            return phoneNumber.toString();
        } // if

        return "Invalid User Input";

    } // convertToPhoneNumber

    // Accessor for phone call duration.
    public Duration getDuration()
    {
        return duration;
    } // getCallDuration

    // Accessor for phone call cost.
    public double getCost()
    {
        return cost;
    } // getCost

    // String representation of the phone call.
    public String toString()
    {
        return String.format( "%-15s\t%s\t%1.2f\t%s\s%s",phoneNumber, duration, cost, date, time);
    } // toString

} // class PhoneCall

