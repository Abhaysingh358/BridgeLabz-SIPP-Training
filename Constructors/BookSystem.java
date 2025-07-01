package Constructors;


public class BookSystem {
	Book[] book = new Book[10]; 
	
	public void addBook() {
		Book b1 = new Book("Harry potter" , "Abhay" , 200,true);
		book[0] = b1;
		System.out.println("Book name " + book[0].title);
	}
	public static void main(String[] args) {
		 BookSystem b = new BookSystem();
		 b.addBook();
	}
}


