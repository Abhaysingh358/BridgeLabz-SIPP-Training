package LinkedList;

class BookNode {
    String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;
    BookNode next;
    BookNode prev;

    public BookNode(String title, String author, String genre, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}

public class LibraryManagementSystem {
    BookNode head, tail;
    int count = 0;

    public void addFirst(String title, String author, String genre, int bookId, boolean status) {
        BookNode newNode = new BookNode(title, author, genre, bookId, status);
        count++;
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(String title, String author, String genre, int bookId, boolean status) {
        BookNode newNode = new BookNode(title, author, genre, bookId, status);
        count++;
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addAtPosition(int pos, String title, String author, String genre, int bookId, boolean status) {
        if (pos <= 1 || head == null) {
            addFirst(title, author, genre, bookId, status);
            return;
        }

        BookNode newNode = new BookNode(title, author, genre, bookId, status);
        BookNode curr = head;
        int i = 1;
        while (curr != null && i < pos - 1) {
            curr = curr.next;
            i++;
        }

        if (curr == null || curr.next == null) {
            addLast(title, author, genre, bookId, status);
        } else {
            newNode.next = curr.next;
            newNode.prev = curr;
            curr.next.prev = newNode;
            curr.next = newNode;
            count++;
        }
    }

    public void removeById(int bookId) {
        if (head == null) return;

        BookNode curr = head;
        while (curr != null && curr.bookId != bookId) {
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("Book ID not found.");
            return;
        }

        if (curr == head && curr == tail) {
            head = tail = null;
        } else if (curr == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else if (curr == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            curr.prev.next = curr.next;
            curr.next.prev = curr.prev;
        }
        count--;
        System.out.println("Book ID " + bookId + " removed.");
    }

    public void searchByTitle(String title) {
        BookNode curr = head;
        boolean found = false;
        while (curr != null) {
            if (curr.title.equalsIgnoreCase(title)) {
                printBook(curr);
                found = true;
            }
            curr = curr.next;
        }
        if (!found) System.out.println("Book with title '" + title + "' not found.");
    }

    public void searchByAuthor(String author) {
        BookNode curr = head;
        boolean found = false;
        while (curr != null) {
            if (curr.author.equalsIgnoreCase(author)) {
                printBook(curr);
                found = true;
            }
            curr = curr.next;
        }
        if (!found) System.out.println("No books found by author '" + author + "'.");
    }

    public void updateAvailability(int bookId, boolean status) {
        BookNode curr = head;
        while (curr != null) {
            if (curr.bookId == bookId) {
                curr.isAvailable = status;
                System.out.println("Availability of Book ID " + bookId + " updated to " + (status ? "Available" : "Not Available"));
                return;
            }
            curr = curr.next;
        }
        System.out.println("Book ID not found.");
    }

    public void displayForward() {
        System.out.println("Books (Forward):");
        BookNode curr = head;
        while (curr != null) {
            printBook(curr);
            curr = curr.next;
        }
    }

    public void displayReverse() {
        System.out.println("Books (Reverse):");
        BookNode curr = tail;
        while (curr != null) {
            printBook(curr);
            curr = curr.prev;
        }
    }

    public int countBooks() {
        return count;
    }

    private void printBook(BookNode book) {
        System.out.println("Title: " + book.title + ", Author: " + book.author + ", Genre: " + book.genre +
                ", ID: " + book.bookId + ", Available: " + (book.isAvailable ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();
        library.addFirst("1984", "George Orwell", "Dystopian", 1001, true);
        library.addLast("The Hobbit", "J.R.R. Tolkien", "Fantasy", 1002, true);
        library.addAtPosition(2, "To Kill a Mockingbird", "Harper Lee", "Classic", 1003, false);

        library.displayForward();
        System.out.println();

        library.searchByTitle("The Hobbit");
        library.searchByAuthor("George Orwell");

        library.updateAvailability(1002, false);
        library.removeById(1001);
        System.out.println();

        library.displayForward();
        System.out.println();
        library.displayReverse();

        System.out.println("\nTotal books in library: " + library.countBooks());
    }
}
