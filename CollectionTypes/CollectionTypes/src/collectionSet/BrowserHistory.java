package collectionSet;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        LinkedHashSet<String> history = new LinkedHashSet<>();  // Initialize LinkedHashSet for unique, ordered URLs
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter visited URLs (type 'exit' to finish):");

        while (true) {
            String url = scanner.nextLine();  // Read user input

            if (url.equalsIgnoreCase("exit")) {
                break;  // Exit the loop if the user types "exit"
            }

            history.add(url);  // Add the URL to the LinkedHashSet (duplicates are not allowed)
        }

        System.out.println("History (unique & ordered):");
        // Print the URLs in the order they were added, ensuring uniqueness
        for (String url : history) {
            System.out.println(url);
        }

        scanner.close();  // Close the scanner to prevent resource leaks
    }
}
