package oop.polymorph.solution;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CinemaMovie3DTests {

    @Test
    public void displayTeaser_basicDataOfTeaserAreDisplayed() {
        String title = "Rambo 2";
        String genre = "Action";
        Date startDate = new Date(2024, 6, 4, 13, 30);
        int numberOfLoveChairs = 13;
        CinemaMovieBase instanceUnderTest =
                new CinemaMovie3D(
                        startDate,
                        title,
                        genre);
        String product = "Extra large popcorn !";
        instanceUnderTest.addAdditionalProduct(product);

        String teaser = instanceUnderTest.displayTeaser();

        assertThat(teaser).
                contains(title).
                contains(genre).
                contains(startDate.toString()).
                contains("Full 3D support given !").
                contains(product);
    }
}
