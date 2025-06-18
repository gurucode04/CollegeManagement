package Work;
import java.util.*;
public class Sort2DArrayByRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m: ");
        int m = sc.nextInt();
		System.out.println("Enter n: ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();

        for(int i = 0; i < m; i++) {
            Arrays.sort(arr[i]);
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }

	}

}
