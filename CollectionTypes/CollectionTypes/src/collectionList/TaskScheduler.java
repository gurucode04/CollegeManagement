package collectionList;

import java.util.LinkedList;
import java.util.Scanner;

public class TaskScheduler {
    public static void main(String[] args) {
        LinkedList<String> taskQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Task");
            System.out.println("2. Process Task");
            System.out.println("3. Show Queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    taskQueue.addLast(scanner.nextLine());
                    System.out.println("Task added.");
                    break;

                case 2:
                    if (!taskQueue.isEmpty()) {
                        System.out.println("Processing task: " + taskQueue.removeFirst());
                    } else {
                        System.out.println("No tasks to process.");
                    }
                    break;

                case 3:
                    System.out.println("Task Queue:");
                    if (taskQueue.isEmpty()) {
                        System.out.println("(Queue is empty)");
                    } else {
                        for (String task : taskQueue) {
                            System.out.println("- " + task);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
