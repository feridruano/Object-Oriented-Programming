/*
 * Ferid Ruano
 * 11/5/2018
 * COMP 150 - 8AM
 * Weekly Temperature Service Class
 */

public class WeekTemp
{
    // Instance Variable Array
    private double[] temperatures = new double[ 7 ];
    private final int FREEZING = 32;

    // Secondary Constructor
    WeekTemp( double[] newTemp )
    {
        setTemperatures( newTemp );
    }

    // Get temperatures Array
    public double[] getTemperatures()
    {
        return this.temperatures;
    }

    // Set temperatures Array
    public void setTemperatures( double[] temperatures )
    {
        this.temperatures = temperatures;
    }

    // toString Method
    public String toString()
    {
        String returnValue = "";
        for ( int i = 0; i < this.temperatures.length; i++ )
        {
            returnValue += this.temperatures[ i ] + " ";
        }
        return returnValue += "\n";
    }

    // Equals Method
    public boolean equals( WeekTemp obj )
    {
        boolean isEqual = true;
        if ( this.temperatures.length != obj.temperatures.length )
        {
            isEqual = false;
        }
        else
        {
            for ( int i = 0; i < this.temperatures.length && isEqual; i++ )
            {
                if ( this.temperatures[ i ] != obj.temperatures[ i ] )
                {
                    isEqual = false;
                }
            }
        }
        return isEqual;
    }

    // Number of days below freezing
    public int howManyDaysBelowFreezing()
    {
        int daysBelow = 0;
        for ( int i = 0; i < this.temperatures.length; i++ )
        {
            if ( this.temperatures[ i ] < FREEZING )
            {
                daysBelow++;
            }
        }
        return daysBelow;
    }

    // Get Temperatures Above 100
    public double[] getTemperaturesAbove100()
    {
        // Determine Array Size
        int arraySize = 0;
        for ( int i = 0; i < this.temperatures.length; i++ )
        {
            if ( this.temperatures[ i ] > 100 )
            {
                arraySize++;
            }
        }

        // New Array & Find Temperatures Greater than 100 to be Add into New array
        double[] temperaturesAbove100 = new double[ arraySize ];
        int k = 0; // Array Index Counter
        while ( k < arraySize )
        {
            for ( int i = 0; i < this.temperatures.length; i++ )
            {
                if ( this.temperatures[ i ] > 100 )
                {
                    temperaturesAbove100[ k ] = this.temperatures[ i ]; // Error
                    k++; // Update Array Index Counter
                }
            }
        }
        return temperaturesAbove100;
    }

    // Get Highest Temperature
    public double getHighest()
    {
        double highestTemp = this.temperatures[ 0 ]; // Highest Temperature Default
        for ( int i = 0; i < this.temperatures.length - 1; i++ )
        {
            if ( this.temperatures[ i ] > highestTemp )
            {
                highestTemp = this.temperatures[ i ]; // If Array at Index[i] is Greater then update highestTemp
            }
        }
        return highestTemp;
    }
}
