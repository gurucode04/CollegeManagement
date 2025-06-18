package Collections;
import java.util.*;
public class Emailset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> emails = new HashSet<>();
		emails.add("user1@example.com");
		emails.add("user2@example.com");
		emails.add("user1@example.com");//Duplicate won't be added
		
		System.out.println("Registered Emails: "+ emails);
	}

}
