package tasks;

import java.util.Scanner;

public class Task5 {
    public static void problem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the position (n) in the Fibonacci sequence: ");
        int n = scanner.nextInt();

        long startTime = System.nanoTime();
        long fibonacciNumber = fibonacci(n);
        long endTime = System.nanoTime();
        double elapsedTime = (endTime - startTime) / 1_000_000.0;

        System.out.println("Fibonacci number at position " + n + " is: " + fibonacciNumber);
        System.out.printf("Execution time: %.5f ms\n", elapsedTime);
    }

    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
