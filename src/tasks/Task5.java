package tasks;

import java.util.Scanner;

public class Task5 {
    /**
     * This method reads an integer n and computes the n-th Fibonacci number using recursion.
     *
     * Time Complexity: O(2^n) (Exponential).
     * The naive recursive approach is highly inefficient because it recalculates values multiple times.
     * A more optimal solution would use dynamic programming (memoization or iteration).
     */
    public static void problem() {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the position in the Fibonacci sequence
        System.out.print("Enter the position (n) in the Fibonacci sequence: ");
        int n = scanner.nextInt();

        // Measure execution time
        long startTime = System.nanoTime();
        long fibonacciNumber = fibonacci(n);
        long endTime = System.nanoTime();
        double elapsedTime = (endTime - startTime) / 1_000_000.0;

        // Output the Fibonacci number and execution time
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacciNumber);
        System.out.printf("Execution time: %.5f ms\n", elapsedTime);
    }

    /**
     * This method recursively calculates the n-th Fibonacci number.
     *
     * @param n The position in the Fibonacci sequence.
     * @return The n-th Fibonacci number.
     */
    public static long fibonacci(int n) {
        if (n == 0) return 0; // Base case: Fibonacci(0) = 0
        if (n == 1) return 1; // Base case: Fibonacci(1) = 1
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive relation
    }
}
