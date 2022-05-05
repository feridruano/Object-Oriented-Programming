// File: Section_3b_FillInTheCode.java
// Version: 1.0
// Name: Ferid Ruano
// Date: 9/18/18
// Course: COMP 150 - Object Oriented Programming

 import java.util.Scanner;
 import java.util.Random;
 import java.text.DecimalFormat;

public class Section_3b_FillInTheCode
{
    public static void main(String[] args)
    {
        // Code the following exercises:
        // ============================


        // #1 this code prompts the user for a sentence, then prints the String
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String inputSentence = in.nextLine();
        System.out.println("The sentence entered is: " + inputSentence + "\n");

        // #2 this code prompts the user for an integer, prints it,
        //    and saves it to a variable
        System.out.println("Enter an integer: ");
        int inputInteger = in.nextInt();
        System.out.println("The integer entered is: " + inputInteger + "\n");

        // #3 this code randomly generates two integers between 5 and 15 inclusive
        //    and finds the smallest of the two
        //    prints the values of the integers and the result
        //    utilize nextInt method from Random class and min method from Math class
        final int MAX_INTEGER = 15;
        final int MIN_INTEGER = 5;
        Random random = new Random();
        int randomNum1 = random.nextInt(MAX_INTEGER - MIN_INTEGER) + MIN_INTEGER;
        int randomNum2 = random.nextInt(MAX_INTEGER - MIN_INTEGER) + MIN_INTEGER;
        System.out.println("Random Numbers: The first number is "
                            + randomNum1
                            + " and  the second number is "
                            + randomNum2
                            + ". The smallest of the two is: "
                            + Math.min(randomNum1, randomNum2)
                            + "\n");
        // #4 this code randomly generates an integer that is a single digit
        //    and calculates the sum of the four integers (include the integers from exercise #2 and #3),
        //    and their average.
        //    sum should be an int but average should be a double (use casting)
        //    Print the values of the four variables, the sum, and the calculated average;
        //    Format average with DecimalFormat to display one digit after decimal point.
        int randomSingleDigit = random.nextInt(9 + 1);
        int sum = inputInteger + randomNum1 + randomNum2 + randomSingleDigit;
        double average = (double)sum / 4.0;
        System.out.println("The values inputInteger, randomNum1, randomNum2, and randomSingleDigit are: "
                            + inputInteger + ", "
                            + randomNum1 + ", "
                            + randomNum2 + ", "
                            + randomSingleDigit + ", "
                            + "respectively.");
        DecimalFormat oneDecimalPoint = new DecimalFormat(".0");
        System.out.println("The average is: " + oneDecimalPoint.format(average) + "\n");

        // #5 this code randomly generates a boolean and prints the result
        //    use nextBoolean method from Random class
        boolean randomBoolean = random.nextBoolean();
        System.out.println("The random Boolean is: " + randomBoolean);

        // #6 this code prompts the user for a character, prints it, prints its UniCode value,
        //    checks if the character is a digit and prints the result
        //    see Chapter3 -> Example03_Character -> CharacterDemo
        System.out.println("Enter a character: ");
        char inputChar = in.next().charAt(0);
        if(inputChar >= '0' && inputChar <= '9'){
          System.out.println("The character is a digit.");
        } else {
        int charUnicodeValue = Character.getNumericValue(inputChar);
        System.out.println("The charater is: " + inputChar + " and the UniCode value is " + charUnicodeValue);
      }

    }
}
