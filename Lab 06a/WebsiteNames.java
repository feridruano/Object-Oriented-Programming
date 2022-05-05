// Name: Ferid Ruano
// Class: COMP 150
// Date: 10/5/18
// Program: Enter website names until user types 'stop'. Determine how many .com websites there are.

// Import Packages
import java.util.Scanner;

public class WebsiteNames
{
    public static void main(String[] args)
    {
        // Variables
        String websiteName;
        boolean loopAgain = true;
        int commercialWebsitecount = 0;

        // New Scanner
        Scanner keyboard = new Scanner(System.in);

        // While loopAgain is True, Run Code Inside
        while (loopAgain)
        {
            System.out.println("Enter a website:");
            websiteName = keyboard.next();

            // Check for Termination Word - "stop"
            if (websiteName.toLowerCase().matches("stop"))
            {
                loopAgain = false;
            }

            // Is Commercial Website - Increase Count
            if (websiteName.toLowerCase().endsWith(".com"))
            {
                commercialWebsitecount++;
            }
        }

        // Output Total of Commercial Websites, even if first command was "stop"
        System.out.println("The total number of commercial websites is: " + commercialWebsitecount);
    }
}
