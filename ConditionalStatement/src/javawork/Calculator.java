package javawork;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter num1: ");
		float num1 = in.nextFloat();
		System.out.println("Enter num2: ");
		float num2 = in.nextFloat();
		System.out.println("Enter the choice: ");
		String choice = in.next();
		switch(choice) {
	case "+": System.out.println("Addition: "+(num1+num2));
	break;
	case "-": System.out.println(num1 - num2);
	break;
	case "*": System.out.println("Multiplication: "+(num1*num2));
	break;
	case "/": System.out.println("Division: "+(num1/num2));
	break;
default:System.out.println("Invalid operator");
}
in.close();
	}

}
