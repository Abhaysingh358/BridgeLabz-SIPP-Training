package Control_Flow;

import java.util.Scanner;
public class powerUsingFor{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int power = sc.nextInt();
		int res = 1;
		for(int i =1;i<=power;i++) {
			res*=n;
		}
		System.out.println(res);
	}
}