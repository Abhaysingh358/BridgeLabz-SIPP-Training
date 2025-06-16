package Control_Flow;
import java.util.Scanner;
public class sum_of_natural_number{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int i = n;
		while(i>0) {
			sum += i;
			i--;
		}
		int sum1 = n*(n+1)/2;
		
		if(sum==sum1) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		System.out.println(sum);
		System.out.println(sum1);
		
	}
}