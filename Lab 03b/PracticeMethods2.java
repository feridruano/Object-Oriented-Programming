// File: PracticeMethods2.java
// Version: 1.0
// Name: Ferid Ruano
// Date: 9/18/18
// Course: COMP 150 - Object Oriented Programming

import java.util.*;
public class PracticeMethods2
{
    public static void main( String [] args )
    {
        // The GregorianCalendar class is included in java.util package.
        // It describes a point in time, as measured by the Gregorian calendar - the standard calendar
        // that is commonly used throughout the world today.
        //
        // You construct a GregorianCalendar object from a year, month, and a day of the month, like this:
        //
        //        GregorianCalendar myDate = new GregorianCalendar(); // Today's date
        //        GregorianCalendar independenceDay = new GregorianCalendar(1776, Calendar.JULY, 4); // specific date
        //
        // Use the values Calendar.JANUARY, ... , Calendar.DECEMBER to specify the month // January is 0, February is 1, ...
        //
        // The add method can be used to add a number of days to a GregorianCalendar object:
        //
        //        myDate.add(Calendar.DAY_OF_MONTH, 10); // now myDate is ten days from today
        //
        // Note that add is a mutator method - it changes the myDate object
        //
        // The get method can be used to query a given GregorianCalendar object:
        //
        //        int dayOfMonth = myDate.get(Calendar.DAY_OF_MONTH);
        //        int month = myDate.get(Calendar.MONTH);
        //        int year = myDate.get(Calendar.YEAR);
        //        int weekday = myDate.get(Calendar.DAY_OF_WEEK); // 1 is Sunday, 2 is Monday, ... , 7 is Saturday

        


        // ****
        // Go to java API http://docs.oracle.com/javase/8/docs/api/ and locate documentation for the GregorianCalendar class
        // Go over the description of the class, do you have any questions?
        // Explore the available constructors, do you have any questions?
        // Explore the available methods, do you have any questions? 
        //
        
      
        
        // Now write a program that:
        // 1. Creates GregorianCalendar object that represents your birth date
        GregorianCalendar birthDate = new GregorianCalendar(1997, Calendar.APRIL, 22);

        // 2. prints the weekday of your birthday
        int weekday = birthDate.get(Calendar.DAY_OF_WEEK);
        System.out.println("The day of the week is: " + weekday);
      
        // 3. computes (calls add method) and prints the date that is 10,000 days from your birthday
        birthDate.add(Calendar.DATE, 10000);
        int month = birthDate.get(Calendar.MONTH);
        int dayOfMonth = birthDate.get(Calendar.DAY_OF_MONTH);
        int year = birthDate.get(Calendar.YEAR);
        System.out.println("10,000 from Birth Date is: " + month + "/" + dayOfMonth + "/"+ year);
      
        // 4. computes and prints the day of a month and its weekday that is a given number of days from today. 
        //    4a.  create GregorianCalendar object that represents today's date
        GregorianCalendar today = new GregorianCalendar();
        //    4b.  use Scanner to get the number of days from the user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number of days in the future: ");
        int inputDays = scan.nextInt();
        //    4c.  compute and print the date that is the requested number of days from today
        today.add(Calendar.DATE, inputDays);
        month = today.get(Calendar.MONTH);
        dayOfMonth = today.get(Calendar.DAY_OF_MONTH);
        year = today.get(Calendar.YEAR);
        System.out.println("The new date is: " + month + "/" + dayOfMonth + "/"+ year);
      
        // HINT: The GregorianCalendar class is complex, and it is a really good idea to explore the API
        //       before tackling the whole problem.
        //       Implement one step at a time, compile and test it before moving to the next step
    }
}
