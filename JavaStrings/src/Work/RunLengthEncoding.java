package Work;
import java.util.*;
public class RunLengthEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string:");
		String input = in.nextLine();
		//String input = "aaabbc";
        StringBuilder result = new StringBuilder();

        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                result.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        result.append(input.charAt(input.length() - 1)).append(count);
        System.out.println(result.toString());

	}

}