package collectionSet;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class SearchSuggestions {
    public static void main(String[] args) {
        LinkedHashSet<String> suggestions = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter search terms (type 'end' to stop):");

        while (true) {
            String term = scanner.nextLine();  // Read the input term

            if (term.equalsIgnoreCase("end")) {
                break;  // Exit the loop when the user types 'end'
            }

            suggestions.add(term);  // Add the term to the suggestions set

            // Print the search suggestions after each input
            System.out.println("\nSearch Suggestions:");
            for (String suggestion : suggestions) {
                System.out.println(suggestion);  // Print each suggestion
            }
        }

        scanner.close();  // Close the scanner to prevent resource leaks
    }
}
