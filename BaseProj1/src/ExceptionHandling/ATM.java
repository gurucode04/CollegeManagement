package ExceptionHandling;

public class ATM {
	private double balance = 500;

    public void withdraw(double amount) throws Exception {
        try {
            if (amount > balance) {
                throw new Exception("Insufficient funds");
            }

            balance -= amount;
            System.out.println("Withdrawn: $" + amount);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
 

        } finally {
            System.out.println("Transaction complete.");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm = new ATM();
		try {
			atm.withdraw(200);
		}catch(Exception e) {
			System.out.println("Handled in main: "+e.getMessage());
		}
	}

}
