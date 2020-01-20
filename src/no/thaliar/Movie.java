package no.thaliar;

public class Movie extends Product{
    enum MovieGenre {
        DRAMA,
        COMEDY,
        ACTION,
        DOCUMENTARY
    }

    private String title;
    private MovieGenre genre;

    private String director;

    public Movie (String title, MovieGenre genre, int price){
        this.title = title;
        this.genre = genre;
        this.price = price;

    }

    public Movie (String title, MovieGenre genre, int price, String director){
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.director = director;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }


    public void printMovieDetails() {
        if (this.director == null) {
            System.out.println("Title: " + getTitle() + "\nGenre: " + getGenre() + "\nPrice: " + getPrice());
        } else {
            System.out.println("Title: " + getTitle() + "\nGenre: " + getGenre() + "\nPrice: " + getPrice() + "\nDirector: " + getDirector());
        }
    }
}
