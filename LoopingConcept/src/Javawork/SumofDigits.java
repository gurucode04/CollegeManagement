package Javawork;
import java.util.*;
public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Input
		 	System.out.println("Enter the number: ");
	        int n = scanner.nextInt();
	        int sum = 0;

	        // Loop to extract digits and add them
	        for (; n != 0; n /= 10) {
	            sum += n % 10;
	        }

	        // Output
	        System.out.println(sum);

	        scanner.close();

	}

}
