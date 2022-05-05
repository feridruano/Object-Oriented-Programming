/*
 * Ferid Ruano
 * 11/5/2018
 * COMP 150 - 8AM
 * Weekly Temperature Client Class
 */

// Import Packages

import java.util.Arrays;

public class WeekTempClient
{
    public static void main( String[] args )
    {
        // Create Array with Elements
        double[] weekTemp = { 72.0, 20.1, 107.4, 35.3, 12.5, 89.9, 102.3 };

        // Create Week Temperature Objects (Same Array Values)
        WeekTemp Week1 = new WeekTemp( weekTemp );
        WeekTemp Week2 = new WeekTemp( weekTemp );

        // Outputs for Testing
        System.out.println( "Convert Array to String: " + Week1.toString() );
        System.out.println( "Check if Array Equals Another: " + Week1.equals( Week2 ) ); // True
        System.out.println( "Number of Days Below Freezing: " + Week1.howManyDaysBelowFreezing() );
        System.out.println( "Temperatures Above 100: " + Arrays.toString( Week1.getTemperaturesAbove100() ) );
        System.out.println( "Get Highest Temperature: " + Week1.getHighest() );

    }
}
