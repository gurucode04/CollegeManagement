package Accessmodifier;

public class BankAccount {
	
	// private: accessible only within this class
    private double balance;
    // protected: accessible within the same package or by subclasses
    protected String accountHolderName;
    // public: accessible from anywhere
    public String accountNumber;
    // Constructor - 
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }
    
    // public method to deposit money
    public void deposit(double amount) { //
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }
    
 // public method to display account info
    public void displayAccountInfo() { // methods 
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: $" + balance);
    }
    
    // private method to calculate interest (internal logic)
    private double calculateInterest() {  //method
        return balance * 0.03; // 3% interest
    }
    
    // public method to apply interest
    public void applyInterest() {  
        double interest = calculateInterest();
        balance += interest;
        System.out.println("Interest Applied: $" + interest);
    }
    public static void main(String[] args) {
    	BankAccount account = new BankAccount("1234567890","Alice Smith", 1000.00);
    	account.deposit(500.00);
    	account.applyInterest();
    	account.displayAccountInfo();
    	
    	//account.balance = 2000; //Not allowed: balance is private
    	//account.calculateInterest(); //Not allowed: private method
    }
}

	