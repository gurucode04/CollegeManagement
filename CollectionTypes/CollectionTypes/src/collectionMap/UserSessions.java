package collectionMap;

import java.util.*;

public class UserSessions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<Integer, String> sessionMap = new Hashtable<>();

        System.out.print("Enter number of users: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character after the integer input

        for (int i = 0; i < n; i++) {
            System.out.print("Enter user ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume the newline after the integer input

            System.out.print("Enter session token: ");
            String token = sc.nextLine();

            sessionMap.put(id, token);
        }

        System.out.println("\nSessions:");
        for (Map.Entry<Integer, String> entry : sessionMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " | Token: " + entry.getValue());
        }

        sc.close();
    }
}
