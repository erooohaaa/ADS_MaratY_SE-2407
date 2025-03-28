package tasks;

import java.util.Scanner;

public class Task9 {
    /**
     * This method reads values n and k and computes the binomial coefficient C(n, k) using recursion.
     * The formula used: C(n, k) = C(n-1, k-1) + C(n-1, k)
     *
     * Time Complexity: O(2^n) (Exponential).
     * This function has overlapping subproblems, making it inefficient for large n.
     * A more optimal approach would use dynamic programming (memoization).
     */
    public static void problem() {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for values of n and k
        System.out.print("Enter n and k: ");
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        // Measure execution time
        long startTime = System.nanoTime();
        int result = binomialCoefficient(n, k);
        long endTime = System.nanoTime();

        // Output the result and execution time
        System.out.println("Result: " + result);
        System.out.printf("Execution time: %.5f ms\n", (endTime - startTime) / 1_000_000.0);
    }

    /**
     * This method recursively computes the binomial coefficient C(n, k).
     *
     * @param n Total number of elements.
     * @param k Chosen elements.
     * @return Binomial coefficient C(n, k).
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1; // Base case: C(n, 0) = C(n, n) = 1
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k); // Recursive relation
    }
}
