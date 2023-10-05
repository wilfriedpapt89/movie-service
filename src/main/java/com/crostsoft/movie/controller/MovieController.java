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
@CrossOrigin(origins = "http://localhost:3000")
public class MovieController {

    private final MovieService movieService;

    @GetMapping("/{movieId}")
    public ResponseEntity<MovieDto> findAMovieById(@PathVariable Long movieId) {
        return new ResponseEntity<>(movieService.findById(movieId), HttpStatus.OK);
    }
}
