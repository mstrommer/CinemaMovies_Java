package oop.polymorph.solution;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CinemaMovieDriveInTests {

    @Test
    public void displayTeaser_basicDataOfTeaserAreDisplayed() {
        int maxCarLength = 4;
        String title = "Rambo 2";
        String genre = "Action";
        Date startDate = new Date(2024, 6, 4, 13, 30);
        CinemaMovieBase instanceUnderTest =
                new CinemaMovieDriveIn(
                        startDate,
                        title,
                        genre,
                        maxCarLength);
        String product = "Gas station voucher !";
        instanceUnderTest.addAdditionalProduct(product);

        String teaser = instanceUnderTest.displayTeaser();

        assertThat(teaser).
                contains(title).
                contains(genre).
                contains(startDate.toString()).
                contains(String.format("Maximum length of car is %d meter !", maxCarLength)).
                contains(product);
    }
}
