package AbstractPolymorphismEncapsulation;

import java.util.*;

// Interface
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Abstract Class
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private String borrower; // sensitive personal data

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.borrower = null;
    }

    // Encapsulation
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    protected void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    protected String getBorrower() {
        return borrower;
    }

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }

    public abstract int getLoanDuration(); // in days
}

// Subclass: Book
class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            setBorrower(borrowerName);
            isAvailable = false;
            System.out.println("Book reserved for " + borrowerName);
        } else {
            System.out.println("Book is currently not available.");
        }
    }

    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Subclass: Magazine
class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }

    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            setBorrower(borrowerName);
            isAvailable = false;
            System.out.println("Magazine reserved for " + borrowerName);
        } else {
            System.out.println("Magazine is currently not available.");
        }
    }

    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Subclass: DVD
class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 3;
    }

    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            setBorrower(borrowerName);
            isAvailable = false;
            System.out.println("DVD reserved for " + borrowerName);
        } else {
            System.out.println("DVD is currently not available.");
        }
    }

    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Main class to demonstrate polymorphism
public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        LibraryItem book = new Book("B101", "Effective Java", "Joshua Bloch");
        LibraryItem mag = new Magazine("M202", "National Geographic", "Various");
        LibraryItem dvd = new DVD("D303", "Inception", "Christopher Nolan");

        items.add(book);
        items.add(mag);
        items.add(dvd);

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable res = (Reservable) item;
                res.reserveItem("Rahul");
                System.out.println("Available: " + res.checkAvailability());
            }

            System.out.println("-------------------------");
        }
    }
}
