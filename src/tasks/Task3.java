package tasks;

import java.util.Scanner;

public class Task3 {
    /**
     * This method handles user input, checks if the number is prime,
     * and measures the execution time of the operation.
     */
    public static void problem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read the number

        long startTime = System.nanoTime(); // Start time measurement
        boolean isPrime = checkPrime(number); // Check if the number is prime
        long endTime = System.nanoTime(); // End time measurement

        double elapsedTime = (endTime - startTime) / 1_000_000.0; // Convert to milliseconds

        System.out.println(number + " is " + (isPrime ? "Prime" : "Composite"));
        System.out.printf("Execution time: %.5f ms\n", elapsedTime);
    }

    /**
     * This method checks whether a number is prime.
     *
     * Time complexity: O(√n), where n is the input number.
     * The loop iterates up to √n to check divisibility.
     *
     * @param num The input number.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean checkPrime(int num) {
        if (num < 2) return false; // Numbers less than 2 are not prime

        // Iterate from 2 to sqrt(num) to check divisibility
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // If divisible, it's not prime
            }
        }

        return true; // If no divisors were found, it's prime
    }
}
