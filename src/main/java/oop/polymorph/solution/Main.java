package oop.polymorph.solution;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        CinemaMovieClassic theGreatest = new CinemaMovieClassic(new Date(2024, 9, 20, 18, 30),
                "Hero", "Action", 13);
        theGreatest.addAdditionalProduct("Extra large popcorn !");
        CinemaMovie3D hero3D = new CinemaMovie3D(
                new Date(2024, 7, 17, 18, 30), "Hero",
                "Love and Emotions");
        hero3D.addAdditionalProduct("3D Glasses with action support !");
        CinemaMovieDriveIn princessOfWales = new CinemaMovieDriveIn(
                new Date(2024, 7, 17, 18, 30), "Princess of Wales",
                "Love and Emotions",
                5);
        princessOfWales.addAdditionalProduct("Gasoline voucher !");
        CinemaMovieBase[] movies = {
                theGreatest, hero3D, princessOfWales
        };
        System.out.println("*************** Display Teaser with new solution !");
        for (CinemaMovieBase movie : movies) {
            System.out.println(movie.displayTeaser());

        }
    }
}
