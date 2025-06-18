package javawork;
import java.util.*;
public class GradeRemark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char ch = in.next().charAt(0);
		switch(ch) {
		case 'A': System.out.println("Excellent");
				break;
		case 'B': System.out.println("Very Good");
				break;
		case 'C': System.out.println("Good");
				break;
		case 'D': System.out.println("Needs Improvement");
				break;
		case 'F': System.out.println("Fail");
				break;
		default: System.out.println("Invalid grade");		
		}

	}

}
