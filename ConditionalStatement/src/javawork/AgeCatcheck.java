package javawork;
import java.util.*;
public class AgeCatcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = in.nextInt();
		if(age<13) {
			System.out.println("Child");
		}
		else if(age>=13 && age<=19) {
			System.out.println("Teen");
		}else {
			System.out.println("Adult");
		}
	}

}
