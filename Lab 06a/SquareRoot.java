// Name: Ferid Ruano
// Class: COMP 150
// Date: 10/5/18
// Program: Square root user number until a result smaller than 1.01.

// Import Packages
import java.util.Scanner;

public class SquareRoot
{
    public static void main(String[] args)
    {
        // Variables
        double userNumber, squareRoot;
        int squareRootCounter = 0; // Start at zero

        // New Scanner
        Scanner keyboard = new Scanner(System.in);

        // While userNumber is less than or equal to 10, ask for new input greater than 10
        do
        {
            System.out.print("Enter a number greater than 10.0 > ");
            userNumber = keyboard.nextDouble();
        }
        while (userNumber <= 10);

        // Calculate User Number Square Root
        squareRoot = Math.sqrt(userNumber);
        squareRootCounter++;

        // While Loop to print Square Roots greater than 1.01
        while (squareRoot > 1.01)
        {
            System.out.println(squareRootCounter + ". Calculated square root is --> " + squareRoot);
            squareRoot = Math.sqrt(squareRoot);
            squareRootCounter++;
        }
    }
}
