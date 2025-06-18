package collectionSet;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueUsernames {
    public static void main(String[] args) {
        HashSet<String> usernames = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter usernames (type 'done' to stop):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;  // Exit the loop if the user types 'done'
            }

            if (usernames.contains(input)) {
                System.out.println("Username already exists!");
            } else {
                usernames.add(input);  // Add the username to the set
                System.out.println("Username registered.");
            }

            System.out.println("Usernames: " + usernames);  // Print all registered usernames
        }

        scanner.close();  // Close the scanner after use
    }
}
