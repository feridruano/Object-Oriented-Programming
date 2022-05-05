/*
 * Ferid Ruano
 * 11/5/2018
 * COMP 150 - 8AM
 * Test Average Service Class
 */

public class Test
{
    // Instance Variable
    private String courseName;

    // Secondary Constructor
    Test( String course )
    {
        this.courseName = course;
    }

    // Calculate Average Method
    public double calcAverage( int... newGrades )
    {
        double sum = 0.0;
        int count = 0;
        // Check if the passed value is an array and does not contain nulls
        if ( newGrades != null && newGrades.length > 0 )
        {
            for ( int i = 0; i < newGrades.length; i++ )
            {
                sum += newGrades[ i ]; // Add up all grades
                count++;
            }
        }
        return sum / count;
    }

    // toString Method
    public String toString()
    {
        return "The average for " + this.courseName + " is: ";
    }
}
