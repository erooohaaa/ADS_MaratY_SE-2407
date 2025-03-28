package tasks;

import java.util.Scanner;

public class Task2 {
    public static void problem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] values = new int[size];

        System.out.print("Enter " + size + " numbers: ");
        for (int i = 0; i < size; i++) {
            values[i] = scanner.nextInt();
        }

        long startTime = System.nanoTime();
        double average = calculateAverage(values);
        long endTime = System.nanoTime();
        double elapsedTime = (endTime - startTime) / 1_000_000.0;

        System.out.println("Average value: " + average);
        System.out.printf("Execution time: %.5f ms\n", elapsedTime);
    }

    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}
