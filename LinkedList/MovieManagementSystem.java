package LinkedList;

class DoublyNode {
    String movieTitle;
    String director;
    int year;
    DoublyNode next;
    DoublyNode prev;

    public DoublyNode(String movieTitle, String director, int year) {
        this.movieTitle = movieTitle;
        this.director = director;
        this.year = year;
        this.next = null;
        this.prev = null;
    }
}

public class MovieManagementSystem {
    DoublyNode head;
    DoublyNode tail;

    public MovieManagementSystem() {
        this.head = null;
        this.tail = null;
    }

    public void addFirst(String movieTitle, String director, int year) {
        DoublyNode newNode = new DoublyNode(movieTitle, director, year);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(String movieTitle, String director, int year) {
        DoublyNode newNode = new DoublyNode(movieTitle, director, year);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addAtPosition(int pos, String movieTitle, String director, int year) {
        DoublyNode newNode = new DoublyNode(movieTitle, director, year);

        if (pos <= 1 || head == null) {
            addFirst(movieTitle, director, year);
            return;
        }

        DoublyNode curr = head;
        int index = 1;

        while (curr != null && index < pos - 1) {
            curr = curr.next;
            index++;
        }

        if (curr == null || curr.next == null) {
            addLast(movieTitle, director, year);
        } else {
            newNode.next = curr.next;
            newNode.prev = curr;
            curr.next.prev = newNode;
            curr.next = newNode;
        }
    }

    public void remove(String title) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        DoublyNode curr = head;
        while (curr != null) {
            if (curr.movieTitle.equalsIgnoreCase(title)) {
                if (curr == head && curr == tail) {
                    head = null;
                    tail = null;
                } else if (curr == head) {
                    head = head.next;
                    head.prev = null;
                } else if (curr == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    curr.prev.next = curr.next;
                    curr.next.prev = curr.prev;
                }

                System.out.println("Movie \"" + title + "\" removed successfully.");
                return;
            }
            curr = curr.next;
        }

        System.out.println("Movie \"" + title + "\" not found.");
    }

    public void search(String director) {
        if (head == null) {
            System.out.println("Doubly linked list is empty.");
            return;
        }

        boolean found = false;
        DoublyNode curr = head;

        while (curr != null) {
            if (curr.director.equalsIgnoreCase(director)) {
                System.out.println("Movie: " + curr.movieTitle + ", Director: " + curr.director + ", Year: " + curr.year);
                found = true;
            }
            curr = curr.next;
        }

        if (!found) {
            System.out.println("No movies found for director: " + director);
        }
    }

    public void updateMovie(String title, String newDirector, int newYear) {
        if (head == null) {
            System.out.println("List is empty. Cannot update.");
            return;
        }

        DoublyNode curr = head;
        while (curr != null) {
            if (curr.movieTitle.equalsIgnoreCase(title)) {
                curr.director = newDirector;
                curr.year = newYear;
                System.out.println("Movie \"" + title + "\" updated successfully.");
                return;
            }
            curr = curr.next;
        }

        System.out.println("Movie \"" + title + "\" not found. Update failed.");
    }

    public void print() {
        DoublyNode curr = head;
        while (curr != null) {
            System.out.println("Movie: " + curr.movieTitle + ", Director: " + curr.director + ", Year: " + curr.year);
            curr = curr.next;
        }
    }

    public void printReverse() {
        DoublyNode curr = tail;
        while (curr != null) {
            System.out.println("Movie: " + curr.movieTitle + ", Director: " + curr.director + ", Year: " + curr.year);
            curr = curr.prev;
        }
    }

    public static void main(String[] args) {
        MovieManagementSystem m = new MovieManagementSystem();

        m.addFirst("Django Unchained", "Quentin Tarantino", 2012);
        m.addFirst("Tom and Jerry: Cowboy Up!", "Darrell Van Citters", 2022);

        System.out.println("\nInitial list:");
        m.print();

        System.out.println("\nAfter adding at last:");
        m.addLast("ajnasjd", "fsfgfsg", 5050);
        m.addLast("God Father", "not available", 1985);
        m.print();

        System.out.println("\nAdding 'Inception' at position 2:");
        m.addAtPosition(2, "Inception", "Christopher Nolan", 2010);
        m.print();

        System.out.println("\nRemoving 'Django Unchained':");
        m.remove("Django Unchained");
        m.print();

        System.out.println("\nSearching for director 'Darrell Van Citters':");
        m.search("Darrell Van Citters");

        System.out.println("\nUpdating 'God Father'...");
        m.updateMovie("God Father", "Francis Ford Coppola", 1972);
        m.print();

        System.out.println("\nReverse display:");
        m.printReverse();
    }
}
