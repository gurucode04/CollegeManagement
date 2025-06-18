package Work;
import java.util.*;
public class SumofLeaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        if(n == 0) {
            System.out.println(-1);
            return;
        }

        int maxRight = arr[n-1];
        int sum = maxRight;

        for(int i = n - 2; i >= 0; i--) {
            if(arr[i] > maxRight) {
                sum += arr[i];
                maxRight = arr[i];
            }
        }

        System.out.println(sum);

	}

}
