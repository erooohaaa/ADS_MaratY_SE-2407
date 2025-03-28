package tasks;

import java.util.Scanner;

public class Task9 {
    public static void problem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n and k: ");
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        long startTime = System.nanoTime();
        int result = binomialCoefficient(n, k);
        long endTime = System.nanoTime();

        System.out.println("Result: " + result);
        System.out.printf("Execution time: %.5f ms\n", (endTime - startTime) / 1_000_000.0);
    }

    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
}
