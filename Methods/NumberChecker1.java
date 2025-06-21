package Methods;
import java.util.Scanner;
public class NumberChecker1 {

   
    static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++)
            if (num % i == 0)
                sum += i;
        return sum == num;
    }

  
    static boolean isAbundant(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++)
            if (num % i == 0)
                sum += i;
        return sum > num;
    }

    
    static boolean isDeficient(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++)
            if (num % i == 0)
                sum += i;
        return sum < num;
    }

    static boolean isStrong(int num) {
        int sum = 0, original = num;
        while (num != 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == original;
    }

   
    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }

   
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); 

        System.out.println("Number: " + number);
        System.out.println("Perfect:  " + isPerfect(number));
        System.out.println("Abundant: " + isAbundant(number));
        System.out.println("Deficient: " + isDeficient(number));
        System.out.println("Strong:   " + isStrong(number));
    }
}
