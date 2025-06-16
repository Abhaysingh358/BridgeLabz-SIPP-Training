package Control_Flow;

import java.util.Scanner;
public class Greatest_Factor{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int grt = 0;
		for(int i =n-1;i>0;i--) {
			if(n%i==0) {
				grt = i;
				break;
			}
		}
		System.out.println(grt);
	}
}