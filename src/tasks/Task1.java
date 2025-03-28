package tasks;

import java.util.Scanner;

public class Task1 {
    public static void problem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.print("Enter " + size + " numbers: ");
        for (int index = 0; index < size; index++) {
            numbers[index] = scanner.nextInt();
        }

        long start = System.nanoTime();
        int minValue = getMinimum(numbers);
        long end = System.nanoTime();
        double executionTime = (end - start) / 1_000_000.0;

        System.out.println("Smallest number: " + minValue);
        System.out.printf("Execution time: %.5f ms\n", executionTime);
    }

    public static int getMinimum(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
}
