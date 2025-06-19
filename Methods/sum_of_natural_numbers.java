package Methods;
import java.util.Scanner;
public class sum_of_natural_numbers{
	public static  int sum(int n) {
		return n*(n+1)/2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sum(n);
		System.out.println(sum);
	}
}