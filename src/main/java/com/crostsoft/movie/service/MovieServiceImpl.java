package com.crostsoft.movie.service;

import com.crostsoft.movie.dto.MovieDto;
import com.crostsoft.movie.mapper.MovieMapper;
import com.crostsoft.movie.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;
    public final MovieMapper movieMapper;

    @Override
    public MovieDto findById(Long id) {
        return movieMapper.toMovieDto(movieRepository.findById(id).orElseThrow(NoSuchElementException::new));
    }
}
