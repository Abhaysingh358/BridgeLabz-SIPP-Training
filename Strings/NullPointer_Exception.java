package Strings;
import java.util.Scanner;
public class NullPointer_Exception{
	public static void  generateException(String text){
		text =null;
		System.out.println("text " + text.length());
		
	}
	public static void handleException(String text) {
		text =null;
		try {
			System.out.println("Text length : " + text.length());
			
		}
		catch(NullPointerException e){
			System.out.println("caught NullPointerException : can not call method");
		}
		catch(RuntimeException e) {
			System.out.println("caught a generic RunTimeException");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		handleException(s);
	}
}