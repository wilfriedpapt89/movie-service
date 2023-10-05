package com.crostsoft.movie.service;

import com.crostsoft.movie.dto.MovieDto;
import com.crostsoft.movie.entity.Movie;

import java.util.Optional;

public interface MovieService {

    MovieDto findById(Long id);
}
