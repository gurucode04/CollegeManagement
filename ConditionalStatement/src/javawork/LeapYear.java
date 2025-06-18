package javawork;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = in.nextInt();
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					System.out.println("Leap year");
				}else {
					System.out.println("Not a Leap year");
		}
		}else {
			System.out.println("Not a Leap year");
			}

	}else {
		System.out.println("Not a Leap year");
	}
}
	}
