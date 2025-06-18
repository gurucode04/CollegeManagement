package Javawork;
import java.util.*;
public class ReverseDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input
		System.out.println("Enter the num: ");
        int n = scanner.nextInt();
        int reversed = 0;

        // Reverse logic using while loop
        while (n != 0) {
            int digit = n % 10;          // Get last digit
            reversed = reversed * 10 + digit; // Append digit
            n = n / 10;                  // Remove last digit
        }

        // Output
        System.out.println(reversed);

        scanner.close();
	}

}
