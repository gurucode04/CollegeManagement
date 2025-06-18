package Work;
import java.util.*;
public class ReverseArray {
	 public static int[] reverseArray(int[] arr) {
	        int[] reversed = new int[arr.length];
	        for(int i = 0; i < arr.length; i++)
	            reversed[i] = arr[arr.length - 1 - i];
	        return reversed;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int[] reversed = reverseArray(arr);
        for(int val : reversed)
            System.out.print(val + " ");
	}

}
