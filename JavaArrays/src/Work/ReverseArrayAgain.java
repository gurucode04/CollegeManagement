package Work;
import java.util.*;
public class ReverseArrayAgain {
	public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n: ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int[] array = new int[n];

        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();

        int[] result = reverseArray(array);
        for (int val : result)
            System.out.print(val + " ");

	}

}
