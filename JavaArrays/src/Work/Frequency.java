package Work;
import java.util.*;
public class Frequency {
	public static int countFrequency(int[] array, int target) {
        int count = 0;
        for (int val : array)
            if (val == target)
                count++;
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();

        int target = sc.nextInt();
        System.out.println(countFrequency(array, target));

	}

}
