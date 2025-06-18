package collectionSet;

import java.util.TreeSet;
import java.util.Scanner;

public class AutoCompleteSystem {
    public static void main(String[] args) {
        TreeSet<String> dictionary = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter words to add to the dictionary (type 'stop' to finish):");

        while (true) {
            String word = scanner.nextLine();  // Read the input word

            if (word.equalsIgnoreCase("stop")) {
                break;  // Exit the loop when 'stop' is entered
            }

            dictionary.add(word.toLowerCase());  // Add the word in lowercase to the dictionary
        }

        // Display the dictionary words in sorted order
        System.out.println("\nDictionary Words:");
        for (String word : dictionary) {
            System.out.println(word);
        }

        scanner.close();  // Close the scanner to avoid resource leaks
    }
}
