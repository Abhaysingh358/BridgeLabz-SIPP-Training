package Control_Flow;
import java.util.Scanner;
public class find_max{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max1 = Math.max(a, b);
		int max = Math.max(max1, c);
		System.out.println("the great one is " + max);
	}
}