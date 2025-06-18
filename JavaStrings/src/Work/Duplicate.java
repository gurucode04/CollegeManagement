package Work;
import java.util.*;
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =  new Scanner(System.in);
		System.out.println("Enter the string");
		String input = in.nextLine();
		 
		//String input = "programming";
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];

        for (char ch : input.toCharArray()) {
            if (!seen[ch]) {
                result.append(ch);
                seen[ch] = true;
            }
        }

        System.out.println(result.toString());

	}

}
