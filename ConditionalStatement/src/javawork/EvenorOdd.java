package javawork;
import java.util.*;
public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = in.nextInt();
		if(num % 2 ==0 ) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

}
