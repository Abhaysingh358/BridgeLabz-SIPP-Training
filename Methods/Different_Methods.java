package Methods;
import java.util.Scanner;

public class Different_Methods {

    public static int count_digit(int n) {
        int cnt = 0;
        while (n > 0) {
            n = n / 10;
            cnt++;
        }
        return cnt;
    }

    public static int[] store_digit(int n, int cnt) {
        int[] arr = new int[cnt];
        for (int i = cnt - 1; i >= 0; i--) {
            arr[i] = n % 10;
            n = n / 10;
        }
        return arr;
    }

    public static boolean is_duck_number(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0)
                return true;
        }
        return false;
    }

    public static boolean is_armstrong(int n, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == n;
    }

    public static void find_largest_and_second_largest(int[] digits) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) {
                second = d;
            }
        }

        System.out.println("Largest digit: " + first);
        if (second != Integer.MIN_VALUE)
            System.out.println("Second largest digit: " + second);
        else
            System.out.println("Second largest digit: Not found");
    }

    public static void find_smallest_and_second_smallest(int[] digits) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < first) {
                second = first;
                first = d;
            } else if (d < second && d != first) {
                second = d;
            }
        }

        System.out.println("Smallest digit: " + first);
        if (second != Integer.MAX_VALUE)
            System.out.println("Second smallest digit: " + second);
        else
            System.out.println("Second smallest digit: Not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int cnt = count_digit(n);
        System.out.println("Number of digits: " + cnt);

        int[] digits = store_digit(n, cnt);

        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Duck Number: " + is_duck_number(digits));
        System.out.println("Armstrong Number: " + is_armstrong(n, digits));
        find_largest_and_second_largest(digits);
        find_smallest_and_second_smallest(digits);
    }
}
