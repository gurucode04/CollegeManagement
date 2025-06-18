package javawork;
import java.util.*;
public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the score: ");
		int sc = in.nextInt();
		
		if(sc>=90) {
			System.out.println("Excellent");
		}else if(sc>=70 && sc<=89) {
			if(sc>=80) {System.out.println("Very Good");}
			else {
				System.out.println("Good");
		}}
		if(sc<70) {
			System.out.println("Needs Improvement");
		}

	}

}
