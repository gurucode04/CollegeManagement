package NestedIfelse;
import java.util.*;
public class HospitalTriageSys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = in.nextInt();
		in.nextLine();
		System.out.println("Has severe symptoms? (yes/no): ");
		String symptoms = in.nextLine().trim().toLowerCase();
		if(symptoms.equals("yes")) {
			if(age > 60) {
				System.out.println("High Priority patient.");
			}
			else {
				System.out.println("Medium Priority patient.");
			}
		}
		else {
			System.out.println("Low Priority patient.");
		}
		in.close();

	}

}
