package tasks;

import java.util.Scanner;

public class Task7 {
    public static void problem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter elements: ");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        long startTime = System.nanoTime();
        printReverse(n, numbers);
        long endTime = System.nanoTime();

        double elapsedTime = (endTime - startTime) / 1_000_000.0;
        System.out.printf("\nExecution time: %.5f ms\n", elapsedTime);
    }

    public static void printReverse(int index, int[] numbers) {
        if (index == 0) return;
        System.out.print(numbers[index - 1] + " ");
        printReverse(index - 1, numbers);
    }
}
