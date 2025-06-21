package Methods;
import java.util.Scanner;

public class NumberChecker4 {

    
    static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    
    static int[] getDigitsArray(int num) {
        int[] digits = new int[countDigits(num)];
        int i = digits.length - 1;
        while (num != 0) {
            digits[i--] = num % 10;
            num /= 10;
        }
        return digits;
    }

  
    static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

   
    static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

   
    static boolean isHarshad(int num, int[] digits) {
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }

   
    static int[][] getDigitFrequency(int[] digits) {
        int[] freq = new int[10]; // 0 to 9
        for (int d : digits) freq[d]++;

        int count = 0;
        for (int f : freq) if (f > 0) count++;

        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }
        return result;
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = getDigitsArray(num);

        System.out.println("\nDigit count: " + countDigits(num));
        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println("\nSum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad? " + isHarshad(num, digits));

        System.out.println("\nDigit Frequencies:");
        int[][] freq = getDigitFrequency(digits);
        System.out.println("Digit\tFrequency");
        for (int[] row : freq)
            System.out.println(row[0] + "\t" + row[1]);
    }
}
