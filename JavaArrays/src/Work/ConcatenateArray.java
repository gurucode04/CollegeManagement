package Work;
import java.util.*;
public class ConcatenateArray {
	public static int[] concatenateArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        for(int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        System.out.println("Enter n2: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        for(int i = 0; i < n2; i++)
            b[i] = sc.nextInt();

        int[] result = concatenateArrays(a, b);
        for(int val : result)
            System.out.print(val + " ");

	}

}
