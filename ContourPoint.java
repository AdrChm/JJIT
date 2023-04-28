import java.io.*;

// Representation of a contour point with X,Y grid reference
// and height above sea level.
public class ContourPoint {
    // gridX and gridY are in the range 0-9999, so a short will do nicely.
    private final short gridX, gridY;

    // Height has a wider range, but int is plenty.
    private final int height;

    // Construct a ContourPoint with the given dimensions.
    public ContourPoint(int requiredGridX, int requiredGridY, int requiredhHight) {
        gridX = (short) requiredGridX;
        gridY = (short) requiredGridY;
        height = requiredhHight;
    } // ContourPoint

    // Construct a ContourPoint by reading the dimensions
    // from the given DataInputStream.
    public ContourPoint(DataInputStream in) throws IOException {
        gridX = in.readShort();
        gridY = in.readShort();
        height = in.readInt();
    } // ContourPoint

    // Write the three dimensions to a given DataOutputStream
    // so that it can be read back into the above constructor.
    public void write(DataOutputStream out) throws IOException {
        out.writeShort(gridX);
        out.writeShort(gridY);
        out.writeInt(height);
    } // write

    // Accessor for gridX.
    public short getGridX() {
        return gridX;
    } // getGridX

    // Accessor for gridX.
    public short getGridY() {
        return gridY;
    } // getGridY

    // Accessor for height.
    public int getHeight() {
        return height;
    } // getHeight

    // Linear interpolation between this and a given other point.
    public ContourPoint[] interpolate(ContourPoint endPoint, int noOfSteps) {
        ContourPoint[] result = new ContourPoint[noOfSteps];

        for (int stepCount = 1; stepCount <= noOfSteps; stepCount++) {
            short newGridX = (short) (gridX + stepCount * (endPoint.gridX - gridX)
                    / (noOfSteps + 1));
            short newGridY = (short) (gridY + stepCount * (endPoint.gridY - gridY)
                    / (noOfSteps + 1));
            // Cast stepCount to long, to avoid int overflow.
            int newHeight = (int) (height + (long) stepCount * (endPoint.height - height)
                    / (noOfSteps + 1));
            result[stepCount - 1] = new ContourPoint(newGridX, newGridY, newHeight);
        } // for
        return result;
    } // interpolate

    // Return a String representing the point.
    @Override
    public String toString() {
        return "(" + gridX + "," + gridY + "," + height + ")";
    } // toString

    // Purely for testing during development, and so does not catch exceptions.
    public static void main(String[] args) throws Exception
    {
        ContourPoint point1 = new ContourPoint(0,0,0);
        ContourPoint point2 = new ContourPoint(9999,9999,100000000);

        DataOutputStream output = new DataOutputStream(new FileOutputStream("test.dat"));

        // Test the following interpolation steps.
        int [] trySteps = {0, 10, 100};

        // Write the number of lists.
        output.writeByte(trySteps.length);

        for(int tryStep: trySteps)
        {
            ContourPoint [] interpolation = point1.interpolate(point2, tryStep);
            // Write the length of this list,
            // plus 2 to include the original points.
            output.writeInt(interpolation.length + 2);
            // Now write the first point.
            point1.write(output);
            // Now write each interpolated point.
            for(ContourPoint aPoint : interpolation)
                aPoint.write(output);
            // Now write the last point.
            point2.write(output);
        } // for

        output.close();

        DataInputStream input = new DataInputStream(new FileInputStream("test.dat"));

        // Read number of lists.
        int noOfLists = input.readByte();
        for (int count = 1; count <=noOfLists ; count++)
        {
            // Read the length of this list.
            int length = input.readInt();
            ContourPoint [] pointArray = new ContourPoint[length];

            // Now read each point.
            for (int pointIndex = 0; pointIndex < length; pointIndex++)
                // Construct a point from the file.
                pointArray[pointIndex] = new ContourPoint(input);

            // Now print them out.
            for (int pointIndex = 0; pointIndex < length; pointIndex++)
                System.out.println(pointIndex + " " + pointArray[pointIndex]);
            System.out.println();
        } // for

        input.close();
    } // main

} // class ContourPoint
