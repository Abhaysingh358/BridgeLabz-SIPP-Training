package Control_Flow;
import java.util.Scanner;
public class AGE{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int age = sc.nextInt();
		if(age<18) {
			System.out.println("can not vote");
		}
		else if(age>=18) {
			System.out.println("person can vote");
		}
		else if(age < 1 && age > 130) {
			System.out.println("not a valid age");
		}
	}
}