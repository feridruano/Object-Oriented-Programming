/**
 * Lab8b
 *
 * @author Ferid Ruano
 * @version 11/5/2018
 */

import java.util.*;

public class ArrayMethodsClientL8b
{
    public static void main( String[] args )
    {
        // declare and initialize array of integers in ascending order
        int[] intNumbersSortedA = { 1, 2, 3, 4, 5, 6 };

        // STEP 5
        // declare and initialize an array with 10 randomly generated
        //     numbers between 1 and 9
        // System.out.println("STEP 5 - implement me");

        int[] intArray = new int[ 10 ];
        Random NumGen = new Random();

        for ( int i = 0; i < intArray.length; i++ )
        {
            intArray[ i ] = NumGen.nextInt( 9 ) + 1;
        }

        // create an ArrayMethodsL8b object - passing the intNumbersSortedA array as the argument
        System.out.println( "--->calling secondary constructor" );
        ArrayMethodsL8b arr = new ArrayMethodsL8b( intNumbersSortedA );

        // print the content of the array
        System.out.println( "The elements of the array sorted in ascending order are: " + arr.toString() );

        // print the value of the product calculated  by the method arrayProduct
        System.out.println( "The product of all elements in the array is: "
                + arr.arrayProduct() );
        // calculate number of swaps
        System.out.println( "The number of swaps was " + arr.calculateSwaps() );
        System.out.println( "The array after swaps is: " + arr.toString() );
        System.out.println();
        // STEP 3
        // call reverse method
        arr.reverse();

        // STEP 4
        // print the content of the array
        System.out.println( "The array reversed is: " + arr.toString() );
        // print the value of the product calculated  by the method arrayProduct
        System.out.println( "The product of all elements in the array is: " + arr.arrayProduct() );
        // calculate number of swaps
        System.out.println( "The number of swaps was " + arr.calculateSwaps() );
        System.out.println( "The array after swaps is: " + arr.toString() );
        System.out.println();

        // STEP 6
        // call mutator method to change the array in arr object to the one that contains random numbers
        arr.setIntArray( intArray );

        // STEP 7
        // print the content of the array
        System.out.println( "The elements of the array are: " + arr.toString() );
        // print the value of the product calculated  by the method arrayProduct
        System.out.println( "The product of all elements in the array is: " + arr.arrayProduct() );
        // calculate number of swaps
        System.out.println( "The number of swaps was " + arr.calculateSwaps() );
        System.out.println( "The array after swaps is: " + arr.toString() );
        System.out.println();

        // STEP 8
        // prompt the user for a number to search for
        Scanner keyboard = new Scanner( System.in );
        System.out.println( "Enter a number (0-9) to be searched for in the array: " );
        int inputNum = keyboard.nextInt();

        // STEP 10
        // call searchForNumber method and print either the position of the
        // searched for value or not found message
        System.out.println( "Index Location: " + arr.searchForNumber( inputNum ) + " (-1 = Not Found)" );
    }
}
