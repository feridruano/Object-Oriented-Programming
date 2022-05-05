// File: StudentGrades.java
// Version: 1.0
// Name: Ferid Ruano
// Date: 9/23/18
// Course: COMP 150 - Object Oriented Programming
// Desc: Get student grade (0-100). Then, print letter grade.

// Import Java Library
import java.util.Scanner;

public class StudentGrades
{
    public static void main(String[] args)
    {
        // New Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grade (0-100): ");
        int userGrade = scan.nextInt();

        char finalGrade;
        // Check Input Range
        if (userGrade > 100 || userGrade < 0)
        {
            System.out.println("The grade you entered is out of range (0-100).");
        }
        else
        {
            // Determine Letter Grade
            switch (userGrade / 10)
            {
                case 10:
                    finalGrade = 'A';
                    break;
                case 9:
                    finalGrade = 'A';
                    break;
                case 8:
                    finalGrade = 'B';
                    break;
                case 7:
                    finalGrade = 'C';
                    break;
                case 6:
                    finalGrade = 'D';
                    break;
                default:
                    finalGrade = 'F';
            }
            // Output Grade
            System.out.println("Your grade is: " + finalGrade);
        }
    }
}
