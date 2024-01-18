package AggregationArray;


import java.util.Arrays;

public class Book {
    private String title;
    private Author[] authors;
    private double price;


    public Book(String title, Author[] authors, double price) {
        this.title = title;
        this.authors = authors;
        this.price = price;
    }

    public String getTitle() {return title;}
    public Author[] getAuthors() {return authors;}
    public double getPrice() {return price;}

    public void setTitle(String title) {this.title = title;}
    public void setAuthors(Author[] authors) {this.authors = authors;}
    public void setPrice(double price) {this.price = price;}

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                '}';
    }
}
