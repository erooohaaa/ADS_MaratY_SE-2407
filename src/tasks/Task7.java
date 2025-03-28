package tasks;

import java.util.Scanner;

public class Task7 {
    /**
     * This method reads an array of integers and prints them in reverse order using recursion.
     *
     * Time Complexity: O(n), where n is the number of elements.
     * The function makes n recursive calls to print elements in reverse order.
     */
    public static void problem() {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();

        // Read the array elements
        System.out.print("Enter elements: ");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Measure execution time
        long startTime = System.nanoTime();
        printReverse(n, numbers);
        long endTime = System.nanoTime();

        // Output execution time
        double elapsedTime = (endTime - startTime) / 1_000_000.0;
        System.out.printf("\nExecution time: %.5f ms\n", elapsedTime);
    }

    /**
     * This method prints the elements of an array in reverse order using recursion.
     *
     * @param index The current index in the array (starting from n).
     * @param numbers The array containing elements.
     */
    public static void printReverse(int index, int[] numbers) {
        if (index == 0) return; // Base case: if index reaches 0, stop recursion
        System.out.print(numbers[index - 1] + " "); // Print current element
        printReverse(index - 1, numbers); // Recursive call with a decremented index
    }
}
