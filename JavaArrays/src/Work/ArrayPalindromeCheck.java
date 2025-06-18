package Work;
import java.util.*;
public class ArrayPalindromeCheck {
	public static boolean isPalindrome(int[] array) {
        int i = 0, j = array.length - 1;
        while (i < j) {
            if (array[i] != array[j]) return false;
            i++;
            j--;
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n: ");
        int n = sc.nextInt();
        System.out.println("Enter the array: ");
        int[] array = new int[n];

        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();

        System.out.println(isPalindrome(array));

	}

}
