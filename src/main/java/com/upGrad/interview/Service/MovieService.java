package com.upGrad.interview.Service;

import com.upGrad.interview.Entity.MoviesEntity;
import com.upGrad.interview.Dto.MovieDto;
import org.springframework.http.ResponseEntity;




@Service
public class MovieService {

    // Simulating in-memory database for demonstration purposes
    private Map<Integer, MoviesEntity> movieMap;

    public MovieService() {
        // Initialize the movie map
        movieMap = new HashMap<>();
        // Populate some sample movies for demonstration
        movieMap.put(1, new Movie(1, "The Shawshank Redemption", 1994, 142, "R", "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency."));
        movieMap.put(2, new Movie(2, "The Godfather", 1972, 175, "R", "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son."));
        movieMap.put(3, new Movie(3, "The Dark Knight", 2008, 152, "PG-13", "When the menace known as The Joker emerges from his mysterious past, he wreaks havoc and chaos on the people of Gotham."));
    }

    // Method to retrieve a movie by ID
    public MoviesEntity getMovieById(Integer id) {
        return movieMap.getOrDefault(id, null);
    }
}
