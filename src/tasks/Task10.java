package tasks;

import java.util.Scanner;

public class Task10 {
    public static void problem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a and b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        long startTime = System.nanoTime();
        int result = gcd(a, b);
        long endTime = System.nanoTime();

        System.out.println("GCD: " + result);
        System.out.printf("Execution time: %.5f ms\n", (endTime - startTime) / 1_000_000.0);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; // Базовый случай: если b = 0, то GCD = a
        }
        return gcd(b, a % b); // Рекурсивный вызов по алгоритму Евклида
    }
}
