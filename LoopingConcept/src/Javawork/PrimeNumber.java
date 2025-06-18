package Javawork;
import java.util.*;
public class PrimeNumber {
	public static boolean isPrime(int num) {
        if (num <= 1) return false;
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the 1st num: ");
		int num1 = in.nextInt();
		System.out.println("Enter the 2nd num: ");
		int num2 = in.nextInt();
		for(int i=num1+1;i<num2;i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
in.close();
	}

}
