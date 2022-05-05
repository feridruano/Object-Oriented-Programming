// File: YearRepresentation.java
// Version: 1.0
// Name: Ferid Ruano
// Date: 9/23/18
// Course: COMP 150 - Object Oriented Programming
// Desc: Get a year in number format consisting of either two or four digits. Then, print the year.

// Import Java Library
import java.util.Scanner;

public class YearRepresentation
{
    public static void main(String[] args)
    {
        // New Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year: ");
        String userYear = scan.next();

        // Determine Input Length and Output Respective Result
        if (userYear.matches("[0-9]+"))
        {
            switch (userYear.length())
            {
                case 2:
                    System.out.println("The year is: " + (Integer.parseInt(userYear) + 2000));
                    break;
                case 4:
                    System.out.println("The year is: " + userYear);
                    break;
                default:
                    System.out.println("The year " + userYear + " is not a valid input.");
            }
        }
        else
        {
            // Catch Non-Digit Input
            System.out.println("The input must consist only of digits.");
        }
    }
}
