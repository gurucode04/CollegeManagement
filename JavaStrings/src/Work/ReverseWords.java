package Work;
import java.util.*;
public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = in.nextLine();
		 //String input = "Coding is fun";
	        String[] words = input.split("\\s+");

	        StringBuilder result = new StringBuilder();
	        for (int i = words.length - 1; i >= 0; i--) {
	            result.append(words[i]);
	            if (i != 0) result.append(" ");
	        }

	        System.out.println(result.toString());

	}

}
