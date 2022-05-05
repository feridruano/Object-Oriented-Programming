// Ferid Ruano
// 10/22/18
// COMP 150
// Lab 7b - Circle Service Class

// Import Package
import java.util.Scanner;

public class CircleClient
{
    public static void main(String[] args)
    {
        // New Scanner
        Scanner keyboard = new Scanner(System.in);

        // Variables
        double x, y, radius;

        // Ask for Center of Circle
        System.out.println("Enter Center and Radius of Circle");
        System.out.print("X: ");
        x = keyboard.nextDouble();
        System.out.print("Y: ");
        y = keyboard.nextDouble();
        System.out.print("Radius: ");
        radius = keyboard.nextDouble();

        // New Object
        Circle userCircle = new Circle(x, y, radius);
        Circle presetCircle = new Circle(0,0, 1); // Used for equals method

        // Output Object Data
        System.out.println(!userCircle.equals(presetCircle) ? userCircle.toString() : "Entered userCircle is equal to presetCircle object.");
    }
}
