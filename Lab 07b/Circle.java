// Ferid Ruano
// 10/22/18
// Comp 150
// Lab 7b - Circle Class

// Import Packages
import java.awt.*;
import java.text.DecimalFormat;

public class Circle
{
    // Point Object - Center of Circle
    Point center = new Point();

    // Instance Variables
    private double radius;

    // Secondary Constructor
    public Circle(double startX, double startY, double startRadius)
    {
        center.setLocation(startX, startY);
        setRadius(startRadius);
    }

    // Accessor Method - Radius of Circle
    public double getRadius()
    {
        return this.radius;
    }

    // Mutator Method - Radius of Circle
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    // toString Method
    public String toString()
    {
        DecimalFormat twoDigits = new DecimalFormat("0.00");
        return "The center of the circle is: " + center.toString()
                + "\nThe radius is: " + twoDigits.format(getRadius()) // Could call this.radius, but instead goes through getRadius Method
                + "\nThe perimeter is: " + twoDigits.format(perimeter())
                + "\nThe area is: " + twoDigits.format(area());
    }

    // Equals Method
    public boolean equals(Circle otherObj)
    {
        return this.center.equals(otherObj.center) && this.radius == otherObj.radius;
    }

    // Perimeter Method
    public double perimeter()
    {
        return Math.PI * 2 * radius;
    }

    // Area Method
    public double area()
    {
        return Math.PI * radius * radius;
    }
}
