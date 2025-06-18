package collectionQueue;

import java.util.*;

public class BrowserNavigation {
    public static void main(String[] args) {
        LinkedList<String> history = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Visit pages (type 'back' to go back, 'exit' to end):");

        while (true) {
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("exit")) {
                break; // Exit the program
            }

            if (command.equalsIgnoreCase("back")) {
                if (!history.isEmpty()) {
                    System.out.println("Going back from: " + history.removeLast()); // Remove the last page visited
                } else {
                    System.out.println("No pages to go back to.");
                }
            } else {
                history.add(command); // Add the new page to the history
                System.out.println("Visited: " + command);
            }

            System.out.println("Current history: " + history); // Show the current history
        }

        System.out.println("Final history: " + history); // Show the final history before program ends
        scanner.close();
    }
}
