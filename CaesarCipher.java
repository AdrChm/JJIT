/**
 * This class implements a Caesar cipher with a fixed shift
 * specified per object at construction time. Cipher objects can
 * then translate a String or a single character as required.
 *
 * @author Johnatan Latham
 */
public class CaesarCipher {
    // Ths shift value for a cipher. This must be 0..25.
    private final int cipherShift;

    /**
     * Constructs a cipher with the given shift.
     * Any value outside the range 0 to 25 is converted using modulo 26.
     *
     * @param requiredCipherShift The shift to be used for this cipher.
     */
    public CaesarCipher(int requiredCipherShift)
    {
        // We store only modulo 26 of the shift,
        // as we only shift 26 letters.
        // The following converts negative numbers into the equivalent
        // non-negative one, e.g. -1 becomes 25.
        cipherShift = (requiredCipherShift % 26 + 26) % 26;
    } // CaesarCipher

    /**
     * Yields the cipher shift of this cipher.
     *
     * @return The shift used for this cipher.
     */
    public int getCipherShift()
    {
        return cipherShift;
    } // getCipherShift

    /**
     * Constructs a new CaesarCipher with a cipher shift which is one
     * greater (modulo 26) than that used for this cipher.
     *
     * @return The new CaesarCipher.
     */
    public CaesarCipher incrementShift()
    {
        return new CaesarCipher(cipherShift + 1);
    } // incrementShift

    /**
     * Constructs a new CaesarCipher with a cipher shift which is one
     * less (modulo 26) than that used for this cipher.
     *
     * @return The new CaesarCipher.
     */
    public CaesarCipher decrementShift()
    {
        return new CaesarCipher(cipherShift - 1);
    } // decrementShift
    /**
     * Translates a string.
     *
     * @param
     *
     * @return
     */
    public String translate(String message)
    {
        StringBuffer result = new StringBuffer();
        for (int index = 0; index < message.length(); index++)
            result.append(translate(message.charAt(index)));
        return result.toString();
    } // translate
    /**
     * Translates a single character.
     * If it is a letter it is shifted within its alphabet
     * (i.e. upper or lower case).
     * If it is not a letter, it is returned unchanged.
     *
     * @param aChar message The character to be translated.
     * @return The translated character.
     */
    public char translate(char aChar)
    {
        if (aChar >= 'A' && aChar <=  'Z')
        {
            int letterNo = (int) aChar - (int) 'A';
            letterNo = (letterNo + cipherShift) % 26;
            return (char) (letterNo + (int) 'A');
        } // if
        else if(aChar >= 'a' && aChar <=  'z')
        {
            int letterNo = (int) aChar - (int) 'a';
            letterNo = (letterNo + cipherShift) % 26;
            return (char) (letterNo + (int) 'a');
        } // else if
        else
            return aChar;
    } // translate
} // class CaesarCipher
