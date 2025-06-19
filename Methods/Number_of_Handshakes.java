package Methods;
import java.util.Scanner;
public class Number_of_Handshakes{
	public static int handshakes(int n) {
		int handshakes = (n*(n-1)) /2;
		return handshakes;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total = Number_of_Handshakes.handshakes(n);
		System.out.println(total);
	}
}