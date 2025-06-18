package collectionMap;

import java.util.*;

public class ConfigSettings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<String, String> config = new Hashtable<>();

        System.out.print("Enter number of settings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume the newline character

        for (int i = 0; i < n; i++) {
            System.out.print("Enter config key: ");
            String key = sc.nextLine();

            System.out.print("Enter config value: ");
            String value = sc.nextLine();

            config.put(key, value);
        }

        System.out.println("\nSettings:");
        for (Map.Entry<String, String> entry : config.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        sc.close();
    }
}
