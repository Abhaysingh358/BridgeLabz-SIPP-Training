package classAndObject;

class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }
}

public class HandleBook {
    public static void main(String[] args) {
        Book b1 = new Book("The sky below the earth", "Abhay", 300);
        b1.printDetails();
    }
}
