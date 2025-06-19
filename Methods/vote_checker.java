package Methods;
import java.util.Scanner;
public class vote_checker{
	public static  boolean canStudentVote(int age){
		if(age<0) {
			return false;
		}
		else if(age > 17 && age < 101) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		 int[] student_age = new int[10];
		for(int i=0;i<10;i++) {
			student_age[i]  = sc.nextInt();
		}
		for(int i = 0; i<10;i++) {
			System.out.println(canStudentVote(student_age[i]));
		}
	}
}