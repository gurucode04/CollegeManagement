package guru;

import java.lang.*;
import java.util.*;
public class LearnString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Fname:");
		String Fname=sc.nextLine();
		
		System.out.println("Enter the Lname:");
		String Lname=sc.nextLine();
		
		System.out.println("Enter the email:");
		String email=sc.nextLine();
		
		System.out.println("Full name with email:"+Fname+Lname+" "+"email:"+email);
		
		String Welcome = "Welcome "+ Fname + " "+ Lname+ " "+"Your email is "+ email;
		String Welcome2 = "Welcome, ".concat(Fname).concat(" ").concat(Lname);
		
		System.out.println(Welcome);
		System.out.println(Welcome2);		

	}

}
