package AggregationArray;

public class Test {
    public static void main(String[] args) {

        Author[] authors = new Author[2];
        authors[0] = new Author("Bolesław", "Prus", "Poland", 'm');
        authors[1] = new Author("Wisława", "Szymborska", "Poland", 'f');

        System.out.println(authors[0]);
        System.out.println(authors[1]);

        Book book1 = new Book("Lalka 2", authors, 200.0);

    }
}
