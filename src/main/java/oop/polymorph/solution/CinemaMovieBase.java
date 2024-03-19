package oop.polymorph.solution;

import java.util.Date;

/**
 * The CinemaMovieBase class represents a base class for cinema movies.
 */
public class CinemaMovieBase {

    protected Date startDate;
    protected String title;
    protected String genre;
    protected String additionalProduct;

    /**
     * Constructs a CinemaMovieBase object with the specified start date, title, and
     * genre.
     * 
     * @param startDate The start date of the movie.
     * @param title     The title of the movie.
     * @param genre     The genre of the movie.
     */
    public CinemaMovieBase(Date startDate, String title, String genre) {
         this.startDate = startDate;
         this.title = title;
         this.genre = genre;
    }

    /**
     * Returns the additional product associated with the movie.
     * 
     * @return The additional product associated with the movie.
     */
    public String listAdditionalProduct() {
         return this.additionalProduct;
    }

    /**
     * Returns a teaser message for the movie.
     * 
     * @return A teaser message for the movie.
     */
    public String displayTeaser() {
         return this.title + System.lineSeparator() +
                 this.startDate + System.lineSeparator() +
                 this.genre;
    }

    /**
     * Adds an additional product associated with the movie.
     * 
     * @param product The additional product to be added.
     */
    public void addAdditionalProduct(String product) {
         this.additionalProduct = product;
    }
}
