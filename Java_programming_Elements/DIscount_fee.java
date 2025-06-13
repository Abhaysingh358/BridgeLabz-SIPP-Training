package Java_programming_Elements;
import java.util.Scanner;
public class DIscount_fee{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the fee");
		double fee = sc.nextDouble();
		double discount_percent = 10;
		double discount_amount = (fee*discount_percent)/100;
		double payable_fee  = fee  - discount_amount;
		System.out.print("The discount amount is INR " + discount_amount + " and final discounted fee is INR " + 
		payable_fee);
	}
}