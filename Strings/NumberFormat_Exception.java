package Strings;
import java.util.Scanner;
public class NumberFormat_Exception{
	
	public static void generateException(String s) {
		int number  =Integer.parseInt(s);
		System.out.println("parsed number :" + number);
	}
	public static void handleException(String s) {
		try {
			int number = Integer.parseInt(s);
			System.out.println("parsed number :" + number);
		}catch(NumberFormatException e) {
			System.out.println("Caught number of exception : input is not valid");
		}
		catch(RuntimeException e) {
			System.out.println("Caught a generic RuntimeException.");
		}
	}
	
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		handleException(s);
		
	}
}
