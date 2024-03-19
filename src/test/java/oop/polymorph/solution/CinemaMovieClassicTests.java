package oop.polymorph.solution;

import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class CinemaMovieClassicTests {

    @Test
    public void displayTeaser_basicDataOfTeaserAreDisplayed() {
        String title = "Rambo 2";
        String genre = "Action";
        Date startDate = new Date(2024, 6, 4, 13, 30);
        int numberOfLoveChairs = 13;
        CinemaMovieBase instanceUnderTest =
                new CinemaMovieClassic(
                        startDate,
                        title,
                        genre,
                        numberOfLoveChairs);
        String product = "Extra large popcorn !";
        instanceUnderTest.addAdditionalProduct(product);

        String teaser = instanceUnderTest.displayTeaser();

        assertThat(teaser).
                contains(title).
                contains(genre).
                contains(startDate.toString()).
                contains(String.format("%d love-chairs available !", numberOfLoveChairs)).
                contains(product);
    }
}
