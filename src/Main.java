import java.util.Scanner;
import tasks.*;

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
            default:
                System.out.println("Invalid choice! Please enter a number from 1 to 10.");
        }

        input.close();
    }
}
