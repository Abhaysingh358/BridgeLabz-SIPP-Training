package Control_Flow;
import java.util.Scanner;
public class CheckEvenOrOdd{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0) {
			if(n%2==0) {
				System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}
			n--;
		}
	}
}