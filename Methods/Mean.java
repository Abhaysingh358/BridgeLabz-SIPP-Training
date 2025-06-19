package Methods;
import java.util.Scanner;
public class Mean {

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int h : arr) {
            sum += h;
        }
        return sum;
    }

    public static double getMean(int[] arr) {
        return (double) getSum(arr) / arr.length;
    }

    public static int getShortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) {
            if (h < min) min = h;
        }
        return min;
    }

    public static int getTallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) {
            if (h > max) max = h;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];

       
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int)(Math.random() * 101) + 150; 
        }

        System.out.println("Heights of players:");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        System.out.println("\nTallest: " + getTallest(heights) + " cm");
        System.out.println("Shortest: " + getShortest(heights) + " cm");
        System.out.println("Mean: " + getMean(heights) + " cm");
    }
}
