// Name: Ferid Ruano
// Class: COMP 150
// Date: 10/5/18
// Program: Fill in the code.

import java.util.*;

public class Chapter6_FillInTheCode
{
    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);

        // exercise 21
        // write a while loop that generates random integers between 3 and 7 until a 5 is generated
        // and prints them all out, excluding 5
        Random random = new Random();
        int i = 0; // Initialize

        // your code goes here
        while (i != 5)
        {
            i = random.nextInt(5) + 3; // prime read
            if (i != 5)
            {
                System.out.println("The random integer is: " + i);
            }
        }


        // exercise 22
        // write a while loop that takes an integer input from the user, then prompts for additional integers
        // and prints all integers that are greater than or equal to the original input until the user enters 20,
        // which is not printed
        System.out.println("\nEnter a starting integer > ");
        int startInt = keyboard.nextInt(); // prime read

        // your code goes here
        int additionalIntegers = 0; // Initialize

        // First check if initial value is not 20
                while (additionalIntegers != 20)
                {
                    System.out.println("Enter another integer: ");
                    additionalIntegers = keyboard.nextInt();

                    // Only print integers greater than or equal to first integer. Less than integers can be ignored.
                    if (additionalIntegers > startInt && additionalIntegers != 20)
                    {
                        System.out.println("The integer entered " + additionalIntegers + " is greater than first integer.");
                    }
                    else if (additionalIntegers == startInt)
                    {
                        System.out.println("The integer entered " + additionalIntegers + " is equal to the first integer.");
                    }
                    else {
                        System.out.println("Enter a integer greater than or equal to the first integer!");
                    }
                }


        // exercise 23
        // write a while loop that takes integer values as input from the user and finds the sum of those
        // integers until the user types in the value -1 which is not added
        System.out.println("\nEnter an integer value. enter -1 to stop >");
        int value = keyboard.nextInt(); // prime read

        // your code goes here

        // I added an extra check - Not specified above but extra practice
        // First check if initial value is not -1
        switch (value)
        {
            case -1:
                break;
            default:
                while (additionalIntegers != -1)
                {
                    System.out.println("Enter another integer: ");
                    additionalIntegers = keyboard.nextInt();

                    // Add integers except -1
                    if (additionalIntegers != -1)
                    {
                        value += additionalIntegers;
                        System.out.println("The new sum is: " + value);
                    }
                }
        }
        // exercise 25
        // write a while loop that takes words as input from the user and concatenates them until
        // the user types in the word "end" which is not concatenated
        String sentence = "";
        System.out.println("\nEnter a word to be added to a sentence: ");
        String word = keyboard.next(); // prime read

        // your code goes here

        // I added an extra check - Not specified above but extra practice
        // Checks if initial word is not 'end'
        while (!word.toLowerCase().matches("end"))
        {
            sentence += word + " ";
            System.out.println(sentence);
            word = keyboard.next();
        }

    }
}
