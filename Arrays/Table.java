package Arrays;
import java.util.Scanner;
public class Table{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int[] mul = new int[10];
		if(n>=6 && n<=9) {
			for(int i = 1;i<=9;i++) {
				mul[i]=(i+1)*n;
				System.out.println(mul[i]);
			}
			
		}
		else {
			System.out.println("enter the number between 6 to 9");
		}
	}
}