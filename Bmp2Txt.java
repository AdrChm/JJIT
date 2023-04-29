import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Simple program to produce a text version of a 24 bit BMP format image file.
// The first argument is the desired text width, the second is the height.
// The third argument is the name of BMP file.
// The text image is produced on the standard output.
public class Bmp2Txt
{
    // The characters used for the text image.
    // The first is used for the darkest pixels,
    // the second for the next lightest, and so on.
    // A good choice will depend on the font in use on the output.
    // (We should reverse the order when using white print on black.)
    private static final String SHADES_STRING = "#@*+. ";

    // The above is for convenient editing if we want to alter the
    // characters used. This next array is actually used to
    // map a selected brightness on to a text character.
    private static final char[] SHADES_CHARS = SHADES_STRING.toCharArray();

    // The bytes from the input image.
    private static FileInputStream inputImage;

    // The width and height of the input image.
    private static int inputWidth, inputHeight;

    // The width and height of the desired text image.
    private static int outputWidth, outputHeight;

    // Our output image will be stored in this 2D array.
    // Positions 0,0 is bottom left.
    // Each pixel records the monochrome brightness level.
    private static int[][] outputImage;

    // Read a single byte from the input image file
    // and throw an exception if there is none left!
    private static int readByte() throws IOException
    {
        int result = inputImage.read();
        if (result == -1)
            throw new IOException("Unexpected end of file");
        return result;
    } // readByte

    // Skip irrelevant bytes from the input image file.
    private static void skipIrrelevantBytes(int skipCount) throws IOException
    {
        for (int count = 1; count <= skipCount ; count++)
            readByte();
    } // skipIrrelevantBytes

    // Read an int form the next four bytes in the input image file.
    // Least significant byte is first.
    private static int readInt() throws IOException
    {
        return readByte() | readByte() << 8 | readByte() << 16 | readByte() << 24;
    } // readInt

    // Read a pixel value from the input file and return its brightness.
    // The pixel is stored as 3 bytes for RGB.
    // Compute the brightness as (R*299 + G*487 + B*114)/1000.
    private static int readPixelBrightness() throws IOException
    {
        int red = readByte();
        int green = readByte();
        int blue = readByte();
        return (red * 299 + green * 587 + blue * 114) / 1000;
    } // readPixelBrightness

    // Read the image from the input file and scale into the output array.
    private static void readImage() throws IOException
    {
        // The first row of input pixels is the bottom of the image.
        // I.e., in a BMP file, position 0,0 is bottom left.
        for (int inputY = 0; inputY < inputHeight; inputY++)
        {
            for (int inputX = 0; inputX < inputWidth; inputX++)
            {
                int pixelValue = readPixelBrightness();
                // This pixel address needs to be scaled to fit output image.
                int outputX = inputX * outputWidth / inputWidth;
                int outputY = inputY * outputHeight / inputHeight;
                // Add the input pixel value to the output pixel,
                outputImage[outputX][outputY] += pixelValue;
            } // for
            // Each row of the input image is zero padded to a multiplication of 4 bytes.
            skipIrrelevantBytes(inputWidth % 4);
        } // for
    } // readImage

    // Find the highest value pixel in the output image.
    private static int maxOutputBrightness()
    {
        int maxBrightnessSoFar = 0;
        for (int y = 0; y < outputHeight; y++)
            for (int x = 0; x < outputWidth; x++)
                if(outputImage[x][y] > maxBrightnessSoFar)
                    maxBrightnessSoFar = outputImage[x][y];

        return maxBrightnessSoFar;
    } // maxOutputBrightness

    // Write the text image to standard output.
    private static void writeTextImage()
    {
        int maxBrightness = maxOutputBrightness();
        // Scale each pixel brightness to one of the SHADE_CHARS.
        for (int y = outputHeight - 1; y >= 0; y--)
        {
            for (int x = 0; x < outputWidth; x++)
                System.out.print(SHADES_CHARS[outputImage[x][y] * SHADES_CHARS.length / (maxBrightness + 1)]);
            System.out.println();
        } // for
    } // writeTextImage

    // The main method gets arguments and parses each the image file at the top level.
    public static void main(String[] args)
    {
        // The name of the input image file, which must be in 24 bit BMP format.
        String filename = null;
        try
        {
            // Check we have three arguments.
            if(args.length != 3)
                // Caught below.
                throw new IllegalArgumentException();

            // The first two command line arguments
            // are the required width and height of the text image.
            outputWidth = Integer.parseInt(args[0]);
            outputHeight = Integer.parseInt(args[1]);
            outputImage = new int[outputWidth][outputHeight];

            // The third argument is the original BMP image file name.
            filename = args[2];
            inputImage = new FileInputStream(filename);

            skipIrrelevantBytes(18);
            inputWidth = readInt();
            inputHeight = readInt();
            skipIrrelevantBytes(28);
            readImage();

            // Check end of file.
            if(inputImage.read() != -1)
               throw new IOException("Data after end of image");

            writeTextImage();

        } // try
        catch (NumberFormatException exception)
        {
            System.err.println("Supplied dimension is not a number "
                                + exception.getMessage());
        } // catch
        catch (IllegalArgumentException exception)
        {
            System.err.println("Please (only) supply: width height filename");
        } // catch
        catch (FileNotFoundException exception)
        {
            System.err.println("Cannot open image file " + filename);
        } // catch
        catch (IOException exception)
        {
            System.err.println("Problem reading image file: "
                                + exception.getMessage());
        } // catch
        finally
        {
            try
            {
                if(inputImage != null)
                    inputImage.close();
            } // try
            catch (IOException exception)
            {
                System.err.println("Could not close image file " + exception);
            } // catch
        } // finally

    } // main

} // class Bmp2Txt
