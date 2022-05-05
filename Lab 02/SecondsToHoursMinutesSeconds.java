// File: SecondsToHoursMinutesSeconds.java
// Version: 1.0
// Name: Ferid Ruano
// Date: 9/5/18
// Course: COMP 150 - Object Oriented Programming
// Desc: Converting seconds to other forms of time.

public class SecondsToHoursMinutesSeconds
{
  public static void main( String [] args )
  {
    // Define the Seconds variables to store initial value.
    int seconds = 7384;
    // Convert Seconds to Hours.
    int secondsToHours = seconds / 3600;
    // Convert Seconds to Minutes and get remaining Minutes.
    int secondsToMinutes = seconds / 60 % 60;
    // Get remaining Seconds.
    int secondsRemaining = seconds % 60;
    // Output the results.
    System.out.println(seconds + " seconds is " + secondsToHours + " hours, " + secondsToMinutes + " minutes, and " + secondsRemaining + " seconds.");
  }
}
