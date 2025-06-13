package Java_programming_Elements;
import java.util.Scanner;
public class operations{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int op1 = a + b *c;
		int op2 =  a * b + c;
		int op3 = c + a / b;
		int op4 = a % b + c;
		
		System.out.print("op1 " + op1 + "\nop2 " + op2 + "\nop3 " + op3 + "\nop4 " + op4);
	}
}