package collectionList;

import java.util.ArrayList;
import java.util.Scanner;

public class RecentMovies {
    public static void main(String[] args) {
        ArrayList<String> recentMovies = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter movie names (type 'exit' to stop):");

        while (true) {
            System.out.print("Movie name: ");
            String movie = scanner.nextLine();

            if (movie.equalsIgnoreCase("exit")) {
                break;
            }

            // Avoid duplicates; move to front if already exists
            recentMovies.remove(movie);
            recentMovies.add(0, movie); // Add to the front

            System.out.println("Viewed movies:");
            for (String m : recentMovies) {
                System.out.println("- " + m);
            }
        }

        scanner.close();
    }
}
