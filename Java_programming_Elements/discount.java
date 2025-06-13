package Java_programming_Elements;
public class discount{
	public static void main(String[] args) {
		double fee = 125000;
		double discount_percent = 10;
		double discount_amount = (fee*discount_percent)/100;
		double payable_fee  = fee  - discount_amount;
		System.out.print("The discount amount is INR " + discount_amount + " and final discounted fee is INR " + 
		payable_fee);
	}
}