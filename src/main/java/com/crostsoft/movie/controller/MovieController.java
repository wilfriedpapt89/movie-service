package com.crostsoft.movie.controller;

import com.crostsoft.movie.dto.MovieDto;
import com.crostsoft.movie.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/films")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping("/{movieId}")
    public ResponseEntity<MovieDto> findAMovieById(@PathVariable Long movieId) {
        return new ResponseEntity<>(movieService.findById(movieId), HttpStatus.OK);
    }
}
