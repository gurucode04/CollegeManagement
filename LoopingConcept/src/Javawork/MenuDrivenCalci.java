package Javawork;
import java.util.*;
public class MenuDrivenCalci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Read two numbers
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            // Read operation choice
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (a + b));
                    break;
                case 2:
                    System.out.println("Result: " + (a - b));
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        scanner.close();

	}

}
