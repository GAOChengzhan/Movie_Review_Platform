package chengzhan.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @GetMapping
    public ResponseEntity<String> getMovies() {
        return new ResponseEntity<String>("All Movies", HttpStatus.OK);
    }

}