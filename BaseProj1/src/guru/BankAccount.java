package guru;

public class BankAccount {
	
	String accountHolder;
	int accountNumber;
	double balance;
	
	BankAccount(String name, int num, double initbalance){
		accountHolder = name;
		accountNumber = num;
		balance = initbalance;
	}

	//Method to display account info
	void displayInfo() {
		System.out.println("Account Holder: "+accountHolder);
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Balance: $"+balance);	
	}
	
	//Method to deposit money
	void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: $"+ amount);
	}
	
	//Method to check balance
	void checkBalance() {
		System.out.println("current Balance: $"+balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount account1 = new BankAccount("Guru", 123456, 1500.0);
		
		account1.displayInfo();
		account1.deposit(1500.0);
		account1.checkBalance();
		

	}

}
