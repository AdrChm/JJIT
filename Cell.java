// Representation of a cell and methods related to it.
public class Cell {

    // Cell types
    private int type;

    // Move count
    private int moveCount = -1;

  /*
    // Cell coordinates.
    public final int row;
    public final int column;


    // Constructor method.
    public Cell(int row, int column)
    {
        this.row = row;
        this.column = column;
    } // public Cell
    */
    // Constructor method.
    public Cell(int type)
    {
        this.type = type;
        if(type == 0)
            moveCount = 0;
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
