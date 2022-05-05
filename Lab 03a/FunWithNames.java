 // File: FunWithNames.java
// Version: 1.0
// Name: Ferid Ruano
// Date: 9/17/18
// Course: COMP 150 - Object Oriented Programming
// Desc: Pseudocode to Java Code.

import java.lang.String;

public class FunWithNames
{
  public static void main(String[] args)
  {
    // My Full Name
    String myFullName = "Ferid Ruano";
    System.out.println(myFullName.toUpperCase());
    System.out.println(myFullName.toLowerCase());
    System.out.println(myFullName);

    // My First and Last Name
    System.out.println(myFullName.length());
    String myFirstName = myFullName.substring(0, myFullName.indexOf(' '));
    System.out.println(myFirstName);
    String myLastName = myFullName.substring(myFullName.indexOf(' ') + 1);
    System.out.println(myLastName);
    System.out.println(myLastName + ' ' + myFirstName);

    // Friends Full Name and Initials
    String friendsFullName = "Sean Howard Blanchard";
    System.out.println(friendsFullName.length());
    char friendsFirstNameInitial = friendsFullName.charAt(0);
    char friendsLastNameInitial = friendsFullName.charAt(friendsFullName.lastIndexOf(' ') + 1);

    //My Initials
    char myFirstNameInitial = myFirstName.charAt(0);
    char myLastNameInitial = myLastName.charAt(0);

    // Print Initials
    System.out.println(myFirstNameInitial + "" + myLastNameInitial + " are " + friendsFirstNameInitial + friendsLastNameInitial + " are friends");
  }
}
