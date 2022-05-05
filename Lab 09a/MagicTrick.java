/**
 * Service class with supporting methods for Magic Trick
 *
 * @author Ferid Ruano
 * @version 11/8/2018
 */

import java.util.*;

public class MagicTrick
{
    private int[][] grid;
    private int flippedRow;
    private int flippedCol;
    public static final int GRID_SIZE = 6;

    /**
     * default constructor,
     * sets elements in the grid to randomly generated either 0 or 1
     * calls setParity method
     */
    public MagicTrick()
    {
        // TODO
        // see Lab9a Notes

        this.grid = new int[ GRID_SIZE ][ GRID_SIZE ]; // Grid Dimensions

        // Random Bits in Rows and Columns Except the Last Ones
        Random Bit = new Random();
        for ( int row = 0; row < grid.length - 1; row++ )
        {
            for ( int col = 0; col < grid[ row ].length - 1; col++ )
            {
                grid[ row ][ col ] = Bit.nextInt( 2 );
            }
        }
        setParity();
    }

    /**
     * sets elements in the last row and the last column
     * to either 1 or 0, so the sum of the elements in the appropriate row and column is even
     */
    public void setParity()
    {
        // TODO
        // See Lab9a Notes

        // Check Row Sum
        for ( int row = 0; row < grid.length - 1; row++ )
        {
            int rowSum = 0;
            for ( int col = 0; col < grid[ row ].length - 1; col++ )
            {
                rowSum += grid[ row ][ col ];
            }

            // Check for Odd Row Sum
            if ( rowSum % 2 != 0 )
            {
                grid[ row ][ grid[ 0 ].length - 1 ] = 1;
            }
        }

        // Check Column Sum
        for ( int col = 0; col < grid.length; col++ )
        {
            int columnSum = 0;
            for ( int row = 0; row < grid[ col ].length; row++ )
            {
                columnSum += grid[ row ][ col ];
            }

            // Check for Odd Column Sum
            if ( columnSum % 2 != 0 )
            {
                grid[ grid.length - 1 ][ col ] = 1;
            }
        }
    }

    /**
     * flips the value of the randomly
     * selected element, saves the row and col in this.flippedRow and this.flippedCol
     */
    public void flipOneElement()
    {
        // TODO
        // See Lab9a Notes

        // Generate Random Row and col
        Random index = new Random();
        this.flippedRow = index.nextInt( GRID_SIZE );
        this.flippedCol = index.nextInt( GRID_SIZE );

        // Check If Element at Random Row and Col is 1 or 0
        if ( grid[ this.flippedRow ][ this.flippedCol ] == 1 )
        {
            grid[ this.flippedRow ][ this.flippedCol ] = 0; // Flip
        }
        else
        {
            grid[ this.flippedRow ][ this.flippedCol ] = 1; // Flip
        }
    }

    /**
     * accessor method
     *
     * @return the value of the row of the flipped element: this.flippedRow
     */
    public int getFlippedRow()
    {
        // TODO

        return this.flippedRow;
    }

    /**
     * accessor method
     *
     * @return the value of the column of the flipped element: this.flippedCol
     */
    public int getFlippedColumn()
    {
        //TODO

        return this.flippedCol;
    }

    /**
     * toString method returns printable version
     * of the content of this.grid
     */
    public String toString()
    {
        String returnValue = "";
        for ( int r = 0; r < GRID_SIZE; r++ )
        {
            for ( int c = 0; c < GRID_SIZE; c++ )
            {
                returnValue += this.grid[ r ][ c ] + " ";
            }
            returnValue += "\n";
        }
        return returnValue += "\n";
    }


    /**
     * checks the user's guess
     *
     * @param r - the row selected by the user
     * @param c - the column selected by the user
     * @return - true if the guessed row and column are the same
     * as the row and column of the flipped element
     */
    public boolean checkGuess( int r, int c )
    {
        // TODO
        return r == this.flippedRow && c == this.flippedCol; // Returns True If Statement is True, Else False
    }
}