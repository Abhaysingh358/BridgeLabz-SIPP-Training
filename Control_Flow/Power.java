package Control_Flow;

import java.util.Scanner;
public class Power{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int power = sc.nextInt();
		int result = 1;
		int counter=1;
		while(power>0) {
			result *= number;
			power--;
		}
		System.out.println(result);
	}
}