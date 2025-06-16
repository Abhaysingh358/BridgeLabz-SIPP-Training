package Control_Flow;
import java.util.Scanner;
public class Factorial{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact =1;
		if(n==0) {
			System.out.println("Factorial of zero is 1");
		}
		else if(n<0) {
			System.out.println("factorial does not exist for negative ");
		}
		
		while(n>0) {
			fact = fact*n;
			n--;
		}
		if(n>0) {
		System.out.println("Factorial :" + fact);
	}
}
}