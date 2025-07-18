package Sorting;

import java.util.Scanner;

public class EmployeeIDInsertionSort {

    // Method to perform Insertion Sort
    public static void insertionSort(int[] ids) {
        int n = ids.length;

        
        for (int i = 1; i < n; i++) {
            int current = ids[i];
            int j = i - 1;

            while (j >= 0 && ids[j] > current) {
                ids[j + 1] = ids[j];
                j--;
            }

            
            ids[j + 1] = current;
        }
    }

    // Method to print the array
    public static void printArray(int[] ids) {
        for (int id : ids) {
            System.out.print(id + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] ids = new int[n];

        System.out.println("Enter " + n + " employee IDs:");
        for (int i = 0; i < n; i++) {
            ids[i] = sc.nextInt();
        }

        // Before sorting
        System.out.println("Employee IDs before sorting:");
        printArray(ids);

        // Perform insertion sort
        insertionSort(ids);

        // After sorting
        System.out.println("Employee IDs after sorting (Ascending Order):");
        printArray(ids);

        sc.close();
    }
}
