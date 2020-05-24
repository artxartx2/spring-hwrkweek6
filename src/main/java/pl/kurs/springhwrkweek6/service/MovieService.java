package pl.kurs.week6.service;

import org.springframework.stereotype.Service;
import pl.kurs.week6.model.Movie;

import java.util.*;

@Service
public class MovieService {

    private ArrayList<Movie> movieList;

    public MovieService() {

        movieList = new ArrayList<>();
        movieList.add(new Movie("Mad Max", 1979));
        movieList.add(new Movie("Mad Max 2", 1981));
        movieList.add(new Movie("Mad Max Beyond Thunderdome", 1985));
        movieList.add(new Movie("Mad Max Fury Road", 2015));
    }

    public ArrayList<Movie> getMovieList() {
        return this.movieList;
    }

    public boolean addMovie( Movie newMovie){
        return movieList.add(newMovie);
    }
}
