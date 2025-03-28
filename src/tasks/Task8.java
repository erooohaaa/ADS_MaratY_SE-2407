package tasks;

import java.util.Scanner;

public class Task8 {
    /**
     * This method reads a string and checks if it consists only of digits.
     * It uses a simple iteration approach.
     *
     * Time Complexity: O(n), where n is the length of the string.
     * The function iterates through each character once.
     */
    public static void problem() {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        // Measure execution time
        long startTime = System.nanoTime();
        boolean isDigitsOnly = isAllDigits(s);
        long endTime = System.nanoTime();

        // Output result
        System.out.println(isDigitsOnly ? "Yes" : "No");
        System.out.printf("Execution time: %.5f ms\n", (endTime - startTime) / 1_000_000.0);
    }

    /**
     * This method checks whether a given string contains only digits.
     *
     * @param s The input string to check.
     * @return true if the string contains only digits, false otherwise.
     */
    public static boolean isAllDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false; // If a non-digit character is found, return false
            }
        }
        return true; // Return true if all characters are digits
    }
}
