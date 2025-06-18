package collectionQueue;

import java.util.*;

public class PrintQueueSystem {
    public static void main(String[] args) {
        Queue<String> printQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter print jobs (type 'done' to stop):");

        while (true) {
            String job = scanner.nextLine();
            
            if (job.equalsIgnoreCase("done")) {
                break;
            }
            
            printQueue.add(job); // Add print job to the queue
        }

        // Processing print jobs
        System.out.println("\nProcessing print jobs:");
        while (!printQueue.isEmpty()) {
            System.out.println("Printing: " + printQueue.poll()); // Poll to get and remove the first element
        }

        scanner.close();
    }
}
