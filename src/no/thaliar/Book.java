package no.thaliar;

public class Book {
    private String title;
    private String author;
    private int price;

    public Book (String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
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

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void printBookDetails() {
        System.out.println("Title: " + this.getTitle() + "\nAuthor: " + this.getAuthor() + "\nPrice: " + this.getPrice());
    }
}
