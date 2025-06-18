package javawork;
import java.util.*;
public class Bankloanintcal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the principal: ");
		float principal = in.nextFloat();
		System.out.println("Enter the duration: ");
		float duration = in.nextFloat();
		System.out.println("Enter the rate of interest: ");
		float ratein = in.nextFloat();
		
		float SI = (principal*duration*ratein)/100;
		
		System.out.println("Simple Interest: "+SI);		

	}

}
