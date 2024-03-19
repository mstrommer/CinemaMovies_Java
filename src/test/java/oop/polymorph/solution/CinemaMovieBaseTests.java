package oop.polymorph.solution;

import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class CinemaMovieBaseTests {

    @Test
    public void listAdditionalProduct_noProductAdded_returnsNull() {
        CinemaMovieBase instanceUnderTest =
                new CinemaMovieBase(
                        new Date(2024,6,4,13,30),
                        "Rambo 2",
                        "Action");

        String product = instanceUnderTest.listAdditionalProduct();

        assertThat(product).isNull();
    }

    @Test
    public void listAdditionalProduct_addsProduct_returnsProperProduct() {
        CinemaMovieBase instanceUnderTest =
                new CinemaMovieBase(
                        new Date(2024,6,4,13,30),
                        "Rambo 2",
                        "Action");
        String productString = "Extra Large Popcorn";
        instanceUnderTest.addAdditionalProduct(productString);

        String product = instanceUnderTest.listAdditionalProduct();

        assertThat(product).contains(productString);
    }

    @Test
    public void displayTeaser_basicDataOfTeaserAreDisplayed() {
        String title = "Rambo 2";
        String genre = "Action";
        Date startDate = new Date(2024, 6, 4, 13, 30);
        CinemaMovieBase instanceUnderTest =
                new CinemaMovieBase(
                        startDate,
                        title,
                        genre);

        String teaser = instanceUnderTest.displayTeaser();

        assertThat(teaser).
                contains(title).
                contains(genre).
                contains(startDate.toString());
    }
}
