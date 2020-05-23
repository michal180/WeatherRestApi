package pl.sdaacademy.WeatherRestApi.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/movie")
@RestController
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    public List<Movie> getAll() {
        return movieService.getAllMovies();
    }

    public Movie addMovie(@Valid @RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }
}


