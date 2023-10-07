package com.crostsoft.movie.controller;

import com.crostsoft.movie.dto.MovieDto;
import com.crostsoft.movie.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/films")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000", methods = {RequestMethod.POST, RequestMethod.GET})
public class MovieController {

    private final MovieService movieService;

    @GetMapping("/{movieId}")
    public ResponseEntity<MovieDto> findAMovieById(@PathVariable Long movieId) {
        Thread thread = Thread.currentThread();
        synchronized (thread) {
            try {
                thread.wait(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        return new ResponseEntity<>(movieService.findById(movieId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<MovieDto> createMovie(@RequestBody MovieDto movieDto) {
        return new ResponseEntity<>(movieService.createMovie(movieDto), HttpStatus.CREATED);
    }
}
