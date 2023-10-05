package com.crostsoft.movie.mapper;

import com.crostsoft.movie.dto.MovieDto;
import com.crostsoft.movie.entity.Movie;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface MovieMapper {

    MovieMapper INSTANCE = Mappers.getMapper(MovieMapper.class);
    Movie toMovie(MovieDto movieDto);
    MovieDto toMovieDto(Movie movie);
}
