package Methods;
import java.util.Scanner;

public class NumberChecker3 {

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0) return false;
        return true;
    }

    static boolean isNeon(int num) {
        int square = num * num, sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    static boolean isSpy(int num) {
        int sum = 0, product = 1, n = num;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }

    static boolean isAutomorphic(int num) {
        int square = num * num;
        return String.valueOf(square).endsWith(String.valueOf(num));
    }

    static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int number = sc.nextInt();

        System.out.println("\nResults for number: " + number);
        System.out.println("Prime       " + isPrime(number));
        System.out.println("Neon         " + isNeon(number));
        System.out.println("Spy         " + isSpy(number));
        System.out.println("Automorphic " + isAutomorphic(number));
        System.out.println("Buzz        " + isBuzz(number));
    }
}
