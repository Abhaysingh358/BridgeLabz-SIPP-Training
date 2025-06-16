package Control_Flow;
import java.util.Scanner;
public class Sumof_n_Natural_numbers{
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =1; i<=n;i++) {
			sum = sum+i;
		}
		
		int sum1 = n*(n+1)/2;
		
		System.out.println("sum " + sum + "\nsum1 " + sum1);
	}
}