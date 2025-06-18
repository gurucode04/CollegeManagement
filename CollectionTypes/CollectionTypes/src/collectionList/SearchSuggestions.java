package collectionList;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchSuggestions {
    public static void main(String[] args) {
        ArrayList<String> suggestions = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product suggestions (type 'done' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            suggestions.add(input); // dynamically add suggestions
        }

        System.out.println("\nSuggestions:");
        for (int i = 0; i < suggestions.size(); i++) {
            System.out.println((i + 1) + ". " + suggestions.get(i));
        }

        scanner.close();
    }
}
