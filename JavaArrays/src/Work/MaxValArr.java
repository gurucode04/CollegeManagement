package Work;
import java.util.*;
public class MaxValArr {
	public static int findMax(int[] arr) {
        int max = arr[0];
        for(int num : arr)
            if(num > max) max = num;
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter n: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        for(int i = 0; i < n; i++)
	            arr[i] = sc.nextInt();

	        System.out.println("The maximum value in the array is: " + findMax(arr));	
		

	}

}
