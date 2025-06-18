package collectionMap;

import java.util.*;

public class LoginHistory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, String> loginMap = new LinkedHashMap<>();

        System.out.print("Enter number of users: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            String time = new Date().toString();
            loginMap.put(username, time);
        }

        System.out.println("\nLogin Order:");
        for (Map.Entry<String, String> entry : loginMap.entrySet()) {
            System.out.println(entry.getKey() + " logged in at " + entry.getValue());
        }

        sc.close();
    }
}
