package javawork;
import java.util.*;
public class GradeEvaluator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Score: ");
		int score = in.nextInt();
		
		if(score>=40) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}

	}

}
