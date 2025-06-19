package Methods;
import java.util.Scanner;

public class DivisionCalculator {

    
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor; 
        result[1] = number % divisor; 
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }

        
        int[] output = findRemainderAndQuotient(number, divisor);

        
        System.out.println("Quotient = " + output[0]);
        System.out.println("Remainder = " + output[1]);
    }
}
