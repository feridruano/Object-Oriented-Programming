// Name: Ferid Ruano
// Class: COMP 150
// Date: 10/5/18
// Program: Use nested loops to create Xs and Os pattern.
// Every line is one letter displayed with one additional space to the right.

// Import Packages
import java.util.Scanner;

public class XOPattern
{
    public static void main(String[] args)
    {
        // Variables
        int numberOfLines;
        char xChar = 'X';
        char oChar = 'O';
        boolean character = true; // True is X, False is O

        // New Scanner
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        numberOfLines = keyboard.nextInt();

        // Print XO Pattern
        for (int lineNumber = 0; lineNumber < numberOfLines; lineNumber++)
        {
            // Value of column is reset to 0 after for loop exits
            // It allows the for loop to print the another space since lineNumber is increased by one
            for (int column = 0; column <= lineNumber; column++)
            {
                if (lineNumber == column)
                {
                    if (character)
                    {
                        System.out.print(xChar);
                        character = false;
                    }
                    else
                    {
                        System.out.print(oChar);
                        character = true;
                    }
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
