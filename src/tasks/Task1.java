package tasks;

import java.util.Scanner;

public class Task1 {
    /**
     * This method handles user input, processes the array, and finds the minimum value.
     * It also measures the execution time of the operation.
     */
    public static void problem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt(); // Read the size of the array

        int[] numbers = new int[size]; // Initialize the array with user-defined size

        System.out.print("Enter " + size + " numbers: ");
        for (int index = 0; index < size; index++) {
            numbers[index] = scanner.nextInt(); // Read numbers into the array
        }

        long start = System.nanoTime(); // Start time measurement
        int minValue = getMinimum(numbers); // Find the smallest number in the array
        long end = System.nanoTime(); // End time measurement

        double executionTime = (end - start) / 1_000_000.0; // Convert nanoseconds to milliseconds

        System.out.println("Smallest number: " + minValue); // Output the minimum value
        System.out.printf("Execution time: %.5f ms\n", executionTime); // Output execution time
    }

    /**
     * This method finds the smallest number in an array.
     * It uses a linear search approach.
     *
     * Time complexity: O(n), where n is the number of elements in the array.
     * The method iterates through all elements to find the smallest one.
     *
     * @param array The input array of integers.
     * @return The smallest number in the array.
     */
    public static int getMinimum(int[] array) {
        int smallest = array[0]; // Assume the first element is the smallest

        // Iterate through the array and update the smallest value if needed
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i]; // Update smallest value if a smaller element is found
            }
        }
        return smallest; // Return the smallest number found
    }
}
