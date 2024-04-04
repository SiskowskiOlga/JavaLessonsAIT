package lesson23;
import java.util.Objects;
public class Movie {
    /*Создать программу для управления каталогом фильмов
    в кинотеатре. Каждый фильм в каталоге должен быть
    уникальным и характеризоваться названием, годом выпуска и жанром.
    Необходимо реализовать возможность добавления фильмов в каталог,
    исключая возможность добавления дубликатов,
    и предоставить функцию вывода всего каталога фильмов.
    */
    private String filmName;
    private int yearOfIssue;
    private String filmGenre;

    public Movie(String filmName, int yearOfIssue, String filmGenre) {
        this.filmName = filmName;
        this.yearOfIssue = yearOfIssue;
        this.yearOfIssue = yearOfIssue;
    }

    public String getFilmName() {
        return filmName;
    }

    public int getYearOfIssue() {

        return yearOfIssue;
    }

    public String getFilmGenre() {

        return filmGenre;
    }
    public boolean equals(Object o){
        if (this == o)return true;
        if (o == null || getClass() != o.getClass())return false;
        Movie movie = (Movie) o;
        return yearOfIssue == movie.yearOfIssue && Objects.equals(filmName,movie.filmName)&& Objects.equals(filmGenre, movie.filmGenre);
    }
    public int hashCode(){
        return Objects.hash(filmName, filmGenre, yearOfIssue);
    }

    public String toString() {

        return "Movie{" +
                "filmName='" + filmName + '\'' +
                ", filmGenre='" + filmGenre + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                '}';

    }
}

