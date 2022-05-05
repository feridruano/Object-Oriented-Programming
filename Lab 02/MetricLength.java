// File: MetricLength.java
// Version: 1.0
// Name: Ferid Ruano
// Date: 9/4/18
// Course: COMP 150 - Object Oriented Programming
// Desc: Inches to centimeters conversion program.

public class MetricLength
{
  public static void main( String [] args )
  {

    //***** 1. What data values do we know?
    // We know that there are 2.54 centimeters in an inch.
    //
    // Declare a double constant named CM_PER_INCH and assign CM_PER_INCH the value 2.54.

    final double CM_PER_INCH = 2.54;

    //***** 2. What other data does the program require?
    // For this program, we require the number of inches.
    //
    // Declare a double variable named inches and assign any desired value to this variable.

    double inches = 12.0;

    //***** 3. Calculation
    // We need to convert inches to centimeters
    //
    // Declare a double variable named centimeters.
    // Multiply inches by CM_PER_INCH and store the result in centimeters.

    double centimeters;
    centimeters = CM_PER_INCH * inches;

    //***** 4. Output
    // Write one or two statements that output
    // the original inches and the equivalent centimeters.
    // Try to match the sample output in Figure 2.6.

    System.out.println("The value of inches before conversion is: " + inches);
    System.out.println("The result of converting inches to centimeters is: " + centimeters);

  }
}
