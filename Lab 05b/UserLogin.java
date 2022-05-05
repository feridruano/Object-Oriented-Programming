// File: UserLogin.java
// Version: 1.0
// Name: Ferid Ruano
// Date: 9/23/18
// Course: COMP 150 - Object Oriented Programming
// Desc: Check UserID and Password. Either allow or deny access.

// Import Java Library
import java.util.Scanner;

public class UserLogin
{
    public static void main(String[] args)
    {
        // Set Correct Credentials
        final String correctUserID = "admin";
        final String correctPassword = "open";

        // New Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a user ID (No Spaces): ");
        String userID = scan.next();
        System.out.println("Enter a password: ");
        String password = scan.next();

        // Check UserID and Password with Correct Credentials
        if (userID.equals(correctUserID) && password.equals(correctPassword))
        {
            System.out.println("Welcome!");
        }
        else if (userID.equals(correctUserID) && !password.equals(correctPassword))
        {
            System.out.println("Wrong password.");
        }
        else if (!userID.equals(correctUserID) && password.equals(correctPassword))
        {
            System.out.println("Wrong user ID.");
        }
        else
        {
            System.out.println("Sorry, wrong user ID and password.");
        }

    }
}
