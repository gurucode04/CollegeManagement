package Queues;

class Customer { 
    String name; 
    Customer next; 
 
    Customer(String name) { 
        this.name = name; 
    } 
} 
 
class BankQueue { 
    private Customer front = null, rear = null; 
 
    public void addCustomer(String name) { 
        Customer newCustomer = new Customer(name); 
        if (rear == null) { 
            front = rear = newCustomer; 
        } else { 
            rear.next = newCustomer; 
            rear = newCustomer; 
        } 
    } 
 
    public void serveCustomer() { 
        if (front == null) { 
            System.out.println("No customers in the queue."); 
            return; 
        } 
        System.out.println("Serving: " + front.name); 
        front = front.next; 
        if (front == null) rear = null; 
    } 
 
    public void showQueue() { 
        Customer current = front; 
        System.out.println("Current queue:"); 
        while (current != null) { 
            System.out.println("- " + current.name); 
            current = current.next; 
        } 
    } 
}

public class BankQueueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BankQueue queue = new BankQueue(); 
	        queue.addCustomer("Alice"); 
	        queue.addCustomer("Bob"); 
	        queue.addCustomer("Charlie"); 
	 
	        queue.showQueue(); 
	        queue.serveCustomer(); 
	        queue.showQueue();

	}

}
