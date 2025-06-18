package guru;
import java.util.*;
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//1. Shopping cart Total
	int[] prices = {200, 360, 280, 220, 140};
	int total = 0;
	for(int i=0; i<prices.length;i++) {
		total += prices[i];
	}
	System.out.println("Total price of 5 items: "+total);
	
	//2. Employee ID Display
	for(int i=101; i<=110;i++) {
		System.out.println("Employee ID: "+i);
	}
	
	//3. Multiplication Table
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
