package com.tothenew.java8.ques8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    List<Movie> movieList = Arrays.asList(
            new Movie("Minions", null),
            new Movie("Inception", "Christopher Nolan"),
            new Movie("Avatar", "James Cameron"),
            new Movie("Titanic", "James Cameron"),
            new Movie("Up", null),
            new Movie("Interstellar", "Christopher Nolan"),
            new Movie("Frozen", null)
    );

    public List<Movie> getMovieList() {
        return movieList;
    }

    public Optional<Movie> findMovieByName(String title) {
        for (Movie temp : movieList) {
            if (temp.getTitle().equalsIgnoreCase(title)) {
                return Optional.of(temp);
            }
        }
        return Optional.empty();
    }

    static void main(String[] args) {

        OptionalExample example = new OptionalExample();

        String movieName = "Minions";

        Optional<Movie> watchMovie = example.findMovieByName(movieName);

        watchMovie.ifPresent(movie -> System.out.println(movie.getTitle()));


        String director = watchMovie
                .flatMap(Movie::getDirector)
                .orElse("Director info not available :(");
        System.out.println("Director: " + director);

        String found = example.getMovieList().stream().filter((item) -> item.getTitle().equalsIgnoreCase(movieName)).findFirst().get().getTitle();
        System.out.println("Found the specific " + found);

        Movie fallbackMovie = example.findMovieByName(movieName).orElseGet(() -> new Movie(movieName, ""));
        System.out.println("If not found Creating new Object: "+ fallbackMovie.getTitle() );

        try {
            Movie mustExist = example.findMovieByName("Random")
                    .orElseThrow(() -> new RuntimeException("Movie not found!"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
