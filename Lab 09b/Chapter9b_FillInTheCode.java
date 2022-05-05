/**
 * Ferid Ruano
 * 11/9/2018
 */

import java.util.*;

public class Chapter9b_FillInTheCode
{
    public static void main( String[] args )
    {
        ArrayList< String > languages = new ArrayList<>();
        languages.add( "SQL" );
        languages.add( "Java" );
        languages.add( "HTML" );
        languages.add( "PHP" );
        languages.add( "Perl" );
        languages.add( "Python" );
        languages.add( "C" );

        // ------> exercise 9b1
        // this code prints the number of elements in languages.

        // your code goes here

        System.out.println( "The number of elements is: " + languages.size() );

        System.out.println( "Done exercise 9b1.\n" );


        // ------> exercise 9b2
        // this code prints all the elements in languages.
        // use for-each loop

        // your code goes here

        for ( String language : languages )
        {
            System.out.println( language );
        }

        System.out.println( "Done exercise 9b2.\n" );


        // ------> exercise 9b3
        // this code prints and counts all the elements in languages that start with the letter P.
        // use for-each loop

        // your code goes here

        int letterCount = 0;

        for ( String language : languages )
        {
            if ( language.charAt( 0 ) == 'P' )
            {
                System.out.println( language );
                letterCount++;
            }
        }

        System.out.println( "Number of languages starting with P: " + letterCount );


        System.out.println( "Done exercise 9b3.\n" );


        // ------> exercise 9b4
        // this code retrieves the 9th element from languages if it is there (check the size)
        // and assigns it to the String variable webLanguage.

        final int NOT_FOUND = -1;
        String webLanguage = "undefined";

        // your code goes here

        if ( languages.size() >= 9 )
        {
            webLanguage = languages.get( 9 );
        }
        else
        {
            System.out.println( "9th Element: " + NOT_FOUND );
        }

        System.out.println( "webLanguages is set to = \"" + webLanguage + "\"" );
        System.out.println( "Done exercise 9b4.\n" );


        // ------> exercise 9b5
        // this code replaces "HTML in languages (if it is there)  with “C++”.
        // utilize ArrayList's indexOf method to find index of "HTML"

        // your code goes here

        if ( languages.contains( "HTML" ) )
        {
            languages.set( languages.indexOf( "HTML" ), "C++" );
        }
        System.out.println( languages.toString() );

        System.out.println( "Done exercise 9b5.\n" );


        // ------> exercise 9b6
        // this code finds the shortest name in languages:
        //    get the first element and save it as the current shortest
        //    use a regular for loop that starts at 1 to examine the rest of the collection

        // your code goes here

        String shortest = languages.get( 0 );
        for ( int i = 1; i < languages.size(); i++ )
        {
            if ( languages.get( i ).length() < shortest.length() )
            {
                shortest = languages.get( i );
            }
        }
        System.out.println( "Shortest Element is: " + shortest );

        System.out.println( "Done exercise 9b6.\n" );

        // ------> exercise 9b7
        // this code replaces element "PHP" with "Pascal" in languages
        // and utilizes ArrayList's toString method to print the content of languages


        // your code goes here

        languages.set( languages.indexOf( "PHP" ), "Pascal" );
        System.out.println( languages.toString() );

        System.out.println( "Done exercise 9b7." );
    }
}