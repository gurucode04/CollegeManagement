package NestedIfelse;
import java.util.*;
public class LoanApprovalSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Are you employed? (yes/no): ");
		String employed = in.nextLine().trim().toLowerCase();
		System.out.println("Enter Credit Score: ");
		int CreditScore = in.nextInt();
		
		if(employed.equals("yes")) {
			if(CreditScore > 750) {
				System.out.println("Loan approved");
			}
			else if(CreditScore >= 600 && CreditScore <=750) {
				System.out.println("Further review");
			}
		}else {
			System.out.println("Loan denied");
		}
	}

}
