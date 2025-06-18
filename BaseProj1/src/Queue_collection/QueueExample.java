package Queue_collection;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a queue of strings
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");

        // Display the front element without removing it
        System.out.println("Front of queue: " + queue.peek());

        // Remove and display elements in FIFO order
        while (!queue.isEmpty()) {
            System.out.println("Removed: " + queue.poll());
        }

        // Check if queue is empty
        System.out.println("Queue empty? " + queue.isEmpty());
	}

}
