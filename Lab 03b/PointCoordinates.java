// File: PointCoordinates.java
// Version: 1.0
// Name: Ferid Ruano
// Date: 9/18/18
// Course: COMP 150 - Object Oriented Programming
// Desc: Get user points and add them to points Then, print.

import java.awt.Point;
import java.util.Scanner;

public class PointCoordinates
{
    public static void main(String[] args)
    {
        // New Scanner
        Scanner scan = new Scanner(System.in);
        // Point Variables
        int x1, x2, y1, y2;
        // User Input
        System.out.println("First point X and Y Coordinate separated by a space: ");
        x1 = scan.nextInt();
        y1 = scan.nextInt();
        System.out.println("Second point X and Y Coordinate separated by a space: ");
        x2 = scan.nextInt();
        y2 = scan.nextInt();
        // Create Points
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        // Print Points
        System.out.println("Point one is: " + p1.toString());
        System.out.println("Point two is: " + p2.toString());
    }
}
