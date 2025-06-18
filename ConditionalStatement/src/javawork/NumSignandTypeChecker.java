package javawork;
import java.util.*;
public class NumSignandTypeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = in.nextInt();
		if(num>0) {
			if(num%2 == 0) {
			System.out.println("Positive Even");
			}
			else {
				System.out.println("Positive Odd");
			}
		}
		if(num<0) {
			if(num%2 == 0) {
				System.out.println("Negative Even");
			}
			else {
				System.out.println("Negative Odd");
			}
		}else {
			System.out.println("Zero");
		}
			}

}
