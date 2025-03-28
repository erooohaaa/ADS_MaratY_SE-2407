
import java.util.Scanner;
import tasks.Task1;
import tasks.Task2;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Choose a task (1-10): ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                Task1.problem();
                break;
            case 2:
                Task2.problem();
                break;
            default:
                System.out.println("Invalid choice! Please enter a number from 1 to 10.");
        }

        input.close();
    }
}
