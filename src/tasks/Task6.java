package tasks;

import java.util.Scanner;

public class Task6 {
    public static void problem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter exponent (n): ");
        int n = scanner.nextInt();

        long startTime = System.nanoTime();
        long result = power(a, n);
        long endTime = System.nanoTime();
        double elapsedTime = (endTime - startTime) / 1_000_000.0;

        System.out.println(a + "^" + n + " = " + result);
        System.out.printf("Execution time: %.5f ms\n", elapsedTime);
    }

    public static long power(int a, int n) {
        if (n == 0) return 1;
        if (n % 2 == 0) {
            long half = power(a, n / 2);
            return half * half;
        } else {
            return a * power(a, n - 1);
        }
    }
}
