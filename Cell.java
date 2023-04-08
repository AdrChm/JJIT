// Representation of a cell and methods related to it.
public class Cell {

    // Cell coordinates.
    public final int row;
    public final int column;

    // Cell types
    private int type;

    // Move count
    private int moveCount = -1;

    // Neighbour Cells index
    final int [][] neighbours = new int[4][2];

    // Constructor method for given coordinates and type.
    public Cell(int row, int column, int type)
    {
        this.row = row;
        this.column = column;
        this.type = type;

        if(type == 0)
            moveCount = 0;

        neighbours[0] = new int[]{row, column - 1};
        neighbours[1] = new int[]{row - 1, column};
        neighbours[2] = new int[]{row, column + 1};
        neighbours[3] = new int[]{row + 1, column};

    } // public Cell

    // Return moveCount of this cell
    public int getMoveCount()
    {
        return moveCount;
    } // getMoveCount

    // Set moveCount accordingly to the input
    public void setMoveCount(int type)
    {
        this.moveCount = type;
    } // setMoveCount

    // Return type of this cell
    public int getType()
    {
        return type;
    } // getType

    // Set type accordingly to the input
    public void setType(int type)
    {
        this.type = type;
    } // setType

} //  class Cell
