package Work;
import java.util.*;
public class CountEvenandOdd {
	public static void countEvenOdd(int[] array) {
        int even = 0, odd = 0;
        for (int val : array) {
            if (val % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();

        countEvenOdd(array);

	}

}
