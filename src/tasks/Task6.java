package tasks;

import java.util.Scanner;

public class Task6 {
    /**
     * This method reads base 'a' and exponent 'n' and computes a^n using fast exponentiation.
     *
     * Time Complexity: O(log n) (Logarithmic).
     * The algorithm efficiently calculates power using recursion and the divide-and-conquer strategy.
     */
    public static void problem() {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter base and exponent
        System.out.print("Enter base (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter exponent (n): ");
        int n = scanner.nextInt();

        // Measure execution time
        long startTime = System.nanoTime();
        long result = power(a, n);
        long endTime = System.nanoTime();
        double elapsedTime = (endTime - startTime) / 1_000_000.0;

        // Output the result and execution time
        System.out.println(a + "^" + n + " = " + result);
        System.out.printf("Execution time: %.5f ms\n", elapsedTime);
    }

    /**
     * This method computes a^n using the fast exponentiation method.
     *
     * @param a The base number.
     * @param n The exponent.
     * @return The result of a^n.
     */
    public static long power(int a, int n) {
        if (n == 0) return 1; // Base case: a^0 = 1

        if (n % 2 == 0) {
            // If exponent is even: a^n = (a^(n/2))^2
            long half = power(a, n / 2);
            return half * half;
        } else {
            // If exponent is odd: a^n = a * a^(n-1)
            return a * power(a, n - 1);
        }
    }
}
