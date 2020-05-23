package pl.sdaacademy.WeatherRestApi.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;


    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.get();
    }

    public Movie addMovie(Movie movie) {
        movieRepository.get().stream()
                .filter((Movie m) -> {
                    return m.getId() == movie.getId();
                })
                .findAny()
                .ifPresent((Movie a) -> {
                    throw new IllegalArgumentException("duplicated movie!");
                });
        return movieRepository.add(movie);

    }
}
