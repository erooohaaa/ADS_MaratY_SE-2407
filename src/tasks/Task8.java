package tasks;

import java.util.Scanner;

public class Task8 {
    /**
     * This method reads a string and checks if it consists only of digits using recursion.
     *
     * Time Complexity: O(n), where n is the length of the string.
     * The function makes n recursive calls to check each character.
     */
    public static void problem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        long startTime = System.nanoTime();
        boolean isDigitsOnly = isAllDigitsRecursive(s);
        long endTime = System.nanoTime();

        System.out.println(isDigitsOnly ? "Yes" : "No");
        System.out.printf("Execution time: %.5f ms\n", (endTime - startTime) / 1_000_000.0);
    }

    /**
     * Recursively checks if a string contains only digits.
     *
     * @param s The string to check.
     * @return true if all characters are digits, false otherwise.
     */
    public static boolean isAllDigitsRecursive(String s) {
        return checkDigits(s, 0);
    }

    /**
     * Helper recursive method to check each character in the string.
     *
     * @param s The string to check.
     * @param index The current index being checked.
     * @return true if all remaining characters are digits, false otherwise.
     */
    private static boolean checkDigits(String s, int index) {
        // Base case: reached end of string
        if (index == s.length()) {
            return true;
        }

        // Check current character
        if (!Character.isDigit(s.charAt(index))) {
            return false;
        }

        // Recursive case: check next character
        return checkDigits(s, index + 1);
    }
}