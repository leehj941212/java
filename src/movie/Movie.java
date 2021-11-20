package movie;

import java.util.List;

public class Movie {

    private String name;
    private List<MovieTime> movieTime;
    private MovieSeat movieSeat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MovieTime getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(MovieTime movieTime) {
        this.movieTime = movieTime;
    }

    public MovieSeat getMovieSeat() {
        return movieSeat;
    }

    public void setMovieSeat(MovieSeat movieSeat) {
        this.movieSeat = movieSeat;
    }

}