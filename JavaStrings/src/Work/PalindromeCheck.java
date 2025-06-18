package Work;
import java.util.*;
public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = in.nextLine();
		
		//String input = "A man a plan a canal Panama";
		String cleaned = input.replaceAll("\\s+", "").toLowerCase();
		
		StringBuilder reversed = new StringBuilder(cleaned).reverse();
		
		if(cleaned.equals(reversed.toString())) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}

	}

}
