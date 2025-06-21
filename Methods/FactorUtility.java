package Methods;
import java.util.Scanner;

public class FactorUtility {

    // 1. Get factors of a number
    static int[] getFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0) factors[index++] = i;

        return factors;
    }

    // 2. Greatest factor (excluding the number itself if needed)
    static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors)
            if (f > max) max = f;
        return max;
    }

    // 3. Sum of factors
    static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    // 4. Product of factors
    static long productOfFactors(int[] factors) {
        long prod = 1;
        for (int f : factors) prod *= f;
        return prod;
    }

    // 5. Product of cube of factors
    static double productOfCubes(int[] factors) {
        double prod = 1;
        for (int f : factors)
            prod *= Math.pow(f, 3);
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = getFactors(num);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubes(factors));
    }
}
