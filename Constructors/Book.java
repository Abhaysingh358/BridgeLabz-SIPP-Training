//package Constructors;
//class Book{
//	String title;
//	String author;
//	Double price;
//	public Book(String title,String author,Double price) {
//		this.title = title;
//		this.author = author;
//		this.price = price;
//	}
//	public void print() {
//		System.out.println("title : " + title);
//		System.out.println("author : " + author);
//		System.out.println("price : " + price);
//		
//	}
//
//
//}
//public class Book {
//	public static void main(String[] args) {
//		Book b1 = new Book("The Invisible Planet" , "Abhay Pratap Singh ", (double) 500);
//		b1.print();
//	}
//}

package Constructors;

class Book {
    String title;
    String author;
    double price;
    boolean isAvailable;

    // Constructor
    public Book(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to check availability
    public boolean isAvailable() {
        return isAvailable;
    }

    // Override toString to print book details
    @Override
    public String toString() {
        return "Title      : " + title +
             "\nAuthor     : " + author +
             "\nPrice      : ₹" + price +
             "\nAvailable? : " + (isAvailable ? "Yes" : "No");
    }
}






