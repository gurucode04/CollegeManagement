package Javawork;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int fact=1;
		System.out.println("Enter the num: ");
		int n=in.nextInt();
		if(n<0) {
			System.out.println(0);
		}
		for(int i=1;i<=n;i++) {
			fact *= i;
		}
		System.out.println("Factorial of "+n+": "+fact);
	}

}
