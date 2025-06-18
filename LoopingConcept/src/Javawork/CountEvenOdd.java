package Javawork;
import java.util.*;
public class CountEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input
		System.out.println("Enter start: ");
        int start = scanner.nextInt();
        System.out.println("Enter end: ");
        int end = scanner.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        // Loop from start to end (inclusive)
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        // Output
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);

        scanner.close();

	}

}
