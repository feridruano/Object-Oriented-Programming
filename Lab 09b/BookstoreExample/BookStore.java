/**
 * BookStore class
 * Ferid Ruano
 * 11/9/18
 */

import java.util.ArrayList;

public class BookStore
{
    private ArrayList< Book > library;
    private final int NOT_FOUND = -1;

    /**
     * default constructor
     * instantiates ArrayList of Books
     */
    public BookStore()
    {
        this.library = new ArrayList<>();
        this.library.add( new Book( "Intro to Java", "James", 56.99 ) );
        this.library.add( new Book( "Advanced Java", "Green", 65.99 ) );
        this.library.add( new Book( "Java Servlets", "Brown", 75.99 ) );
        this.library.add( new Book( "Intro to HTML", "James", 29.49 ) );
        this.library.add( new Book( "Intro to Perl", "James", 34.99 ) );
        this.library.add( new Book( "Advanced HTML", "Greenberg", 56.99 ) );
        this.library.trimToSize();
    }

    /**
     * toString
     *
     * @return each book in library, one per line
     */
    public String toString()
    {
        String result = "";
        for ( Book tempBook : this.library )
        {
            result += tempBook.toString() + "\n";
        }
        return result;
    }

    /**
     * Generates list of books containing searchString
     *
     * @param searchString the keyword to search for
     * @return the ArrayList of books containing the keyword
     */
    public ArrayList< Book > searchForTitle( String searchString )
    {
        ArrayList< Book > searchResult = new ArrayList<>();
        for ( Book currentBook : this.library )
        {
            if ( ( currentBook.getTitle().toLowerCase() ).indexOf( searchString ) != NOT_FOUND )
            { searchResult.add( currentBook ); }
        }
        searchResult.trimToSize();
        return searchResult;
    }

    // TODO - Ferid
    // Get Books By Author
    public ArrayList< Book > searchForAuthor( String searchAuthor )
    {
        ArrayList< Book > searchResult = new ArrayList<>();

        // Foreach to Add Books to searchResult Arraylist
        for ( Book currentBook : this.library )
        {
            if ( ( currentBook.getAuthor().toLowerCase() ).indexOf( searchAuthor ) != NOT_FOUND )
            {
                searchResult.add( currentBook );
            }
        }
        searchResult.trimToSize(); // Resize Arraylist
        return searchResult;
    }

    // Get Books Below Price
    public ArrayList< Book > searchByPrice( String searchPrice )
    {
        ArrayList< Book > searchResult = new ArrayList<>();

        // Foreach to Add Books to SearchResult Arraylist
        for ( Book currentBook : this.library )
        {
            if ( currentBook.getPrice() <= Double.parseDouble( searchPrice ) )
            {
                searchResult.add( currentBook );
            }
        }
        searchResult.trimToSize(); // Resize Arraylist
        return searchResult;
    }

    // Get Lowest Price Book
    public Book searchForLowestPrice()
    {
        ArrayList< Book > searchResult = new ArrayList<>();
        searchResult.add( this.library.get( 0 ) );

        // For to Get Lowest Priced Book Object
        for ( int i = 1; i < this.library.size(); i++ )
        {
            if ( this.library.get( i ).getPrice() < searchResult.get( 0 ).getPrice() )
            {
                searchResult.set( 0, this.library.get( i ) ); // Sets index 0 in searchResult Arraylist to lowest priced book
            }
        }
        searchResult.trimToSize(); // Resize Arraylist
        return searchResult.get( 0 );
    }
}
