package pl.sdaacademy.WeatherRestApi.movie;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepository {

    private final List<Movie> movies = new ArrayList<>();

    public List<Movie> get(){
        return movies;
    }
    public Movie add(Movie movie){
        movies.add(movie);
        return movie;
    }

}
