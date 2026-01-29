package com.tothenew.java8.ques8;

import java.util.Optional;

public class Movie {
    private String title;
    private String director;

    Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    // :: director might be null
    public Optional<String> getDirector() {
        return Optional.ofNullable(director);
    }
}
