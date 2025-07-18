package Sorting;
import java.util.Scanner;

public class ExamScoreSelectionSort {

    // Method to perform Selection Sort
    public static void selectionSort(int[] scores) {
        int n = scores.length;

        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Assume the current index has the minimum element
            int minIndex = i;

            // Find the actual minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    // Method to print the array
    public static void printArray(int[] scores) {
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        System.out.println("Enter exam scores of " + n + " students:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        // Before sorting
        System.out.println("Exam scores before sorting:");
        printArray(scores);

        // Perform selection sort
        selectionSort(scores);

        // After sorting
        System.out.println("Exam scores after sorting (Ascending Order):");
        printArray(scores);

        sc.close();
    }
}
