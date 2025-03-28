package tasks;

import java.util.Scanner;

public class Task4 {
    public static void problem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        long startTime = System.nanoTime();
        long factorial = computeFactorial(number);
        long endTime = System.nanoTime();
        double elapsedTime = (endTime - startTime) / 1_000_000.0;

        System.out.println(number + "! = " + factorial);
        System.out.printf("Execution time: %.5f ms\n", elapsedTime);
    }

    public static long computeFactorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * computeFactorial(n - 1);
    }
}
