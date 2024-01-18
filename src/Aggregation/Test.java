package Aggregation;
import Aggregation.Author;

public class Test {
    public static void main(String[] args) {

        Author wys = new Author("Stanisław", "wyspianski@gmail.com", 'm');
        Author pru = new Author("Bolesław", "prus@gmail.com", 'm');

        Book lalka = new Book("Lalka", pru, 35.0);
    }
}
