// Name: Ferid Ruano
// Date: 10/22/18
// Class: COMP 150
// Desc: TV Channel Service Class

// Import Packages
public class TelevisionChannel
{
    // Instance Variables
    private String name;
    private int number;
    private boolean cable;

    // Default Constructor
    public TelevisionChannel()
    {
        name = "";
        number = 0;
        cable = false;
    }

    // Secondary Constructor
    public TelevisionChannel(String startName, int startNumber, boolean startCable)
    {
        setName(startName);
        setNumber(startNumber);
        setCable(startCable);
    }

    // Accessor Method
    public String getName()
    {
        return name;
    }

    // Accessor Method
    public int getNumber()
    {
        return number;
    }

    // Accessor Method
    public boolean getcable()
    {
        return cable;
    }

    // Mutator Method
    public void setName(String newName)
    {
        name = newName;
    }

    // Mutator method
    public void setNumber(int newNumber)
    {
        number = newNumber;
    }

    // Mutator Method
    public void setCable(boolean newCable)
    {
        cable = newCable;
    }

    // Business Method
    public int business()
    {
        int digits = 0;
        while (number > 0)
        {
            number /= 10;
            digits++;
        }
        return digits;
    }

    // Return a String
    public String toString(){
        return "Channel Name: " + getName()
                + "\nChannel Number: " + getNumber()
                + "\nCable Channel: " + getcable()
                + "\nNumber of Channel Digits: " + business();
    }
}
