// Name: Ferid Ruano
// Date: 10/22/18
// Class: COMP 150
// Desc: TV Channel Client Class

// Import Packages
import java.util.Scanner;

public class TelevisionChannelClient
{
    public static void main(String[] args)
    {
        // New Scanner
        Scanner keyboard = new Scanner(System.in);

        // Object
        TelevisionChannel Channel = new TelevisionChannel();

        // Set Instance Variables for Channel Object
        System.out.println("What is the name of the channel: ");
        Channel.setName(keyboard.next());
        System.out.println("What is the Channel Number: ");
        Channel.setNumber(keyboard.nextInt());
        System.out.println("Is it a Cable Channel? (True or False)");
        Channel.setCable(keyboard.nextBoolean());

        // Output Channel Object Data
        System.out.println(Channel.toString());

        // Output presetChannel Object
        TelevisionChannel presetChannel = new TelevisionChannel("ESPN", 431, true);
        System.out.println("\nPreset Channel Data:\n" + presetChannel.toString());
    }
}
