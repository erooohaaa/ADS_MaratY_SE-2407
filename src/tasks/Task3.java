package tasks;

import java.util.Scanner;

public class Task3 {
    public static void problem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        long startTime = System.nanoTime();
        boolean isPrime = checkPrime(number);
        long endTime = System.nanoTime();
        double elapsedTime = (endTime - startTime) / 1_000_000.0;

        System.out.println(number + " is " + (isPrime ? "Prime" : "Composite"));
        System.out.printf("Execution time: %.5f ms\n", elapsedTime);
    }

    public static boolean checkPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
