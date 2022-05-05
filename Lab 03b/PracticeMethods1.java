// File: PracticeMethods1.java
// Version: 1.0
// Name: Ferid Ruano
// Date: 9/18/18
// Course: COMP 150 - Object Oriented Programming

// *****
// 1. add your import statements here

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

public class PracticeMethods1
{
  public static void main( String [] args )
  {
    //*****
    // 2.  a. Create a Scanner object to read from the keyboard
    //     b. Prompt the user for his/her first name
    //     c. Print a message that says hello to the user
    //     d. Print a message that says how many letters
    //               are in the user's name

    // Your code goes here

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your full name: ");
    String name = scan.nextLine();
    System.out.println("Hello, " + name + ". There are " + name.length() + " letters.");


    //*****
    // 3.  Print an empty line

    // Your code goes here
    System.out.println("\n");


    //*****
    // 4.  a. Using previously created Scanner object prompt the user for the year (s)he was born.
    //     b. Calculate and print the age the user will be this year (prompt the user for the current year).
    //     c. Declare a constant for average life expectancy,
    //            set its value to 78.74
    //     d. Print a message that tells the user the percentage
    //            of their expected life they've lived.
    //       Use the DecimalFormat class to format the percentage

    // Your code goes here
    System.out.println("Enter your birth year: ");
    int birthYear = scan.nextInt();
    System.out.println("Enter the current year: ");
    int currentYear = scan.nextInt();
    int age = currentYear - birthYear;
    System.out.println("You are " + age + " years old.");
    final double AVG_LIFE_EXPECTANCY = 78.74;
    double expectedLifeLived = age / AVG_LIFE_EXPECTANCY * 100;
    DecimalFormat percent = new DecimalFormat("0.00'%'");
    System.out.println("You have lived " + percent.format(expectedLifeLived) + " of the Average Life Expectancy.\n");


    //*****
    // 5.  a. Create a Random object
    //             and generate a random integer between 1 and 20 inclusive
    //     b. Using previously created Scanner object prompt the user for a guess.
    //     c. Print a message that tells the user the number
    //         and how far from the number the guess was (hint: use Math.abs)

    // Your code goes here
    final int MAX_INTEGER = 20;
    final int MIN_INTEGER = 1;
    Random random = new Random();
    int randomNum = random.nextInt(MAX_INTEGER - MIN_INTEGER) + MIN_INTEGER;
    System.out.println("Random numbers have been created. Guess a number: ");
    int guess = scan.nextInt();
    System.out.println("The number was: " + randomNum);
    System.out.println("You were " + Math.abs(randomNum - guess) + " off.");

  }
}
