package Methods;
import java.util.Arrays;
import java.util.Scanner;
public class chocolates_distribution{
	public int[]  distribution(int chocolates , int students) {
		int[] arr = new int[2];
		int each_get = chocolates/students;
		int remains = chocolates%students;
		arr[0] = each_get;
		arr[1] = remains;
		return arr;
		
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the chocolates and student respectively");
		int chocolates = sc.nextInt();
		int student = sc.nextInt();
		chocolates_distribution res = new chocolates_distribution();
		int[] ans = res.distribution(chocolates, student);
		System.out.println("[each wiil get ,  left]");
		System.out.println(Arrays.toString(ans));
		
	}
}