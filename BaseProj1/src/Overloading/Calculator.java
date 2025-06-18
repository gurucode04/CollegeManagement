package Overloading;
import java.util.*;

public class Calculator {

	int add(int a,int b) {
		return a+b;
	}
	
	double add(double a,double b) {
		return a+b;
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a & b: ");
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println("Sum of 2 integers: "+cal.add(a, b));
		
		System.out.println("Enter a & b: ");
		double m = in.nextDouble();
		double n = in.nextDouble();
		System.out.println("Sum of two decimal numbers: "+cal.add(m, n));
		
		System.out.println("Enter a & b & c: ");
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		System.out.println("Sum of three integers: "+cal.add(x,y,z));
		
	}

}
