package lesson23;
import java.util.HashSet;
public class TestMovieCatalog {

    public static void main(String[] args) {
        MovieCatalog movieCatalog = new MovieCatalog();

        movieCatalog.addMovie(new Movie("Terminator", 2001,"Triller" ));
        movieCatalog.addMovie(new Movie("Triller", 2001, "Triller"));
        movieCatalog.addMovie(new Movie("Хоббит",2020,"Fantesie"));
        movieCatalog.addMovie(new Movie("Дракула",2000,"Fantesie"));

        HashSet<Movie> resultFilterByGenre =  movieCatalog.filterMoviesByGenreSmall("Фентези");
        System.out.println("-------");
        resultFilterByGenre.forEach(System.out::println);
        System.out.println("-------");

        movieCatalog.printFilmInfo();
        movieCatalog.deleteMovie(new Movie("Дракула",2000,"Fentesie"));
        movieCatalog.printFilmInfo();

    }
}
