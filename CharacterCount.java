import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

// Program to count the number of characters on the standard input
// and report it in the standard output.
// Each character that occurs at least once is listed with its own count.
public class CharacterCount
{
    public static void main(String[] args)
    {
        // There are only 65536 different character values (two bytes).
        // Default initial values will be zero, which is what we want.
        int [] characterCountSoFar = new int[65536];

        // We will read the input as characters.
        InputStreamReader input = new InputStreamReader(System.in);

        // The total number of bytes found so far.
        int allCharactersCountSoFar = 0;
        try
        {
            int currentCharacter;
            while ((currentCharacter = input.read()) != -1 ) {
                allCharactersCountSoFar++;
                characterCountSoFar[currentCharacter]++;
            } // while
        } // try
        catch (IOException exception)
        {
            System.err.println(exception);
        } // catch
        finally
        {
            try
            {
                input.close();
            } // try
            catch (IOException exception)
            {
                System.err.println("Could not close input " + exception);
            } // catch
        } // finally

        // Report results.
        System.out.println("The number of characters read was " + allCharactersCountSoFar);
        for (int characterValue = 0; characterValue <= 65535; characterValue++)
            if(characterCountSoFar[characterValue] != 0)
                System.out.println("Character value " + characterValue + " occurred "
                                    + characterCountSoFar[characterValue] + " times");
    } // main

} // class CharacterCount
