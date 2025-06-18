package collectionSet;

import java.util.TreeSet;
import java.util.Scanner;

public class GameLeaderboard {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();  // TreeSet to store scores in ascending order
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter player scores (type -1 to stop):");

        while (true) {
            int score = scanner.nextInt();  // Read the score

            if (score == -1) {
                break;  // Exit the loop when -1 is entered
            }

            scores.add(score);  // Add the score to the TreeSet (duplicates are ignored, and order is maintained)
        }

        System.out.println("\nLeaderboard (Ascending Order):");
        for (int score : scores) {
            System.out.println(score);  // Print each score in ascending order
        }

        scanner.close();  // Close the scanner to avoid resource leaks
    }
}
