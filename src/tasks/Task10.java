package tasks;

import java.util.Scanner;

public class Task10 {
    /**
     * This method reads two integers and calculates their GCD using recursion.
     * The function implements the Euclidean Algorithm: GCD(a, b) = GCD(b, a % b).
     *
     * Time Complexity: O(log(min(a, b))).
     * Each step reduces the problem size by a factor of approximately 2.
     */
    public static void problem() {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for values of a and b
        System.out.print("Enter a and b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Measure execution time
        long startTime = System.nanoTime();
        int result = gcd(a, b);
        long endTime = System.nanoTime();

        // Output the result and execution time
        System.out.println("GCD: " + result);
        System.out.printf("Execution time: %.5f ms\n", (endTime - startTime) / 1_000_000.0);
    }

    /**
     * This method computes the Greatest Common Divisor (GCD) using recursion.
     *
     * @param a First integer.
     * @param b Second integer.
     * @return GCD of a and b.
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; // Base case: if b = 0, then GCD = a
        }
        return gcd(b, a % b); // Recursive call following the Euclidean algorithm
    }
}
