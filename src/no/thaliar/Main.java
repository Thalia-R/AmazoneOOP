package no.thaliar;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        Book bok1 = new Book("Harry Potter","J. K. Rowling",199, 2083748958L);
        Book bok2 = new Book("Lord of the rings", "J. R. R. Tolkien", 249,10099384747L);
        ChildrensBook bok3 = new ChildrensBook("Fant", "T.R.K", 150, "From 4 years", 109928746L);

        Movie movie1 = new Movie("Pulp Fiction",Movie.MovieGenre.ACTION, 299);
        Movie movie2 = new Movie("Star Wars",Movie.MovieGenre.ACTION, 349);
        Movie movie3 = new Movie("Star Wars",Movie.MovieGenre.ACTION, 349, "lam");

        System.out.println(bok3);

        ArrayList<Product> products = new ArrayList<Product>();
        products.add(bok1);
        products.add(bok2);
        products.add(bok3);
        products.add(movie1);
        products.add(movie2);
        products.add(movie3);
        for (Product product : products) {
            if (product instanceof Book) {
                Book book = (Book)product;
                book.printBookDetails();
            }   else if (product instanceof Movie) {
                Movie movie = (Movie)product;
                movie.printMovieDetails();
            }
        }
    }
}
