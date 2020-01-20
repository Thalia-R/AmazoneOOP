package no.thaliar;

public class Book extends Product{
    private String title;
    private String author;


    public Book (String title, String author, int price, Long productId){
        this.title = title;
        this.author = author;
        this.price = price;
        this.productId = productId;
    }

 @Override
    public String toString () {
        return "Title: " + title + "\nAuthor: " + author + "\nPrice:" + price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void printBookDetails() {
        System.out.println("Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nPrice: " + getPrice());
    }
}
