package Control_Flow;
import java.util.Scanner;
public class counter_using_for_loop{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = sc.nextInt();
		for(int i = counter;i>0;i--) {
			System.out.println(i);
		}
	}
}
