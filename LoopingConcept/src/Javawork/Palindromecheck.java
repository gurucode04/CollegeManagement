package Javawork;
import java.util.*;
public class Palindromecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input
		System.out.println("Enter the num: ");
        int n = scanner.nextInt();
        int original = n;
        int reversed = 0;

        // Reverse the number
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        // Check if original number is equal to its reverse
        if (original == reversed) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        scanner.close();

	}

}
