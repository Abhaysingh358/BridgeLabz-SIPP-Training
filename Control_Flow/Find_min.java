package Control_Flow;
import java.util.Scanner;

public class Find_min{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int MIN = Math.min(num1, num2);
		int res = Math.min(num3, MIN);
		System.out.println(res);
	}
}