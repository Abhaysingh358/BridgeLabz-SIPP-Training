package Methods;
import java.util.Scanner;
public class factor {
	public static int[] factors(int n) {
		int cnt = 0;
		for(int i =1; i<n;i++) {
			if(n%i==0) {
				cnt++;
			}
		}
		int factors[] = new int[cnt];
		int index=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				factors[index] = i;
				index++;
			}
			
		}
		return factors;
	}
	public static int sum(int[] arr) {
		int sum = 0;
		for(int factors : arr) {
			sum+=factors;
		}
		return sum;
		
	}
	
	public static int product(int[] arr) {
		int product=1;
		for(int factors : arr) {
			product*=factors;
		}
		return product;
	}
	public static int sum_of_square(int[] arr) {
		int sum = 0;
		for(int factors :arr) {
			sum+=Math.pow(factors, 2);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] factors = factors(n);
		for(int i : factors) {
			System.out.print( i + " ");
		}
		System.out.println();
		
		int sum = sum(factors);
		int product = product(factors);
		int sumsqr = sum_of_square(factors);
		System.out.println(sum);
		System.out.println(product);
		System.out.println(sumsqr);
		
	}
}