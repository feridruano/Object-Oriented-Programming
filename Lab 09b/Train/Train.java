/**
 * Train class
 *
 * @author Ferid Ruano
 * @version 11/9/2018
 */

import java.util.*;
import java.io.*;

public class Train
{
    // TODO
    private ArrayList< Passenger > travelers;

    /**
     * Default constructor:
     * 1. Creates this.travelers object
     * 2. Calls addPassengersFromFile passing
     * the file name as the parameter
     */
    public Train( String fileName ) throws IOException
    {
        // TODO
        // IMPLEMENT THE METHOD
        this.travelers = new ArrayList<>();
        addPassengersFromFile( fileName );
    }

    /**
     * Secondary constructor:<BR>
     * 1. Creates this.travelers object
     * 2. Calls mutator method setTravelers
     *
     * @param newTravelers the ArrayList for travelers defined in the client
     */
    public Train( ArrayList< Passenger > newTravelers )
    {
        // TODO
        // IMPLEMENT THIS METHOD
        this.travelers = new ArrayList<>(  );
        setTravelers( newTravelers );
    }

    /**
     * addPassengers method:<BR>
     * Allows client to initialize the travelers list based on the list of passengers provided in the file.
     * You can assume that the file has the following format:
     * <name1> <serviceClass1>
     * <name2> <serviceClass2>
     * ...
     * <p>
     * Please remember that the file must be placed in the same folder if you are using DrJava
     * or at the project level if you are using IDEA
     * <p>
     * The method
     * reads from the file one data at a time: <name1> which is a String followed by <serviceClass1 >
     * creates a Passenger object
     * adds the Passenger object to the travelers list
     * <p>
     * Next it reads <name2> followed by <serviceClass2> and creates another
     * Passenger object and adds it to the travelers list.
     * <p>
     * The process continues until there are no more data to be read.
     * <p>
     * This method takes one parameter<BR>
     *
     * @param fileName the the name of the passengers text file
     */
    public void addPassengersFromFile( String fileName ) throws IOException
    {
        System.out.println( "*******Reading passengers data from file "
                + fileName + "*******" );

        File passengersFile = new File( fileName );
        Scanner scanFile = new Scanner( passengersFile );
        String currentName;
        int currentService;

        while ( scanFile.hasNext() )
        {
            // read name of passenger
            currentName = scanFile.next();
            // read service
            currentService = scanFile.nextInt();
            this.travelers.add( new Passenger( currentName, currentService ) );
        }
    }

    /**
     * Mutator method:
     * <p>
     * Fills this.travelers with NEW Passenger objects that are copies
     * of the Passenger objects from newTravelers list:
     * this.travelers.add( new Passenger( p.getName( ), p.getClassOfService( ) ) );
     *
     * @param newTravelers the new ArrayList for travelers
     */
    public void setTravelers( ArrayList< Passenger > newTravelers )
    {

        this.travelers.clear();
        // TODO
        // IMPLEMENT THE METHOD

        //this.travelers.add( new Passenger( newTravelers.get( ) );
        //  I don't know, wasn't able to get help at PLTL because classes kept getting canceled the last two weeks

    }

    /**
     * accessor method
     * accessor method that makes a copy of the travelers list and returns it to the caller
     * IMPORTANT also makes copy of Passenger objects (see setTravelers)
     *
     * @return the copy of travelers
     */
    public ArrayList< Passenger > getTravelers()
    {
        // TODO
        // IMPLEMENT THE METHOD

        return null; // THIS IS A STUB
    }


    /**
     * percentageFirstClassPassengers method
     * Computes the percentage of first class passengers on the train
     *
     * @return a double, the percentage of first class passengers on the train
     */
    public double percentageFirstClassPassengers()
    {
        // TODO
        // IMPLEMENT THE METHOD

        return 0; // THIS IS A STUB
    }

    /**
     * trainRevenues method
     * Computes the total revenues for the train based on first and second class ticket prices
     *
     * @param firstClassPrice  the price of a first class ticket
     * @param secondClassPrice the price of a second class ticket
     * @return a double, the total revenues for the train
     */
    public double trainRevenues( double firstClassPrice, double secondClassPrice )
    {
        // TODO
        // IMPLEMENT THE METHOD

        return 0; // THIS IS A STUB
    }

    /**
     * isOnTrain method
     * Searches if a person is on the train
     *
     * @param passengerName the name of a passenger
     * @return a Passenger  if person is on the train, null otherwise
     */
    public Passenger isOnTrain( String passengerName )
    {
        // TODO
        // IMPLEMENT THE METHOD

        return null; // THIS IS A STUB
    }

    /**
     * setAllPassengersClassOfService method
     * Checks if all passengers on the train have the given
     * value of clasOfService. If not changes the value accordingly
     *
     * @param newClassOfService the value of clasOfService
     */

    public void setAllPassengersClassOfService( int newClassOfService )
    {
        // TODO
        // IMPLEMENT THE METHOD

    }

    /**
     * toString
     *
     * @return elements of travelers one passenger per line
     * or "The train is empty" message if there are
     * no passengers on the train
     */
    public String toString()
    {
        // TODO
        // IMPLEMENT THE METHOD

        return "???"; // THIS IS A STUB
    }

    /**
     * equals
     *
     * @param other Train object
     * @return return true if elements of ArrayList in other train are equal to
     * corresponding elements in this object
     * and ArrayLists have the same size
     */
    public boolean equals( Train other )
    {
        // TODO
        // IMPLEMENT THE METHOD
        return other.travelers.equals( this.travelers );
    }
}