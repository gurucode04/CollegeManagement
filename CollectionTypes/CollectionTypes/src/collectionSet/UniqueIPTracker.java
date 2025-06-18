package collectionSet;

import java.util.HashSet;

public class UniqueIPTracker {
    public static void main(String[] args) {
        HashSet<String> ipAddresses = new HashSet<>();  // Initialize the HashSet with String type
        String[] logs = {"192.168.1.1", "le.e.e.l", "192.168.1.1", "le.e.e.2"};

        for (String ip : logs) {
            ipAddresses.add(ip);  // Add IP address to HashSet (automatically handles uniqueness)
        }

        System.out.println("Unique IP addresses today: " + ipAddresses);  // Print the unique IP addresses
    }
}
