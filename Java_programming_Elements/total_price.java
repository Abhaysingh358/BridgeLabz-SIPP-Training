package Java_programming_Elements;
import java.util.Scanner;
 public class total_price{
	 public static void main(String[] args) {
		 Scanner sc  = new Scanner(System.in);
		 int unitPrice = sc.nextInt();
		 int quantity  =sc.nextInt();
		 int totalPrice = unitPrice*quantity;
		 System.out.println("total_price "+ totalPrice);
	 }
 }