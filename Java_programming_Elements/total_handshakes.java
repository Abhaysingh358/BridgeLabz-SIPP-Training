package Java_programming_Elements;
import java.util.Scanner;
public class total_handshakes{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total_handshakes =  (n * (n - 1)) / 2 ;
		System.out.println("Toatal HAndshakes are :" + total_handshakes);
	}
}