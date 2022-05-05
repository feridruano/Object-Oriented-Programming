// File: AreaCircumferenceCalculator.java
// Version: 1.0
// Name: Ferid Ruano
// Date: 9/18/18
// Course: COMP 150 - Object Oriented Programming
// Desc: Enter radius and calculate Area and Circumference.

import java.util.Scanner;
import java.text.DecimalFormat;

public class AreaCircumferenceCalculator
{
    public static void main(String[] args)
    {
        // New Scanner
        Scanner input = new Scanner(System.in);
        // User Input
        System.out.println("Enter a radius: ");
        int radius = input.nextInt();
        // Calculations
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        // Format Result and Print
        DecimalFormat twoDigits = new DecimalFormat("0.00");
        System.out.println("The area is: " + twoDigits.format(area));
        System.out.println("The circumference is: " + twoDigits.format(circumference));
    }
}
