package Control_Flow;
import java.util.Scanner;

public class CheckMultipleFromBackward{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		if(n>=1 && n<=100) {
		for(int i=n;i>0;i--) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
		}
	}
}