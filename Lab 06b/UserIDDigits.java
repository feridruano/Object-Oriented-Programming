// Name: Ferid Ruano
// Class: COMP 150
// Date: 10/5/18
// Program: Get User ID and determine how many digits there are.
// If two digits exist output "User ID Valid", if not it's invalid.

// Import Packages
import java.util.Scanner;

public class UserIDDigits
{
    public static void main(String[] args)
    {
        // Variables
        String userID;
        int digitCount = 0; // Initialize
        
        // New Scanner
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter User ID:");
        userID = keyboard.next();

        // Check Each Character One by One for Digit
        for (int i = 0; i < userID.length(); i++)
        {
            if (Character.isDigit(userID.charAt(i)))
            {
                digitCount++;
            }
        }

        // Valid UserID Contains 2 Digits Only
        switch (digitCount)
        {
            case 2:
                System.out.println("User ID is Valid.");
                break;
            default:
                System.out.println("User ID is Invalid.");
        }
    }
}
