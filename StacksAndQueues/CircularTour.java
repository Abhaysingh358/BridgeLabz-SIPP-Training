package StacksAndQueues;

public class CircularTour {

    public static int findStartingPoint(int[] petrol, int[] distance) {
        int n = petrol.length;
        int totalSurplus = 0;
        int currSurplus = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            int diff = petrol[i] - distance[i];
            totalSurplus += diff;
            currSurplus += diff;

            // If current surplus < 0, can't start from this or any previous pump
            if (currSurplus < 0) {
                start = i + 1;  // Try next pump
                currSurplus = 0;
            }
        }

        return (totalSurplus >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int start = findStartingPoint(petrol, distance);
        if (start != -1) {
            System.out.println("Start at petrol pump: " + start);
        } else {
            System.out.println("No possible tour.");
        }
    }
}
