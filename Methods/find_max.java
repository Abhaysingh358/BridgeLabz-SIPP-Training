package Methods;
import java.util.Scanner;
public class find_max{
	public static int max_number(int num1 , int num2 , int num3) {
		int max1 = Math.max(num2, num1);
		int max2 = Math.max(max1, num3);
		return max2;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int ans = find_max.max_number(num1,num2,num3);
		System.out.println(ans);
		
	}
}