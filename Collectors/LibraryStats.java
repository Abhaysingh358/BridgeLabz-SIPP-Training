package Collectors;
import java.util.*;
import java.util.stream.Collectors;

class Book {
    String title;
    String genre;
    int pages;

    Book(String title, String genre, int pages) {
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }
}

public class LibraryStats {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Java Basics", "Programming", 300),
            new Book("Spring Boot", "Programming", 450),
            new Book("Harry Potter", "Fantasy", 500),
            new Book("Lord of the Rings", "Fantasy", 700),
            new Book("Data Science 101", "Education", 350)
        );

        Map<String, IntSummaryStatistics> statsByGenre = books.stream()
            .collect(Collectors.groupingBy(
                b -> b.genre,
                Collectors.summarizingInt(b -> b.pages)
            ));

        statsByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("  Total Pages: " + stats.getSum());
            System.out.println("  Average Pages: " + stats.getAverage());
            System.out.println("  Max Pages: " + stats.getMax());
        });
    }
}
