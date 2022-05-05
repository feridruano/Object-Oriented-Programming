// File: ProbableSeason.java
// Version: 1.0
// Name: Ferid Ruano
// Date: 9/23/18
// Course: COMP 150 - Object Oriented Programming
// Desc: Determine season based on temperature.

// Import Java Library
import java.util.Scanner;

public class ProbableSeason
{
    public static void main(String[] args)
    {
        // New Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        int userTemp = scan.nextInt();

        // Catch Valid or Invalid Temperature Range
        if (userTemp > 110 || userTemp < -5)
        {
            System.out.println("Temperature entered is outside the valid range.");
        }
        else
        {
            // Determine Season based on Temperature Range
            if (userTemp >= 90)
            {
                System.out.println("The season is probably Summer.");
            }
            if (userTemp >= 70 && userTemp < 90)
            {
                System.out.println("The season is probably Spring.");
            }
            if (userTemp >= 50 && userTemp < 70)
            {
                System.out.println("The season is probably Fall.");
            }
            if (userTemp < 50)
            {
                System.out.println("The season is probably Winter.");
            }
        }
    }
}
