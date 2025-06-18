package Work;
import java.util.*;
public class MaxElement {
	public static int findMaximum(int[] array) {
        int max = array[0];
        for (int val : array) {
            if (val > max)
                max = val;
        }
        return max;
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

        System.out.println(findMaximum(array));

	}

}
