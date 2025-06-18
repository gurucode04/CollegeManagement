package Javawork;
import java.util.*;
public class GCD {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input two numbers
		System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        // Euclidean Algorithm using while loop
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        // Output GCD
        System.out.println(a);

        scanner.close();
	}

}
