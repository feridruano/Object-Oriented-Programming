// File: FileType.java
// Version: 1.0
// Name: Ferid Ruano
// Date: 9/18/18
// Course: COMP 150 - Object Oriented Programming
// Desc: Print file type extension.

import java.util.Scanner;

public class FileType
{
    public static void main(String[] args)
    {
        // New Scanner
        Scanner scan = new Scanner(System.in);
        // User Input
        System.out.println("Write your file name, including extension: ");
        String fileName = scan.nextLine();
        // Read the Extension Name Only
        String fileExtension = fileName.substring(fileName.lastIndexOf(".") + 1);
        // Output Uppercase, Lowercase, and Original
        System.out.println(fileExtension.toLowerCase());
        System.out.println(fileExtension.toUpperCase());
        System.out.println(fileName);
    }
}
