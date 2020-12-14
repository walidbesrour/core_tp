package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepository;

import java.util.ArrayList;
import java.util.List;

public class MovieService {

    private MovieRepository movieRepository = new MovieRepository();

    public void registerMovie(Movie movie){
    movieRepository.add(movie);
    }

}
