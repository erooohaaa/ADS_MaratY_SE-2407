import java.util.Scanner;
import tasks.*;

public class Main {
    /**
     * This is the main entry point of the program.
     * The user selects a task (1-10) to execute.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Task List:");
        System.out.println("1 - Find the smallest number in an array");
        System.out.println("2 - Calculate the average of numbers");
        System.out.println("3 - Check if a number is prime");
        System.out.println("4 - Compute factorial of a number");
        System.out.println("5 - Find the nth Fibonacci number");
        System.out.println("6 - Compute power (a^n) using fast exponentiation");
        System.out.println("7 - Print an array in reverse order");
        System.out.println("8 - Check if a string consists only of digits");
        System.out.println("9 - Compute binomial coefficient (nCk)");
        System.out.println("10 - Find the greatest common divisor (GCD)");
        System.out.print("\nChoose a task (1-10): ");

        int choice = input.nextInt();

        // Handling user choice with switch-case
        switch (choice) {
            case 1:
                Task1.problem();
                break;
            case 2:
                Task2.problem();
                break;
            case 3:
                Task3.problem();
                break;
            case 4:
                Task4.problem();
                break;
            case 5:
                Task5.problem();
                break;
            case 6:
                Task6.problem();
                break;
            case 7:
                Task7.problem();
                break;
            case 8:
                Task8.problem();
                break;
            case 9:
                Task9.problem();
                break;
            case 10:
                Task10.problem();
                break;
            default:
                // Handles invalid input cases
                System.out.println("Invalid choice! Please enter a number from 1 to 10.");
        }

        input.close(); // Close the scanner to avoid memory leaks
    }
}
