package tasks;

import java.util.Scanner;

public class Task2 {
    /**
     * This method handles user input, calculates the average value of an array,
     * and measures the execution time of the operation.
     */
    public static void problem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt(); // Read the size of the array

        int[] values = new int[size]; // Initialize the array

        System.out.print("Enter " + size + " numbers: ");
        for (int i = 0; i < size; i++) {
            values[i] = scanner.nextInt(); // Read numbers into the array
        }

        long startTime = System.nanoTime(); // Start time measurement
        double average = calculateAverage(values); // Calculate the average
        long endTime = System.nanoTime(); // End time measurement

        double elapsedTime = (endTime - startTime) / 1_000_000.0; // Convert nanoseconds to milliseconds

        System.out.println("Average value: " + average); // Output the average
        System.out.printf("Execution time: %.5f ms\n", elapsedTime); // Output execution time
    }

    /**
     * This method calculates the average value of an array.
     *
     * Time complexity: O(n), where n is the number of elements in the array.
     * The method iterates through all elements to compute their sum.
     *
     * @param array The input array of integers.
     * @return The average value of the array.
     */
    public static double calculateAverage(int[] array) {
        int sum = 0; // Initialize sum

        // Iterate through the array and accumulate the sum
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length; // Compute and return the average
    }
}
