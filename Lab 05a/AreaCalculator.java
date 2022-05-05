// File: AreaCalculator.java
// Version: 1.0
// Name: Ferid Ruano
// Date: 9/23/18
// Course: COMP 150 - Object Oriented Programming
// Desc: Calculate Area for Square and Rectangle.

public class AreaCalculator
{
    public static void main(String[] args)
    {
        // Variables to Assign Values
        double areaOfSquare, areaOfRectangle, squareSideLength, rectangleWidth, rectangleLength;

        // Calculate Area of Square
        squareSideLength = 0.666666667;
        areaOfSquare = squareSideLength * squareSideLength;
        System.out.println("The area of the square is: " + areaOfSquare);

        // Calculate Area of Rectangle
        rectangleWidth = 4.0;
        rectangleLength = 1.0 / 9.0;
        areaOfRectangle = rectangleWidth * rectangleLength;
        System.out.println("The area of the rectangle is: " + areaOfRectangle);

        // Test for equality
        if (areaOfSquare == areaOfRectangle)
        {
            System.out.println("There area of the square and rectangle are the same.");
        }
        else
        {
            System.out.println("There area of the square and rectangle are not the same.");
        }

    }
}
