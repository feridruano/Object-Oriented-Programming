/* BookSearchEngine class
 * Ferid Ruano
 * 11/9/18
 */

import java.util.*;

public class BookSearchEngine
{
    public static void main( String[] args )
    {
        BookStore bookStore = new BookStore();
        System.out.println( "\nOur book collection is:" );
        System.out.println( bookStore );

        Scanner keyboard = new Scanner( System.in );

        System.out.println( "\nSearching titles, enter a keyword" );
        String keyword = keyboard.next();
        ArrayList< Book > result = bookStore.searchForTitle( keyword.toLowerCase() );
        System.out.println( "The search results for \"" + keyword
                + "\" are:" );
        if ( result.size() > 0 )
        {
            for ( Book tempBook : result )
            { System.out.println( tempBook ); }
        }
        else
        {
            System.out.println( "No book meeting your search criteria has been found" );
        }

        // TODO - FERID
        // Get Books by Author
        System.out.println( "\nEnter an author to search each book for:" );
        keyword = keyboard.next(); // User Input
        ArrayList< Book > authorResult = bookStore.searchForAuthor( keyword.toLowerCase() );
        System.out.println( "The search results for \"" + keyword
                + "\" are:" );

        // Get Results
        if ( authorResult.size() > 0 )
        {
            for ( Book tempBook : authorResult ) // Foreach
            {
                System.out.println( tempBook ); // Print Book Details
            }
        }
        else
        {
            System.out.println( "No book meeting your search criteria has been found" );
        }


        // Get Books Below Searched Price
        System.out.println( "\nEnter a price limit to search each book for:" );
        keyword = keyboard.next(); // USer Input
        ArrayList< Book > priceResult = bookStore.searchByPrice( keyword );
        System.out.println( "The search results for books under \"$" + keyword
                + "\" are:" );

        // Get Results
        if ( priceResult.size() > 0 )
        {
            for ( Book tempBook : priceResult ) // Foreach
            {
                System.out.println( tempBook ); // Print Book Details
            }
        }
        else
        {
            System.out.println( "No book meeting your search criteria has been found" );
        }

        // Get Lowest Priced Book
        System.out.println( "\nThe book in the library with the lowest price is: \n" + bookStore.searchForLowestPrice() );
    }
}
