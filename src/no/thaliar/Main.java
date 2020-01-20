package no.thaliar;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        Book bok1 = new Book("Harry Potter","J. K. Rowling",199);
        Book bok2 = new Book("Lord of the rings", "J. R. R. Tolkien", 249);

        Movie movie1 = new Movie("Pulp Fiction",Movie.MovieGenre.ACTION, 299);
        Movie movie2 = new Movie("Star Wars",Movie.MovieGenre.ACTION, 349);
        Movie movie3 = new Movie("Star Wars",Movie.MovieGenre.ACTION, 349, "lam");

        System.out.println(bok1);

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(bok1);
        books.add(bok2);
        for (Book book : books) {
            book.printBookDetails();
        }

        Movie[] movies = new Movie[3];
        movies[0] = movie1;
        movies[1] = movie2;
        movies[2] = movie3;

        for (int i = 0; i < movies.length; i++) {
            movies[i].printMovieDetails();
        }
    }
}
