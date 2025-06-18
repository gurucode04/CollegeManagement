package NestedForLoop;
import java.util.*;
public class AsteriskBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

        // Input: size of the box
        System.out.print("Enter box size: ");
        int n = in.nextInt();

        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Loop through each column
            for (int j = 1; j <= n; j++) {
                // Print * for first/last row or first/last column
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}

}
