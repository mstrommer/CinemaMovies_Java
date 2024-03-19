package oop.polymorph.solution;

import java.util.Date;

/**
 * The CinemaMovieClassic class represents a classic movie.
 * It extends the CinemaMovieBase class.
 */
public class CinemaMovieClassic extends CinemaMovieBase {
    
       


    /**
     * Constructs a CinemaMovieClassic object with the specified start date, title,
     * genre, and number of love chairs.
     * 
     * @param startDate          The start date of the movie.
     * @param title              The title of the movie.
     * @param genre              The genre of the movie.
     * @param numberOfLoveChairs The number of love chairs available in the cinema.
     */
    public CinemaMovieClassic(Date startDate, String title, String genre, int numberOfLoveChairs) {
           
    }

    /**
     * Returns a teaser message for the classic movie, including the number of love
     * chairs available.
     * Overrides the displayTeaser method in the parent class.
     * 
     * @return A teaser message for the classic movie.
     */
    @Override
    public String displayTeaser() {
           

    }
}
