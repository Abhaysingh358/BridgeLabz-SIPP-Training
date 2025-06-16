package Control_Flow;
import java.util.Scanner;
public class YoungerOne{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Akbar_age = sc.nextInt();
		int Amar_age = sc.nextInt();
		int Anthony_age = sc.nextInt();
		if(Akbar_age>Amar_age) {
			if(Amar_age<Anthony_age) {
				System.out.println("Amar is younger");
			}
			else {
				System.out.println("Anthony is younger");
			}
			}
		else if(Akbar_age<Amar_age) {
			if(Akbar_age<Anthony_age) {
				System.out.println("Akabar is younger");
			}
			else {
				System.out.println("Anthony is younger");
			}
		}
			
		}
		
	}
