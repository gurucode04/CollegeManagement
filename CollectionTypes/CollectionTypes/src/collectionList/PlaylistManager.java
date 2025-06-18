package collectionList;

import java.util.LinkedList;
import java.util.Scanner;

public class PlaylistManager {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Show Playlist");
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
                    System.out.print("Enter song name: ");
                    String song = scanner.nextLine();
                    playlist.add(song);
                    System.out.println("Song added.");
                    break;

                case 2:
                    System.out.print("Enter song name to remove: ");
                    String remove = scanner.nextLine();
                    if (playlist.remove(remove)) {
                        System.out.println("Song removed.");
                    } else {
                        System.out.println("Song not found in playlist.");
                    }
                    break;

                case 3:
                    System.out.println("Your Playlist:");
                    if (playlist.isEmpty()) {
                        System.out.println("(No songs in playlist)");
                    } else {
                        for (String s : playlist) {
                            System.out.println("- " + s);
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
