/**
 * Ferid Ruano
 * 10/29/18
 * COMP 150
 */

import java.text.DecimalFormat;
import java.util.*;

public class Chapter8_FillInTheCode
{
    public static void main(String[] args)
    {
        // ------> exercise 27
        // this code assigns the value 10 to all elements of an array a27
        int[] a27 = new int[25];
        for (int i = 0; i < a27.length; i++)
        {
            a27[i] = 10;
        }
        System.out.println("The content of the array a27:");
        for (int i = 0; i < a27.length; i++)
        {
            System.out.print(a27[i] + " ");
        }
        System.out.println();
        System.out.println("Done exercise 27.");


        // ------> exercise 28
        // this code prints all the elements of array a28 that have a value greater than 20
        double[] a28 = {45.2, 13.1, 12.8, 87.4, 99.0, 100.1, 43.8, 2.4};
        for (int i = 0; i < a28.length; i++)
        {
            if ( a28[i] > 20 )
            {
                System.out.println(a28[i]);
            }
        }
        System.out.println("Done exercise 28.");

        // ------> exercise 29
        // this code prints tha average of the elements of array a29
        DecimalFormat df = new DecimalFormat("0.00");
        int[] a29 = {45, 13, 12, 87, 99, 100, 43, 2};
        double average = 0.0;
        for (int i = 0; i < a29.length; i++)
        {
            average +=  a29[i];
        }
        average /= a29.length;
        System.out.println(df.format( average ));
        System.out.println("Done exercise 29.");

        // ------> exercise 30
        // this code calculates and prints the dot product of two arrays
        // (a30[0] * b30[0] + a30[1]*b30[1] + ... + a30[n]*b30[n])
        int[] a30 = {3, 7, 9};
        int[] b30 = {2, 9, 4};
        int dotProduct = 0;
        for (int i = 0; i < a30.length; i++)
        {
            dotProduct += a30[i] * b30[i];

        }
        System.out.println(dotProduct);
        System.out.println("Done exercise 30.");

        // ------> exercise 31
        // this code prints the following three lines:
        //      a31[0] is 3
        //      a31[1] is 6
        //      a31[2] is 10
        int[] a31 = {3, 6, 10};
        for (int i = 0; i < a31.length; i++)
        {
            System.out.println("a31[" + i + "] is " + a31[i]);
        }
        System.out.println("Done exercise 31.");
    }
}
