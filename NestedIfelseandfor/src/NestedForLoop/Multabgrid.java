package NestedForLoop;
import java.util.*;
public class Multabgrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = in.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i*j+" ");
			}System.out.println();
		}
	}

}
