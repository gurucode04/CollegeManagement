package guru;
import java.util.*;
public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Password Login System
		String crctpass = "java123";
		Scanner in = new Scanner(System.in);
		String inputpass;
		while(true) {
			System.out.println("Enter the password: ");
			inputpass = in.nextLine();
			if(inputpass.equals(crctpass)) {
				System.out.println("Login Successful");
				break;
			}
			else {
				System.out.println("Incorrect password");
				break;
			}
		}
		
		// 2. Countdown timer
		int num;
		System.out.println("Enter the num: ");
		num = in.nextInt();
		while(num >= 0) {
			System.out.print(num+",");
			num--;
		}
		System.out.println();
		
		// 3. Sum until Negative
		int total = 0, posnum;
		while(true) {
			System.out.println("Enter the posnum:");
			posnum=in.nextInt();
			if(posnum<0) {
				break;
			}
			total+=posnum;
		}
		System.out.println("Total sum of all posnum: "+total);
		in.close();
		
		}
	}


