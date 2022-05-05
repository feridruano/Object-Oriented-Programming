// Ferid Ruano
// 10/22/18
// Lab 7b - Course Client Class

// Import Packages
import java.util.Scanner;

public class CourseClient
{
    public static void main(String[] args)
    {

        // New Scanner
        Scanner keyboard = new Scanner(System.in);

        // New Objects
        Course course = new Course("CS1", "Intro Computer Science", 4); // Preset a Course Object
        Course userCourse = new Course(); // New Object - Call Default Constructor

        // Set Instance Variable userCourse Object
        System.out.println("Enter a Course Code: (CS1, CS2, Etc.) ");
        userCourse.setCourseCode(keyboard.next());
        System.out.println("Enter a Course Description: ");
        keyboard.nextLine(); // Scanner Bug Fix
        userCourse.setCourseDesc(keyboard.nextLine());
        System.out.println("Enter a Course Credit: ");
        userCourse.setCourseCredit(keyboard.nextInt());

        // Check for Duplicate Object Data (Compare to preset Course Object)
        System.out.println(!userCourse.equals(course) ? userCourse.toString() : "Enter userCourse is equal to preset Course object.");
    }
}
