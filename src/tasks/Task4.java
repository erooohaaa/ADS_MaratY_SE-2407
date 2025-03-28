package tasks;

import java.util.Scanner;

public class Task4 {
    /**
     * This method handles user input, computes the factorial of a number,
     * and measures the execution time of the operation.
     */
    public static void problem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read the number

        long startTime = System.nanoTime(); // Start time measurement
        long factorial = computeFactorial(number); // Compute factorial
        long endTime = System.nanoTime(); // End time measurement

        double elapsedTime = (endTime - startTime) / 1_000_000.0; // Convert to milliseconds

        System.out.println(number + "! = " + factorial);
        System.out.printf("Execution time: %.5f ms\n", elapsedTime);
    }

    /**
     * This method computes the factorial of a given number recursively.
     *
     * Time complexity: O(n), where n is the input number.
     * The recursion calls itself n times, leading to linear time complexity.
     *
     * @param n The number for which the factorial is to be calculated.
     * @return The factorial of the given number.
     */
    public static long computeFactorial(int n) {
        if (n == 0 || n == 1) return 1; // Base case: factorial of 0 and 1 is 1
        return n * computeFactorial(n - 1); // Recursive case
    }
}
