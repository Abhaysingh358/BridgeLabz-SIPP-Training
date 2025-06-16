package Arrays;
import java.util.Scanner;
public class CompareTheNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] n = new int[5];
		for(int i =0;i<5;i++) {
			n[i] = sc.nextInt();
		}
		
		for(int i= 0;i<n.length;i++) {
			if(n[i]>0) {
				if(n[i]%2==0) {
					System.out.println("positive and even");
				}
				else {
					System.out.println("positive and odd");
				}
				
			}
			if(n[i]==0) {
				System.out.println("ZERO");
			}
			else {
				System.out.println("Negative");
			}
		}
	}
}