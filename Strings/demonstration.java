package Strings;
import java.util.Scanner;
public class demonstration{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the length of the name");
		int n = sc.nextInt();
		String[] names = new String[n];
		for(int i=0;i<n;i++) {
			names[i]=sc.nextLine();
			
		}
		try {
			for(int i=0;i<=n;i++) {
				System.out.print(names[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutofBoundException" + e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Generic Exception " + e.getMessage());
		}
		
		
	}
}