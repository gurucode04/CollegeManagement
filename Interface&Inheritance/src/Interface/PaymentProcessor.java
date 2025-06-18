package Interface;
import java.util.*;

interface PaymentGateway {
    void processPayment(double amount);
    void generateReceipt();
}

// UPI Payment implementation
class UPIPayment implements PaymentGateway {
    private double amount;

    public void processPayment(double amount) {
        this.amount = amount;
        System.out.println("Processing UPI payment of ₹" + amount + "...");
    }

    public void generateReceipt() {
        System.out.println("Receipt: UPI Payment Successful.");
    }
}

// Credit Card Payment implementation
class CreditCardPayment implements PaymentGateway {
    private double amount;

    public void processPayment(double amount) {
        this.amount = amount;
        System.out.println("Processing Credit Card payment of ₹" + amount + "...");
    }

    public void generateReceipt() {
        System.out.println("Receipt: Credit Card Payment Successful.");
    }
}
public class PaymentProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input: payment method
        System.out.print("Enter payment method (UPI/CreditCard): ");
        String method = scanner.nextLine().trim();

        // Input: amount
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        PaymentGateway payment;

        // Instantiate appropriate payment class based on input
        if (method.equalsIgnoreCase("UPI")) {
            payment = new UPIPayment();
        } else if (method.equalsIgnoreCase("CreditCard")) {
            payment = new CreditCardPayment();
        } else {
            System.out.println("Invalid payment method.");
            scanner.close();
            return;
        }

        // Process payment and generate receipt
        payment.processPayment(amount);
        payment.generateReceipt();

        scanner.close();

	}

}
