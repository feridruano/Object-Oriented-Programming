/**
 * Ferid Ruano
 * 11/8/2018
 */


public class Chapter9a_FillInTheCode
{
    public static void main( String[] args )
    {
        String[][] geo = { { "MD", "NY", "NJ", "MA", "CA", "MI", "OR" },
                { "Detroit", "Newark", "Boston", "Seattle" } };


        // ------> exercise 9a1
        // this code prints the element at row at index 1 and column at index 2
        // your code goes here
        System.out.println( geo[ 1 ][ 2 ] );

        System.out.println( "Done exercise 9a1.\n" );


        // ------> exercise 9a2
        // this code prints all the states in the first row (the row at index 0) of array goe that start with an M.
        for ( int col = 0; col < geo[ 0 ].length; col++ )
        {
            // your code goes here
            if ( geo[ 0 ][ col ].charAt( 0 ) == 'M' )
            {
                System.out.println( geo[ 0 ][ col ] );
            }
        }

        System.out.println( "Done exercise 9a2.\n" );


        // ------> exercise 9a3
        // this code prints all the cities in the second row (the row at index 1) of the array geo.
        for ( int col = 0; col < geo[ 1 ].length; col++ )
        {
            // your code goes here
            System.out.println( geo[ 1 ][ col ] );
        }


        System.out.println( "Done exercise 9a3.\n" );

        // ------> exercise 9a4
        // this code prints all the elements of the array geo.
        for ( int row = 0; row < geo.length; row++ )
        {
            // your code goes here
            for ( int col = 0; col < geo[ row ].length; col++ )
            {
                System.out.println( geo[ row ][ col ] );
            }
        }


        System.out.println( "Done exercise 9a4.\n" );


        int[][] a = { { 9, 6, 8, 10, 5 },
                { 7, 6, 8, 9, 6 },
                { 4, 8, 11, 5, 6 } };

        // ------> exercise 9a5
        // this code calculates and prints the sum of all the elements in the array a.
        int sum = 0;
        for ( int row = 0; row < a.length; row++ )
        {
            // your code goes here
            for ( int col = 0; col < a[ row ].length; col++ )
            {
                sum += a[ row ][ col ]; // Calculate All Array Element Sum
            }
        }
        System.out.println( "sum of all elements in array a = " + sum );
        System.out.println( "Done exercise 9a5.\n" );


        // ------> exercise 9a6
        // this code calculates and prints the number of times the value 8 appears in the array a.
        int numberOfEights = 0;
        for ( int row = 0; row < a.length; row++ )
        {
            // your code goes here
            for ( int col = 0; col < a[ row ].length; col++ )
            {
                if ( a[ row ][ col ] == 8 ) // Check for Array Element with value 8
                {
                    numberOfEights++;
                }
            }
        }
        System.out.println( "# of 8s in a = " + numberOfEights );
        System.out.println( "Done exercise 9a6.\n" );


        // ------> exercise 9a7
        // this code calculates and prints the number of times the value 6 appears in the second row
        // (i.e., the row whose index is 1) of array a.
        int numberOfSixes = 0;
        // your code goes here
        for ( int col = 0; col < a[ 1 ].length; col++ )
        {
            if ( a[ 1 ][ col ] == 6 ) // Check for Array Elements with Value 6
            {
                numberOfSixes++;
            }
        }

        System.out.println( "# of 6s in the second row = " + numberOfSixes );
        System.out.println( "Done exercise 9a7.\n" );

        // ------> exercise 9a8
        // this code calculates the sum of the elements in the third column (i.e, the column with index 2) of array a.
        int columnSum = 0;
        for ( int row = 0; row < a.length; row++ )
        {
            // your code goes here
            for ( int col = 0; col < a.length; col++ )
            {
                if ( col == 2 )
                {
                    columnSum += a[ row ][ col ]; // Calculate Column 2 Sum
                }
            }
        }
        System.out.println( "sum of elements in the third column = " + columnSum );

        System.out.println( "Done exercise 9a8.\n" );

        // ------> exercise 9a9
        // this code calculates the sum of the elements in the second row (i.e, the row with index 1) of array a.
        int rowSum = 0;
        for ( int col = 0; col < a[ 1 ].length; col++ )
        {
            // your code goes here
            for ( int row = 0; row < a[ 1 ].length; row++ )
            {
                if ( row == 1 )
                {
                    rowSum += a[ row ][ col ]; // Calculate Sum of Row 1
                }
            }
        }
        System.out.println( "sum of elements in the second row = " + rowSum );

        System.out.println( "Done exercise 9a9.\n" );


        // ------> exercise 9a10
        // this code calculates and prints totals per row of array a.
        for ( int row = 0; row < a.length; row++ )
        {
            // your code goes here
            rowSum = 0;
            for ( int col = 0; col < a[ 1 ].length; col++ ) // Array rows are all the same length
            {
                rowSum += a[ row ][ col ]; // Calculate Row Sum
            }
            System.out.println( "sum of elements in row " + row + " = " + rowSum );
        }


        System.out.println( "Done exercise 9a10.\n" );

        // ------> exercise 9a11
        // this code finds and prints the largest value of array a.
        int maxValue = Integer.MIN_VALUE;
        for ( int row = 0; row < a.length; row++ )
        {
            // your code goes here
            for ( int col = 0; col < a[ 1 ].length; col++ ) // Array rows are all the same length
            {
                if ( a[ row ][ col ] > maxValue ) // Check for Greater Array Element Value
                {
                    maxValue = a[ row ][ col ];
                }
            }
        }
        System.out.println( "the largest value in array a = " + maxValue );
        System.out.println( "Done exercise 9a11.\n" );


        // ------> exercise 9a12
        // this code finds the "smallest" row of array a (the row with the smallest sum of the elements)
        // and prints the its index, its sum, and its elements
        int rowIndex = 0; // Track Lowest Sum Row
        for ( int row = 0; row < a.length; row++ )
        {
            int tempSum = 0;
            for ( int col = 0; col < a[ 1 ].length; col++ ) // Array rows are all the same length
            {
                tempSum += a[ row ][ col ]; // Calculate Row Sum and Store as Temp Sum
            }
            // Compare tempSum to maxValue (First Run Through), Variable maxValue is reused from previous exercise
            if ( tempSum < maxValue )
            {
                rowSum = tempSum;
                rowIndex = row;
            }
            else // Else update MaxValue as tempSum
            {
                maxValue = tempSum;
            }
        }
        System.out.print( "The row with smallest sum index is row " + rowIndex
                + " and the row sum is " + rowSum
                + ". The elements of the array row are: " );

        // Print Smallest Sum Array
        for ( int col = 0; col < a[ rowIndex ].length; col++ )
        {
            System.out.print( a[ rowIndex ][ col ] + " " ); // Print Array Elements
        }
        System.out.println();

        System.out.println( "Done exercise 9a12.\n" );

        // ------> exercise 9a13
        // this code creates a single dimensional array of boolean with the number of elements equal to the number
        // of rows in array a. Every element of the boolean array should be set to true if the sum of the elements
        // in the corresponding row in array a is greater than 35.
        // Prints the boolean array.
        boolean[] boolArray = new boolean[ 3 ];

        // Find and Check if Row Sum is greater than 35
        for ( int row = 0; row < a.length; row++ )
        {
            rowSum = 0; // Reset Row Sum
            for ( int col = 0; col < a[ 1 ].length; col++ )
            {
                rowSum += a[ row ][ col ]; // Calculate Row Sum
                if ( rowSum > 35 )
                {
                    boolArray[ row ] = true;
                }
            }
        }

        // Output Boolean Array
        System.out.print( "Rows with sum greater than 35 are: " );
        for ( int index = 0; index < boolArray.length; index++ )
        {
            System.out.print( boolArray[ index ] + " " ); // Print Boolean Array Elements
        }
        System.out.println(); // Newline

        System.out.println( "Done exercise 9a13." );


        // ------> exercise 9a14
        // this code sets to 0 all the elements of the even-numbered rows and sets to 1 all the elements of
        // the odd-numbered rows of array a. Prints all the elements of the updated array

        System.out.println( "\n0s = Even Row : 1s = Odd Row" );
        for ( int row = 0; row < a.length; row++ )
        {
            for ( int col = 0; col < a[ 1 ].length; col++ )
            {
                if ( row % 2 == 0 ) // Check for Even Row
                {
                    a[ row ][ col ] = 0;
                    System.out.print( a[ row ][ col ] + " " ); // Print Array Element
                }
                else // Odd Row
                {
                    a[ row ][ col ] = 1;
                    System.out.print( a[ row ][ col ] + " " ); // Print Array Element
                }
                if ( col == a[ 1 ].length - 1 ) // If Last Row Element then Newline (Start of New Row)
                {
                    System.out.println(); // newline
                }
            }
        }
        System.out.println( "Done exercise 9a14." );
    }
}
