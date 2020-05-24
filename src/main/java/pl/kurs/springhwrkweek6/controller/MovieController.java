package pl.kurs.week6.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.kurs.week6.aspect.MovieAspect;
import pl.kurs.week6.model.Movie;
import pl.kurs.week6.service.MovieService;

import java.util.ArrayList;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public ArrayList<Movie> getMovies() {
        return movieService.getMovieList();
    }

    @PostMapping
    @MovieAspect
    public ResponseEntity<Movie> addMovie(@RequestBody Movie newMovie) {
        if (movieService.addMovie(newMovie)) {
            return new ResponseEntity<Movie>(newMovie, HttpStatus.CREATED);
        }
        return new ResponseEntity((HttpStatus.INTERNAL_SERVER_ERROR));
    }

}
