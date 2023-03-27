/* Program to encode / decode a message using a Caesar cipher.

   The shift for the cipher is given as the first command line argument. The
   message is given as the second command line argument.

   The message is translated by two ciphers, one with the given shift and the
   other with the negation of the given shift. The first is thus an encoding
   of the message, the second is a decoding. Both messages are printed on the
   standard output.
 */
public class Crypt {
    public static void main(String[] args) {
        int shift = Integer.parseInt(args[0]);
        String message = args[1];
        CaesarCipher encoder = new CaesarCipher(shift);
        CaesarCipher decoder = new CaesarCipher(-shift);

        System.out.println(encoder.translate(message));
        System.out.println(decoder.translate(message));
    } // main

} // class Crypt
