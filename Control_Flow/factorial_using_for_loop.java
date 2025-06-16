package Control_Flow;
import java.util.Scanner;

public class factorial_using_for_loop{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact =1;
		
		int n = sc.nextInt();
		if(n==0) {
			System.out.println("Factorial :1");
		}
		else if(n<0) {
			System.out.println("Factorial does not exist");
		}
		for(int i = 1; i<=n;i++) {
			fact = fact*i;
		}
		if(n>0) {
			System.out.println("Factorial " + fact);
		}
	}
}