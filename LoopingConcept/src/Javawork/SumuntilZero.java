package Javawork;
import java.util.*;
public class SumuntilZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;
        System.out.println("Enter the num: ");

        // Use do-while to ensure at least one input
        do {
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        // Output the total sum
        System.out.println(sum);

        scanner.close();

	}

}
