package tasks;

import java.util.Scanner;

public class Task8 {
    public static void problem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        long startTime = System.nanoTime();
        boolean isDigitsOnly = isAllDigits(s);
        long endTime = System.nanoTime();

        System.out.println(isDigitsOnly ? "Yes" : "No");
        System.out.printf("Execution time: %.5f ms\n", (endTime - startTime) / 1_000_000.0);
    }

    public static boolean isAllDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
