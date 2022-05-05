// File: TemperatureConversion.java
// Version: 1.0
// Name: Ferid Ruano
// Date: 9/5/18
// Course: COMP 150 - Object Oriented Programming
// Desc: Temperature Conversion Program.

public class TemperatureConversion
{
  public static void main( String [] args )
  {
    //***** 1. declare any constants here, FREEZING_POINT would be a good candidate, declare it as int
    //         (remember naming conventions for constants)

    final int FREEZING_POINT_FAHRENHEIT = 32;
    final double FIVE_NINTHS = 5.0 / 9.0;
    final double NINE_FIFTHS = 9.0 / 5.0;

    //***** 2. declare temperature in Fahrenheit as an int (remember naming convention for variables) and assign a value to it

    int tF = 72;

    //***** 3. calculate equivalent Celsius temperature as double
    //         ( coversion formula: tC = (tF - 32) * 5 / 9 )

    double tC = (double)(tF - FREEZING_POINT_FAHRENHEIT) * FIVE_NINTHS;

    //***** 4. output the temperature in Fahrenheit and its calculated equivalent in Celsius

    System.out.println("The result of converting Fahrenheit temperature to Celsius is: " + tC);

    //***** 5. convert Celsius temperature back to Fahrenheit as int (use the same variable for the Fahrenheit that you declared in step 2)
    //         ( conversion formula: tF = tC * 9 / 5 + 32 )

    tF = (int) (tC * NINE_FIFTHS + FREEZING_POINT_FAHRENHEIT);

    //***** 6. output the temperature in Celsius and the converted back temperature in Fahrenheit to check correctness

    System.out.println("The result of converting Celsius temperature to Fahrenheit is: " + tF);

  }
}
