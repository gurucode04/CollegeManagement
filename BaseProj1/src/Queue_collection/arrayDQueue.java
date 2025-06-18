package Queue_collection;
import java.util.ArrayDeque;
import java.util.Deque;

public class arrayDQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque = new ArrayDeque<>();

        deque.offerFirst("Start");
        deque.offerLast("End");

        System.out.println("From front: " + deque.pollFirst()); // Start
        System.out.println("From back: " + deque.pollLast()); // End
	}

}
