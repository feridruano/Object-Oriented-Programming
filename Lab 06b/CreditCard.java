// Name: Ferid Ruano
// Class: COMP 150
// Date: 10/5/18
// Program: Verify credit card using algorithm given on Canvas.

// Import Packages
import java.util.Scanner;

public class CreditCard
{
    public static void main(String[] args)
    {
        // Variables
        final String VALID_CREDIT_CARD = "[0-9]{8}"; // Pattern of 8 digits (0-9)
        int cardNumberInt, evenDoubled, checkSum, oddSum, evenSum;
        String cardNumber, yesOrNO;

        // New Scanner
        Scanner keyboard = new Scanner(System.in);
        do
        {
            // If User Checks Another Credit Card Reset Sums
            evenSum = 0;
            oddSum = 0;

            // Get Input and Check Pattern Loop
            do
            {
                // Get User Input - Credit Card Number
                System.out.print("8-Digit Credit Card Number: ");
                cardNumber = keyboard.next(); // UserID without a space
            }
            while (!cardNumber.matches(VALID_CREDIT_CARD)); // Repeat Until Valid Pattern

            for (int i = 0; i < cardNumber.length(); i++)
            {
                // Check if Character at i is a Digit
                cardNumberInt = Character.digit(cardNumber.charAt(i), 10);

                // Check for Even or Odd
                if (i % 2 == 0)
                {
                    evenDoubled = cardNumberInt * 2;

                    if (evenDoubled / 10 == 0)
                    {
                        evenSum += evenDoubled;
                    }
                    else
                    {
                        int tempDigit = evenDoubled / 10; // first digit
                        evenSum += tempDigit;
                        tempDigit = evenDoubled % 10; // second digit
                        evenSum += tempDigit;
                    }
                }
                else
                {
                    oddSum += cardNumberInt;
                }
            }

            // Check Last Digit of Sum is Equal to Zero
            checkSum = evenSum + oddSum;
            // checkSum % 10 is equal to 0 ? True : False
            System.out.println("The checksum is: " + checkSum);
            System.out.println(checkSum % 10 == 0 ? "The credit card number " + cardNumber + " is valid." : "The credit card number " + cardNumber + " is invalid! Try again.");

            // Ask to Check Another Credit Card Loop
            do
            {
                // Get User Input - Yes or No
                System.out.print("Would you like to check another credit card (Yes/No): ");
                yesOrNO = keyboard.next();
            }
            // Repeat Until Valid Single Character
            while (!yesOrNO.toLowerCase().matches("yes|no"));
        }
        while (yesOrNO.toLowerCase().matches("yes")); // Repeat if True
        System.out.println("Bye!");
    }
}
