package javawork;
import java.util.*;
import java.math.*;
public class HighestScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter score1: ");
		int sc1 = in.nextInt();
		System.out.println("Enter score2: ");
		int sc2 = in.nextInt();
		System.out.println("Enter score3: ");
		int sc3 = in.nextInt();
		
		int HighestScore = Math.max(sc1, Math.max(sc2, sc3));
		
		System.out.println("Highest Score: "+HighestScore);
		
	}

}
