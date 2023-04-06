import java.util.Scanner;
import java.io.File;

/*  Program to print out PhoneCall details from file,
    which name is an argument entered by the user.

    Subsequent input argument are phone number prefixes,
    based of which given file will be searched and
    the table containing search results will be displayed.
 */
public class PhoneCalls
{
    private static PhoneCallList callList;

    public static void main(String[] args) throws Exception
    {
        callList = new PhoneCallList(new Scanner(new File(args[0])));
        Scanner inputScanner = new Scanner(System.in);
        String userInput;
        do
        {
            System.out.println("Enter the phone number prefix, or Q to quit: ");
            userInput = inputScanner.nextLine();
            if(!userInput.equals("Q"))
                System.out.println(callList.matchCallsReport(userInput));
        } while(!userInput.equals("Q"));
    } // main
} // class PhoneCalls
