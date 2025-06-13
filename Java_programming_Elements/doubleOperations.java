package Java_programming_Elements;
import java.util.Scanner;
public class doubleOperations{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double op1 = a + b *c;
		double op2 =  a * b + c;
		double op3 = c + a / b;
		double op4 = a % b + c;
		
		System.out.print("op1 " + op1 + "\nop2 " + op2 + "\nop3 " + op3 + "\nop4 " + op4);
	}
}