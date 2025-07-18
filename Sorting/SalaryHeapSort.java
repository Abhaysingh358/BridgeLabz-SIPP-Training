package Sorting;
import java.util.Scanner;

public class SalaryHeapSort {

    // Method to perform heap sort
    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Step 2: Extract elements from the heap one by one
        for (int i = n - 1; i >= 0; i--) {
            // Move current root (max element) to end
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Heapify the reduced heap
            heapify(salaries, i, 0);
        }
    }

    // Method to heapify a subtree rooted at index i
    public static void heapify(int[] salaries, int n, int i) {
        int largest = i;        // Initialize largest as root
        int left = 2 * i + 1;   // Left child index
        int right = 2 * i + 2;  // Right child index

        // If left child is larger than root
        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }

        // If right child is larger than current largest
        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }

        // If largest is not root, swap and heapify the affected subtree
        if (largest != i) {
            int temp = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = temp;

            heapify(salaries, n, largest);
        }
    }

    // Method to print the array
    public static void printArray(int[] salaries) {
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of job applicants: ");
        int n = sc.nextInt();

        int[] salaries = new int[n];

        System.out.println("Enter the expected salary of each applicant:");
        for (int i = 0; i < n; i++) {
            salaries[i] = sc.nextInt();
        }

        // Before sorting
        System.out.println("Expected salaries before sorting:");
        printArray(salaries);

        // Perform Heap Sort
        heapSort(salaries);

        // After sorting
        System.out.println("Expected salaries after sorting (Ascending Order):");
        printArray(salaries);

        sc.close();
    }
}
