/*
 * Ferid Ruano
 * 11/5/2018
 * COMP 150 - 8AM
 * Test Average Client Class
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestClient
{
    public static void main( String[] args )
    {
        // New Scanner
        Scanner keyboard = new Scanner( System.in );

        // Ask for a Course Name
        System.out.println( "Course Name: " );

        // New Test Object
        Test test = new Test( keyboard.nextLine() );

        // Decimal Format for Percent
        DecimalFormat percent = new DecimalFormat( "0.0'%'" );

        // Call Calculate Average Method
        System.out.println( test.toString()
                + percent.format( test.calcAverage( 60, 45, 67, 23, 100 ) ) ); // Five Grades

        System.out.println( test.toString()
                + percent.format( test.calcAverage( 5, 75, 89, 67, 87, 85, 34, 97, 89, 0, 11 ) ) );  // Eleven Grades

        System.out.println( test.toString()
                + percent.format( test.calcAverage( 35, 85, 23, 60, 79, 89, 45 ) ) ); // Seven Grades
    }
}
