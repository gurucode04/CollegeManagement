package collectionMap;

import java.util.*;

public class LRUCach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int CACHE_SIZE = 3;

        LinkedHashMap<String, String> cache = new LinkedHashMap<String, String>(CACHE_SIZE, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
                return size() > CACHE_SIZE;
            }
        };

        while (true) {
            System.out.print("\nEnter key (or 'exit' to quit): ");
            String key = sc.nextLine();

            if (key.equalsIgnoreCase("exit")) {
                break;
            }

            if (cache.containsKey(key)) {
                System.out.println("Cache hit! Value: " + cache.get(key));
            } else {
                System.out.print("Enter value: ");
                String value = sc.nextLine();
                cache.put(key, value);
                System.out.println("Cache updated.");
            }

            // Show cache state
            System.out.println("Current cache state (most recent last):");
            for (Map.Entry<String, String> entry : cache.entrySet()) {
                System.out.println(entry.getKey() + " => " + entry.getValue());
            }
        }

        sc.close();
    }
}
