package oop.polymorph.solution;

import java.util.Date;

/**
 * The CinemaMovieDriveIn class represents a movie shown at a drive-in cinema.
 * It extends the CinemaMovieBase class.
 */
public class CinemaMovieDriveIn extends CinemaMovieBase {
       

    /**
     * Constructs a CinemaMovieDriveIn object with the specified start date, title,
     * genre, and maximum car length.
     * 
     * @param startDate    The start date of the movie.
     * @param title        The title of the movie.
     * @param genre        The genre of the movie.
     * @param maxCarLength The maximum length of cars allowed in the drive-in
     *                     cinema.
     */
    public CinemaMovieDriveIn(Date startDate, String title, String genre, int maxCarLength) {
           
    }

    /**
     * Returns a teaser message for the drive-in cinema movie, including the maximum
     * car length.
     * Overrides the displayTeaser method in the parent class.
     * 
     * @return A teaser message for the drive-in cinema movie.
     */
    @Override
    public String displayTeaser() {
           
    }
}
