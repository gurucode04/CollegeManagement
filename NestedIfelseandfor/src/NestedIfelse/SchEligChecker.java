package NestedIfelse;
import java.util.*;
public class SchEligChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int marks;
		int familyincome;
		System.out.println("Enter marks:");
		marks = in.nextInt();
		System.out.println("Enter family income: ");
		familyincome = in.nextInt();
		if(marks>=85 && familyincome<500000) {
			System.out.println("Full Scholarship granted.");
		}
		else if(marks >= 70 && marks <= 85 && familyincome<300000){
			System.out.println("Half Scholarship granted.");
		}
		else {
			System.out.println("No scholarship granted.");
		}
		
	}

}
