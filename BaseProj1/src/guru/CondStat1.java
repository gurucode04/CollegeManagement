package guru;
import java.util.*;
public class CondStat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if condition
		int age;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the age:");
		age = in.nextInt();
		if(age>=18) {
			System.out.println("The person can vote.");
		}
		else {
			System.out.println("The person cannot vote.");
		}
		
		//nested if 
		int age1, balance;
		System.out.println("Enter the age1:");
		age1=in.nextInt();
		
		if(age1>=21) {
			System.out.println("He should have balance 25k or more");
			System.out.println("Enter the balance amount");
			balance = in.nextInt();
			if(balance >= 25000) {
				System.out.println("He is eligible to take loan");
			}
			else {
				System.out.println("He is not eligible to take loan");
			}
		}
		else {
			System.out.println("He should have balance less than 25k");
		}
		
		//Switch - Menu selection
		int choice;
		System.out.println("Enter the choice:");
		choice = in.nextInt();
		switch(choice) {
		case 1: System.out.println("You have choosen Pizza");
		break;
		case 2: System.out.println("You have choosen Burger");
		break;
		case 3: System.out.println("You have choosen Momos");
		break;
		case 4: System.out.println("You have choosen French fries");
		break;		
		default: System.out.println("You have entered the wrong choice");
		}
		in.close();
	}

}
