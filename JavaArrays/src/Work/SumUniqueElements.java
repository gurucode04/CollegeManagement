package Work;
import java.util.*;
public class SumUniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        Map<Integer, Integer> freq = new HashMap<>();

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        int sum = 0;
        for(int key : freq.keySet()) {
            if(freq.get(key) == 1)
                sum += key;
        }

        System.out.println(sum);

	}

}
