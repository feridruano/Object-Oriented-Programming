// Name: Ferid Ruano
// Class: COMP 150
// Date: 10/5/18
// Program: Read logic.txt file and determine how many words start with 'is' and replace vowels with '~'.

// Import Packages
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class StartWith
{
    public static void main(String[] args) throws IOException
    {
        // Variables
        String tempTextStorage;
        int wordsWithIs = 0;

        // New File with Scanner
        File inputFile = new File("Logic.txt"); // Located outside of SRC Folder in intellij
        Scanner file = new Scanner(inputFile);

        // Check hasNext() - If there is a word to read do loop
        do
        {
            // Read Logic.txt File
            tempTextStorage = file.next();

            // Check if Word Starts With "is", Increase Counter
            if (tempTextStorage.startsWith("is"))
            {
                wordsWithIs++;
            }

            // Replace Vowels with '~'
            System.out.print(tempTextStorage.replaceAll("[aeiouAEIOU]", "~"));
        }
        while (file.hasNext());

        // Output Total Words with "is"
        System.out.println("\n" + wordsWithIs + " words start with 'is'.");
    }
}
