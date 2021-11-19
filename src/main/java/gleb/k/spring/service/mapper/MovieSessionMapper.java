package gleb.k.spring.service.mapper;

import gleb.k.spring.dto.request.MovieSessionRequestDto;
import gleb.k.spring.dto.response.MovieSessionResponseDto;
import gleb.k.spring.model.MovieSession;
import gleb.k.spring.service.CinemaHallService;
import gleb.k.spring.service.MovieService;
import gleb.k.spring.util.DateTimePatternUtil;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Component;

@Component
public class MovieSessionMapper implements RequestDtoMapper<MovieSessionRequestDto, MovieSession>,
        ResponseDtoMapper<MovieSessionResponseDto, MovieSession> {
    private final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern(DateTimePatternUtil.DATE_TIME_PATTERN);
    private final CinemaHallService cinemaHallService;
    private final MovieService movieService;

    public MovieSessionMapper(CinemaHallService cinemaHallService, MovieService movieService) {
        this.cinemaHallService = cinemaHallService;
        this.movieService = movieService;
    }

    @Override
    public MovieSession mapToModel(MovieSessionRequestDto dto) {
        MovieSession movieSession = new MovieSession();
        movieSession.setMovie(movieService.get(dto.getMovieId()));
        movieSession.setCinemaHall(cinemaHallService.get(dto.getCinemaHallId()));
        movieSession.setShowTime(LocalDateTime.parse(dto.getShowTime(), formatter));
        return movieSession;
    }

    @Override
    public MovieSessionResponseDto mapToDto(MovieSession movieSession) {
        MovieSessionResponseDto responseDto = new MovieSessionResponseDto();
        responseDto.setMovieSessionId(movieSession.getId());
        responseDto.setCinemaHallId(movieSession.getCinemaHall().getId());
        responseDto.setMovieId(movieSession.getMovie().getId());
        responseDto.setMovieTitle(movieSession.getMovie().getTitle());
        responseDto.setShowTime(movieSession.getShowTime().format(formatter));
        return responseDto;
    }
}
