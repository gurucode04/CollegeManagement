package Javawork;

import java.util.Scanner;

public class MultiplyTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter the number: ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		System.out.println("The multiplication table of "+num+" : ");
		for(int i=1; i<=10; i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}

	}

}
