package Javawork;
import java.util.*;
public class CountFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int count=0;
		System.out.println("Enter the n: ");
		int n = in.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i == 0) {
				count++;
			}
		}
		System.out.println(count);

	}

}
